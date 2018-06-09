This Spring boot app deployment on Docker

Docker needs Dockerfile (mind the name and case).

Go to hub.docker.com to check. It's a repository like mavencentral etc.

FROM - means get the image from docker hub to tell what type of application is this that we want to run on docker

ADD - means add the application jar into the docker container to run (built jar path in application). The second parameter is the path where the docker should copy and deploy the jar file. So we can have something like /tmp/Dockerdemo.jar or just Dockerdemo.jar for coping the file to root.

EXPOSE expose the application to a specific port

ENTRYPOINT - main command to run like java etc. Docker wouldn't know which command to execute to run the app.

We need to deploy the app jar into an docker image and then we need to start that image.

to build an image
docker build -f Dockerfile -t docker-spring-boot .

-f for Dockerfile
-t for tag name

** make sure that you run build command in the same folder which is your application root folder.
* last . (dot) will tell to go and find the app root folder to build the image

docker images  - this command will give the list of images available. run this after the above coomand is completed.

docker run -p 8085:8085 docker-spring-boot

-p for publish the image on the port 8085 

8085:8085 this means that mao the machine's 8085 port to the containers 8085 port since we have mentioned in the Dockerfile that we want to use 8085 port. ** Port may be user specific.

docker-spring-boot is the iamge name given earlier




