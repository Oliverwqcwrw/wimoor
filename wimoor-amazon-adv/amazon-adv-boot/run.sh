#!/bin/sh

VERSION=v1
if [ -n "$1" ] ;then
  VERSION="$1"
fi
sed -i "s|aolifu/amazon-adv-boot:.*|aolifu/amazon-adv-boot:$VERSION|g" ./docker-compose.yml
docker-compose up -d

