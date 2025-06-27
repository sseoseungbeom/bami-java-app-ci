
FROM eclipse-temurin:21-jre-alpine

# 2. JAR 파일을 컨테이너로 복사
ARG JAR_FILE=build/libs/example-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 3. 포트 노출 (Spring Boot 기본 포트)
EXPOSE 8080

# 4. 실행 명령
ENTRYPOINT ["java", "-jar", "/app.jar"]
