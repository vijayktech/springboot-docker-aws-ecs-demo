FROM openjdk:17-alpine

EXPOSE 8080

COPY ./target/springboot-docker-aws-ecs-demo.jar springboot-docker-aws-ecs-demo.jar

ENTRYPOINT ["java", "-jar", "/springboot-docker-aws-ecs-demo.jar"]