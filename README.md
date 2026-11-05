# sample-sb-3-5-with-commons-dbcp2

Saves and lists reminders on a pooled data source.

## Stack

- Spring Boot 3.5.16
- Java 21
- Gradle 8.14.5
- Commons DBCP2 2.13.0

## Build

```
./gradlew build
```

## Run

```
./gradlew bootRun
```

```
curl -X POST 'localhost:8080/reminders?message=call%20mom'
curl localhost:8080/reminders
```
