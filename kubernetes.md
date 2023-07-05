```
C:\Users\fatih>kubectl create deployment hello-world-rest-api --image=fatihmas/myapp/hello-world-rest-api:0.0.1.RELEASE
C:\Users\fatih>kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080

//for 3 instance always running
C:\Users\fatih>kubectl scale deployment hello-world-rest-api --replicas=3

//try to delete a pod kubernete will keep 3 instance with one new instance
C:\Users\fatih>kubectl delete pod hello-world-rest-api-58ff5dd898

// autoscale for load 
C:\Users\fatih>kubectl autoscale deployment hello-world-rest-api --max=10 --cpu-percent=70

//for editing app settings
C:\Users\fatih>kubectl edit deployment hello-world-rest-api

//deploy a new image with zero down time
C:\Users\fatih>kubectl set iamge deploymen hello-world-rest-api hello-world-rest-api=fatihmas/myapp/hello-world-rest-api:0.0.2.RELEASE

```
