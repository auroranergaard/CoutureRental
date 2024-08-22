# IT1901 - Group 2314

## Description
Couture Rental serves as the internal system for a dress rental website. The primary objective of this application is to ensure a well-organized website, providing a comprehensive view of the current availability and rental status of dresses.

## Developer Information
Developed by:
- Lotte Kvalheim
- Aurora Nergaard
- Sara Seeberg-Rommetveit
- Brinje Marie Haugli

## Technology framework
- Maven (3.11.0)
- Java (17.0.5)
- JavaFX (17.0.8)
- Jackson (2.15.0)
- Jacoco (0.8.10)
- CheckStyle (3.1.2)
- SpotBug (4.7.2.1)
- Spring Boot (2.7.17)
- JLink (0.0.8)
- JPackage (1.4.0)

## Directory for the coding project

We have split our coding into four folders:

### core
[core](/CoutureRental/core/src/) includes our Dress and Dresses classes.

Further it includes a [test folder](/CoutureRental/core/src/test/java/core/), which includes two tests.

### ui
[ui](/CoutureRental/ui/src/main/) includes the app and controller. As well as a fxml file under [resources](/CoutureRental/ui/src/main/resources/ui/).

Further it includes a [test folder](/CoutureRental/ui/src/test/java/ui/), which includes two tests.


### persistence
[persistence](/CoutureRental/persistence/src/main/java) includes our file storage.

Further it includes a [test folder](/CoutureRental/persistence/src/test/java/persistence).

### rest
[rest](/CoutureRental/rest/src/main/java/) includes API server. To read more about how the API works, click [here](/CoutureRental/rest/README.md).


To read more about how the application works click [here](/CoutureRental/README.md).

## Running the application
To be able to run the application it is essential to have Maven installed, enabling the use of the `mvn` command within the terminal.
If Maven is not installed on your computer you can install it by writing `brew install maven` in your terminal.


### Using `mvn`
```shell
# Navigates you to the CoutureRental directory
cd CoutureRental

# Compiles the source code of the project
mvn compile

# Compiles, packages, and installs the Maven project, making it available for use in other local Maven projects
mvn clean install

# Navigates you to the ui directory
cd ui

# To run the application
mvn javafx:run

```

### Using `Spring Boot`


```shell
cd CoutureRental/rest

mvn spring-boot:run

# Open new terminal to run the application, by following the steps on how to use mvn.

# To kill server after usage click option + C
```

### Using Eclipse Che
To be able to open and run mvn in Eclipse Che, follow these steps:

[Click here](https://che.stud.ntnu.no/#https://gitlab.stud.idi.ntnu.no/it1901/groups-2023/gr2314/gr2314?new) to open the project in Eclipse Che.

``` shell
# Download skd man in your terminal
curl -s "https://get.sdkman.io" | bash

# Open Eclipse Che and write the following
sdk help

# Then, write the following
sdk install java 17.0.0-tem

# You can now run the application with mvn
1 cd CoutureRental
2. mvn clean install -DskipTests
3. cd rest
4. mvn spring-boot:run
5. open a new terminal and write cd CoutureRental/ui
6. copy the "6080-tcp-desktop-ui" endpoint and paste in a new webpage
7. mvn spotbugs:check
8. mvn clean install in your new terminal

You will now be able to run the application in Eclipse Che and wiev the display in the other webpage.

```

### Using Jlink and Jpackage
To be able to run jlink and jpackage in your terminal in your IDE(Integrated development environment), follow these steps:
``` shell

1. Have springboot up and running
2. cd ui (make sure you are in a new terminal)
3. mvn javafx:jlink
4. mvn jpackage:jpackage
Now you should have the file under ui/target/dist
5. Open this file in fileexplorer
6. Open/run this file. You sholud now have CoutureRentalfx downloaded on your computer
7. Open the app