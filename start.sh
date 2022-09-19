#!/usr/bin/zsh

set -eu

docker compose -f docker-compose.yml down

mvn clean package

docker compose -f docker-compose.yml up