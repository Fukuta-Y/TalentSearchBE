# === Build Stage ===
FROM gradle:8.5-jdk17 AS build
WORKDIR /app

# 依存関係のキャッシュを有効にするため、先に設定ファイルだけコピーしてビルド
COPY build.gradle settings.gradle /app/
COPY src /app/src

# 実行可能なJAR（bootJar）のみをビルドし、テストはスキップ
RUN gradle clean bootJar -x test

# === Run Stage ===
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Step 7: 複数のファイルがヒットしないよう、
# bootJarタスクで生成された実行可能JARのみを一意に指定してコピー
COPY --from=build /app/build/libs/*[!plain].jar app.jar

# Cloud Runのデフォルトポート
EXPOSE 8080

# メモリ制限（無料枠を意識）を追加して実行
ENTRYPOINT ["java", "-Xmx512m", "-jar", "app.jar"]
