FROM eclipse-temurin:17-jdk

COPY target/proj32.jar /app/user/

WORKDIR /user/app/

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "proj32.jar" ]