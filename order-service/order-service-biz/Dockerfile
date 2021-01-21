FROM lizhenliang/java:8-jdk-alpine
LABEL maintainer www.ctnrs.com
COPY ./target/order-service-biz.jar ./
COPY skywalking /skywalking
EXPOSE 8020
CMD java -jar -javaagent:/skywalking/skywalking-agent.jar=agent.service_name=ms-order,agent.instance_name=$(echo $HOSTNAME | awk -F- '{print $1"-"$NF}'),collector.backend_service=192.168.31.90:11800 /order-service-biz.jar
