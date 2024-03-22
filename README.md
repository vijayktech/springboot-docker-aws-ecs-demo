# Demo for AWS ECS deployment 

## Flow of application
![image](https://github.com/vijayktech/springboot-docker-aws-ecs-demo/assets/143890916/4f12f58e-eb84-430a-9084-0c14f65cab40)


Build Docker image
```
  docker build -t springboot-docker-aws-ecs-demo:1.0 .
```

Build the image using Docker Hub Id
```
docker build -t <your-docker-hub-id>/springboot-docker-aws-ecs-demo:1.0 .
```
### my docker hub id 
```
docker build -t vijaytechgeek011/springboot-docker-aws-ecs-demo:1.0 .
```
## ECS configuration 
https://www.youtube.com/watch?v=z7_LdCVnCRU&list=PLVz2XdJiJQxxurKT1Dqz6rmiMuZNdClqv&index=16 

Steps 
1. Create a Task defination
   Select FARGET as provider
   Provide image name
   default roles

2. Create a Cluster with default
3. Attach Task definitaion the above to Cluster
   Create Security group and allow all traffic




   
