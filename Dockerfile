# === Build Stage ===
FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# === Run Stage ===
# 修正箇所：openjdk ではなく eclipse-temurin を使用します
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# 成果物のコピー（名前が一致するように注意）
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]