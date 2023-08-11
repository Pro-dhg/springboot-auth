#!/bin/bash
echo "启动前端"
nginx -c /etc/nginx/nginx.conf

echo "启动后端"
/opt/openjdk-11/bin/java -jar /opt/back-1.0.0-SNAPSHOP.jar

echo "启动完毕"