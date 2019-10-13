FROM maven:3.6.2-jdk-11 AS build-env
WORKDIR /app
COPY . /app
RUN mvn package
 
FROM tomcat:9.0.27-jdk11-openjdk
RUN rm -rf /usr/local/tomcat/webapps/ROOT
COPY --from=build-env /app/target/*.war /usr/local/tomcat/webapps/ROOT.war
