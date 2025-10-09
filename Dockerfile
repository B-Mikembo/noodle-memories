FROM openjdk:25-slim AS build
COPY . /code/app/
WORKDIR /code/app/
RUN chmod +x mvnw \
    && ./mvnw package -B \
    -DskipTests \
    -Dmaven.javadoc.skip=true \
    -Dmaven.source.skip \
    -Ddevelocity.cache.remote.enabled=false \
    && mv /code/app/target/*-exec.jar /code/noodle-memories.jar

FROM openjdk:25-slim
COPY --from=build /code/*.jar /code/
RUN \
  groupadd noodle-memories && \
  useradd noodle-memories -s /bin/bash -m -g noodle-memories -G sudo && \
  echo 'noodle-memories:noodle-memories'|chpasswd

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
  JAVA_OPTS="" \
  NOODLE_MEMORIES_FORCED_PROJECT_FOLDER=/tmp/noodle-memories

USER noodle-memories
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/code/noodle-memories.jar"]
EXPOSE 1339
