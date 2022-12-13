FROM openjdk:11
COPY build/libs/*.jar testService.jar
ENTRYPOINT ["java","-jar","/testService.jar"]