FROM lizhenliang/java:8-jdk-alpine
LABEL maintainer www.ctnrs.com
RUN  sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories && \
     apk add -U tzdata && \
     ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
COPY ./target/eureka-service.jar ./
COPY skywalking /skywalking
EXPOSE 8888
CMD java -jar -javaagent:/skywalking/skywalking-agent.jar=agent.service_name=ms-eureka,agent.instance_name=$(echo $HOSTNAME | awk -F- '{print $1"-"$NF}'),collector.backend_service=192.168.31.90:11800 -Deureka.instance.hostname=${MY_POD_NAME}.eureka.ms /eureka-service.jar
