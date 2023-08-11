FROM nginx:1.22.0

###############################################################
# Dockerfile to build java container images
# Based on openjdk:11-jre-slim-buster
###############################################################
MAINTAINER Pro-dhg hg.duan@dhg.com

COPY ./openjdk-11 /opt/
COPY ./back-1.0.0-SNAPSHOP.jar /opt/
COPY ./dist /opt/
COPY ./start.sh /opt/

EXPOSE 9520

ENTRYPOINT ["/bin/bash","/opt/start.sh"]