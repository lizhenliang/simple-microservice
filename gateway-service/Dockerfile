FROM lizhenliang/java:8-jdk-alpine
LABEL maintainer www.aliangedu.cn
RUN  sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories && \
     apk add -U tzdata && \
     ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
COPY ./target/gateway-service.jar ./
COPY skywalking /skywalking
EXPOSE 9999
CMD java -jar -javaagent:/skywalking/skywalking-agent.jar=agent.service_name=ms-gateway,agent.instance_name=$(echo $HOSTNAME | awk -F- '{print $1"-"$NF}'),collector.backend_service=192.168.31.90:11800 /gateway-service.jar
