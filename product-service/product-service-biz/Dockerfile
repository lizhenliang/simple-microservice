FROM lizhenliang/java:8-jdk-alpine
LABEL maintainer www.ctnrs.com
COPY ./target/product-service-biz.jar ./
COPY skywalking /skywalking
EXPOSE 8010
CMD java -jar -javaagent:/skywalking/skywalking-agent.jar=agent.service_name=ms-product,agent.instance_name=$(echo $HOSTNAME | awk -F- '{print $1"-"$NF}'),collector.backend_service=192.168.31.90:11800 /product-service-biz.jar
