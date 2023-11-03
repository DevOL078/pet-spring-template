# Spring Boot microservice template

### Usage: you can use this project for fast creating new Spring Boot microservice.

    git clone https://github.com/DevOL078/pet-spring-template.git
    cd pet-spring-template
    rm -f -r .git

The service has one endpoint _/dummy_, which returns body "DUMMY" for demonstrating the sample controller.

### Run PostgreSQL and PgAdmin (docker)

    cd ./infra
    docker-compose up -d

### Run application (using gradlew)

    ./gradlew bootRun

### Run tests

    ./gradlew test

### TODO

- Run application in docker