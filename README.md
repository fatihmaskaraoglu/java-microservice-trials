# java-microservice-trials


> With Spring Cloud Config Server:

![image](https://github.com/fatihmaskaraoglu/java-microservice-trials/assets/8976615/23c8b8f0-9dc2-42bc-b89b-0b30d63956c0)



> Application get limits from config server

![image](https://github.com/fatihmaskaraoglu/java-microservice-trials/assets/8976615/4bbe3054-94f1-49e7-92c7-001f1b018803)


> With profile settings application take dev configs:

![image](https://github.com/fatihmaskaraoglu/java-microservice-trials/assets/8976615/25fb1c78-56f1-4e9b-900f-70aa78bed3c1)



> Eureka Naming Server:

![image](https://github.com/fatihmaskaraoglu/java-microservice-trials/assets/8976615/6320a30f-7004-49da-84ea-e10c5a0b907e)



> Response with load balancer:

![image](https://github.com/fatihmaskaraoglu/java-microservice-trials/assets/8976615/18ed4830-9217-475e-8340-b2bd794745b8)



> With Logger:

![image](https://github.com/fatihmaskaraoglu/java-microservice-trials/assets/8976615/82800e68-6d63-47c5-ac14-1a6a4dd505a3)



> Circuit Breaker

https://resilience4j.readme.io/docs/circuitbreaker


> Rate Limiter

Controller :

@RateLimiter(name = "default")

Properties:

resilience4j.ratelimiter.instances.default.limitForPeriod=2
resilience4j.ratelimiter.instances.default.limitRefreshPeriod=10s

Response for 3. call in 10s:

This application has no explicit mapping for /error, so you are seeing this as a fallback.

Tue Jun 20 21:13:45 TRT 2023
There was an unexpected error (type=Internal Server Error, status=500).
RateLimiter 'default' does not permit further calls
io.github.resilience4j.ratelimiter.RequestNotPermitted: RateLimiter 'default' does not permit further calls
