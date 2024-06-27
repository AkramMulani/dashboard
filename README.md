# Dashboard

---

### This is the sample Spring-Boot project for practice purpose.


- We are creating the controllers and rest-controllers
- We will create a react js application to use this controller very well
- We will attach the database to practice CRUD operations.

### Setup

- Clone the repository
    ~~~ bash
    git clone https://github.com/AkramMulani/dashboard
    ~~~

- Set current workdir to project name
    ~~~ bash
    cd dashboard
    ~~~

- Run the following command to install the required dependencies
    ~~~ bash
    mvn clean install
    ~~~

- Run the spring boot project. There are two approaches to run the spring-boot project:

  1. Run following command, this will generate a jar file in the target folder that can be run using `java -jar *.jar` command.
        ~~~ bash
        mvn package
        ~~~
  2. Run following command to directly run the spring-boot project.
        ~~~ bash
        mvn spring-boot:run
        ~~~
