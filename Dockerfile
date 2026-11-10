# Tầng 1: Dùng Maven để build mã nguồn Java thành file ROOT.war
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Tầng 2: Chạy file ROOT.war trên máy chủ Apache Tomcat (Hỗ trợ Jakarta Servlet)
FROM tomcat:10.1-jdk17-temurin
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=build /app/target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]