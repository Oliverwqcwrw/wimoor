#!/bin/sh

VERSION=v1
if [ -n "$1" ] ;then
  VERSION="$1"
fi
sed -i "s|wimoor/wimoor-gateway:.*|wimoor/wimoor-gateway:$VERSION|g" ./docker-compose.yml
docker-compose up -d

