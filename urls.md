Currency Exchange Service:
http://localhost:8000/currency-exchange/from/USD/to/TL

http://localhost:8000/currency-exchange/from/EUR/to/TL

http://localhost:8000/currency-exchange/from/AUD/to/TL

http://localhost:8100/currency-conversion/from/USD/to/TL/quantity/10



eureka:
http://localhost:8761/

api-gateway:
http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/TL

api-gateway lower case:
spring.cloud.gateway.discovery.locator.lowerCaseServiceId=true
http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/TL


http://localhost:8765/currency-exchange/from/USD/to/TL