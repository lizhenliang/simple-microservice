FROM lizhenliang/java:8-jdk-alpine
LABEL maintainer www.ctnrs.com
COPY ./target/stock-service-biz.jar ./
COPY skywalking /skywalking
EXPOSE 8030
CMD java -jar -javaagent:/skywalking/skywalking-agent.jar=agent.service_name=ms-stock,agent.instance_name=$(echo $HOSTNAME | awk -F- '{print $1"-"$NF}'),collector.backend_service=192.168.31.90:11800 /stock-service-biz.jar
