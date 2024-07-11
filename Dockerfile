FROM openjdk:17-oracle
WORKDIR /app
COPY dock-test/target/dock-test-0.0.1-SNAPSHOT.jar hello.jar
ENTRYPOINT ["java","-jar","hello.jar"]