FROM  openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY target/Histirix-dashboard-server-0.0.1-SNAPSHOT.jar Histirix-dashboard-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Histirix-dashboard-server-0.0.1-SNAPSHOT.jar"]