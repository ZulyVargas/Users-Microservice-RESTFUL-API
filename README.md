# Users-Microservice-RESTFUL-API


In this practice a level 2 Users Microservice RESTFUL API is realized. 

IETI - LAB01

2022-2.


## Development

The steps described in the following tutorial were implemented (Part 1):

[spring-boot-rest-api | Users ](https://github.com/CAPJackie/spring-boot-rest-api.git)

#### Project structure

![](/img/estructure.png)

### Prerequisites


* [Gradle](https://gradle.org) - Management tool used for projects build, dependency and documentation. 
* [Java ](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html)     - Programming language and computing platform.


### Installing

To download the project run:

  ```bash
    git clone https://github.com/ZulyVargas/Users-Microservice-RESTFUL-API.git
  ```

Run in Users-Microservice-RESTFUL-API:

```bash
    gradle build
    gradlew bootRun
```

***Example***

![](/img/run.png)

## Running the tests

Each API endpoint was tested with the INSOMNIA tool.

1. (GET) /api/v1/users/  getAll():

![](/img/getAll.png)

When the application is started for the first time, there are no users saved yet. 

2. (POST) /api/v1/users/ create():

![](/img/create.png)


3. (GET)  /api/v1/users/{id} findById():

![](/img/getById.png)


4. (PUT) /api/v1/users/{id} update():


Updating the user with id 0001.

![](/img/put.png)


5. (GET) /api/v1/users getAll() again with more users:

![](/img/getTwo.png)


6. (DELETE) /api/v1/users/{id}

Deleting the user with id 0001.

![](/img/delete.png)

After:

![](/img/getAfterDelete.png)

## Built With

* [IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html) - Integrated development environment written in Java for developing computer software.
* [Gradle](https://gradle.org) - Management tool used for projects build, dependency and documentation.
* [Java ](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html)     - Programming language and computing platform.


## Authors

* **Zuly Valentina Vargas Ramírez** 