# 1. Base image 설정
FROM openjdk:17-jdk-slim

# 2. Maintainer 정보 (선택 사항)
LABEL maintainer="yoonxjoong"

# 3. 작업 디렉터리 생성 및 이동
WORKDIR /app

# 4. 빌드 환경에서 생성된 JAR 파일 복사
# Gradle로 빌드된 JAR 파일이 build/libs 디렉터리에 위치합니다.
ARG JAR_FILE=build/libs/user-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} user-service.jar

# 5. 애플리케이션 실행 명령어
ENTRYPOINT ["java", "-jar", "/app/user-service.jar"]
