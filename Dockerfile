FROM openjdk:11
ADD /target/Details-0.0.1-SNAPSHOT.jar details.jar
ENTRYPOINT ["java", "-jar", "details.jar"]