FROM maven:3-jdk-8-alpine
COPY src /home/app/src
COPY pom.xml /home/app
ONBUILD RUN mvn clean install
RUN mvn -f /home/app/pom.xml package
CMD ["java", "-jar", "/home/app/target/kata-pizza-factory-java-1.0-SNAPSHOT.jar"]