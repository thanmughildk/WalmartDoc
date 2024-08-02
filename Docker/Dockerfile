FROM ubuntu:latest
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk && \
    apt-get clean
RUN java -version
WORKDIR /tmp
##COPY /Users/vkp0005/Documents/docker_mnt/*.* /tmp
# RUN javac ReadFileExample.java
# Set the default command to run when starting the container
# CMD ["bash","-c","javac ReadFileExample.java; java ReadFileExample 5"]
CMD ["bash","-c","javac ReadFileExample.java; java ReadFileExample $no_of_time"]