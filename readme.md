# Book Store REST API

### Available Endpoints

    GET /micro/resources/book/all
#####
    GET /micro/resources/book/{id}
#####
    POST GET /micro/resources/book
#####
    DELETE /micro/resources/book/{id}
#####
    PUT /micro/resources/book/{id}

### RUN GUIDE

Build the project using

    mvn clean install

Now, start the Payara Server using Docker

<p style="font-size: 0.95rem; font-style: italic; color: #ffff77;">if are not use docker, use glassfish server or payara server</p> 

Step 1:

    docker build -t airhacks/micro .

Step 2:

    docker run -d -p 8585:8080 -p 4848:4848 --name macro airhacks/micro

Application is running on port: 8585

Payara admin panel is running on port:4848

if another service is running on port 4848, kill that service by,

    sudo kill -9 $(sudo lsof -t -i:4848)