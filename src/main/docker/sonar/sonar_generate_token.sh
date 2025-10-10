#!/usr/bin/env bash

until [ "$(curl -s $NOODLE_MEMORIES_SONAR_URL/api/system/status | jq -r .status)" = "UP" ]; do
  sleep 5
done

curl -sS -u admin:admin -X POST \
  "$NOODLE_MEMORIES_SONAR_URL/api/users/change_password" \
  -d "login=admin&previousPassword=admin&password=$NOODLE_MEMRORIES_SONAR_PASSWORD"

SONAR_TOKEN=$(curl -sS -u admin:$NOODLE_MEMRORIES_SONAR_PASSWORD -X POST "$NOODLE_MEMORIES_SONAR_URL/api/user_tokens/generate" -d "name=$NOODLE_MEMORIES_SONAR_TOKENNAME" | jq -r .token)
echo $SONAR_TOKEN
