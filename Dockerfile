FROM openjdk:21
EXPOSE 8084
ADD target/k8s-demo.jar k8s-demo.jar
ENTRYPOINT ["java","-jar","/k8s-demo.jar"]