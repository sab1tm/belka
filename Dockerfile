FROM openjdk:11
COPY target/Belka-0.0.1-SNAPSHOT.jar Belka.jar
ENV JAR_ARGS="arg1 arg2"
ENV SYS_PROPS="-Dsysprop1=val1 -Dsysprop=val2"
ENTRYPOINT java -jar ${SYS_PROPS} Belka.jar ${JAR_ARGS}

# docker build -t belka .
# docker run belka