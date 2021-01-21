FROM lizhenliang/java:8-jdk-alpine
LABEL maintainer www.ctnrs.com
COPY ./target/portal-service.jar ./
COPY skywalking /skywalking
EXPOSE 8080
CMD java -jar -javaagent:/skywalking/skywalking-agent.jar=agent.service_name=ms-portal,agent.instance_name=$(echo $HOSTNAME | awk -F- '{print $1"-"$NF}'),collector.backend_service=192.168.31.90:11800 /portal-service.jar
