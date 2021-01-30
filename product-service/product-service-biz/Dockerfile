FROM java:8-jdk-alpine
LABEL maintainer www.aliangedu.cn
RUN  sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories && \
     apk add -U tzdata && \
     ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
COPY ./target/product-service-biz.jar ./
EXPOSE 8010
CMD java -jar /product-service-biz.jar
