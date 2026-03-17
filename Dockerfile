# === Build Stage ===
FROM gradle:8.5-jdk17 AS build
WORKDIR /app

# すべての資材（手動コード + git add -f した自動生成コード）をコピー
COPY . .

# 依存関係を解決し、実行可能なJARをビルド
# 既にソースが揃っている前提なので、単純な bootJar タスクを実行
RUN gradle clean bootJar -x test

# === Run Stage ===
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# bootJarで生成された実行可能JARのみをコピー（複数ヒットを回避）
COPY --from=build /app/build/libs/*[!plain].jar app.jar

# Cloud Runのデフォルトポート
EXPOSE 8080

# メモリ制限（512MB〜1GBのインスタンスを想定）
ENTRYPOINT ["java", "-Xmx512m", "-jar", "app.jar"]
