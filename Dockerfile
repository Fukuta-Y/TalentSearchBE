# === Build Stage ===
FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
# キャッシュを効率的に使うため、依存関係の解決とビルドを分けることもありますが、
# シンプルにいくならこのままでOKです。
RUN gradle clean build -x test

# === Run Stage ===
FROM openjdk:17-jdk-slim
WORKDIR /app

# [ポイント1] 
# Gradleのビルド成果物には通常 "-plain.jar" と実行可能な ".jar" の2つができることがあります。
# 確実に実行可能（executable）な方だけをコピーするように指定します。
COPY --from=build /app/build/libs/*-SNAPSHOT.jar app.jar
# ※もしプロジェクト名が固定なら /app/build/libs/your-project-name.jar のように書くのが一番確実です。

# [ポイント2]
# Cloud Runはデフォルトでポート8080を使用しますが、環境変数で変更されることもあるため
# Java実行時にもポートを意識する設定を加えるのが一般的です。
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
