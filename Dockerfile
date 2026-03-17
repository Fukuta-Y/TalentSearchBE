# === Build Stage ===
FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# === Run Stage ===
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# 修正箇所：plainではない、実行可能なJARだけをコピーするように指定
# もしこれでもエラーが出る場合は、/app/build/libs/プロジェクト名-0.0.1-SNAPSHOT.jar のようにフルネームで指定するのが確実です
COPY --from=build /app/build/libs/*[!plain].jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]