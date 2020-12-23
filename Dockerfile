FROM jsurf/rpi-java
ADD target/demo-0.0.1-SNAPSHOT.jar /opt/demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/demo.jar"] 
