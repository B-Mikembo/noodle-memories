FROM ubuntu:24.04
RUN \
  apt update && \
  apt --no-install-recommends install -y curl jq && \
  groupadd noodle-memories && \
  useradd noodle-memories -s /bin/bash -m -g noodle-memories -G sudo && \
  echo 'noodle-memories:noodle-memories'|chpasswd && \
  apt clean
ENV \
  NOODLE_MEMORIES_SONAR_URL=http://sonar:9000 \
  NOODLE_MEMORIES_SONAR_PASSWORD=Noodle-Memories-1339-Project \
  NOODLE_MEMORIES_SONAR_TOKENNAME=noodlememoriestoken
COPY sonar/sonar_generate_token.sh /usr/local/bin/sonar_generate_token
RUN chmod 755 /usr/local/bin/sonar_generate_token
USER noodle-memories
CMD ["sonar_generate_token"]
