FROM amazoncorretto:11

MAINTAINER renzorojas

COPY target/BackProyect-0.0.1-SNAPSHOT.jar BackProyect-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","BackProyect-0.0.1-SNAPSHOT.jar"]