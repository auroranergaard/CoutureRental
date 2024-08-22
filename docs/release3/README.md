# CoutureRental release 3

In this release we have futher developed our application with more functionality with corresponding JavaFX scenes. As well as building a `REST-API` with `Spring Boot`. We remained committed to our Git workflow while also upholding strong teamwork throughout the entire duration.

Further we have also integrated feedback from our previous release into this one, and we have implemented `Jlink` and `Jpackage` to make our product shippable.

## Requirements

### REST-API

The system is using the Spring Boot framework to establish a web server featuring a [REST API](/CoutureRental/rest/README.md). Furthermore, Spring Boot integrates seamlessly with Jackson, ensuring an efficient serialization and deserialization processes.

### Client - server - architecture

To ensure that one person is able to run a server, while another person is able to run the client and input the IP address of the other computer. To do this you simply input the IP address of the computer running the server on line 47 in the [RemoteCoutureRentalAccess](/CoutureRental/ui/src/main/java/ui/RemoteCoutureRentalAccess.java), so it is written in this format: `
private static final int DEFAULT_PORT = [your IP-address]+8080;`.

### Testing
We have tested all the modules in our project.

`Core`: We have 100% test coverage.

`Persistence`: We have 88% test coverage, we do not have test files for Serializers and Deserializes as they they are implicitly being tested by the storage test.

`Rest`: We have 94% test coverage.

`UI`: We have 91% test coverage. However we do not have a test file for RemoteCoutureRentalAccess as it is being tested implicitly by the other ui tests.


Overall we have `93%` test coverage.


### Extend functionality

We have now extended the functionality with new scenes and logic. This includes an log in, where you can create a new user and log in to your account.

### Jlink and Jpackage

We have made our product shippable using JLink and JPackage.

### UML diagrams

#### Package Diagram

We have updated the package diagram to include all modules for this release.


![CoutureRental Architecture](/CoutureRental/ui/src/main/resources/pictures/packages.png)


#### Class Diagram
This is a class diagram over the core module, as we consider this an essential part of the functionality in our code.


![Core Architecture](/CoutureRental/ui/src/main/resources/pictures/classDiagramCore.png)

#### Sequence Diagram
This is a sequence diagram that shows the flow of the login process for a user. This includes the GET method from the rest API.

![User Login](/CoutureRental/ui/src/main/resources/pictures/sequenceDiagramGetUser.png)

## Reflection

### Feedback form release 2

We recieved for the most part positive feedback from the previous release, the only note we got was regarding our test coverage. However, we had over 80% test coverage on all our modules and we had on test file for each of the java files. But we have stribed to get as high test coverage as possible for this release.

### Teamwork

In this release, our focus has been on both pair programming and collaborative group work. Our goal has been to ensure that every group member understands all aspects of the application and its underlying code. In release 1 and 2 we coded a lot in the same pairs, so in this release we wanted to focus on changing partners. This was to make sure that everyone got to try different things, as well as taking part in every side in making of the application.

## Other changes

### Mailmap

In our project, we have introduced a .mailmap file to enhance the organization of Git commits. This file plays an important role in structuring and categorizing individual group members' Git contributions. This provides an organized overview of the project's commit history.

### Commit messages

We changed back to writing Co-authored-by: @name, instead of c-a-b: @name int his release as git did not catch out abbreviation. As well as workign harder on the format of our commit messages, which as resulted in a more structured and consistent commit message format.

## Summary
In this release we have learned more about how to set up a Rest API, as well as how the rest server works. We have also learned how to work better as  a team, this includes more pair programming and meetings. As the iteration of the sprint lasted over three weeks we had to discuss how to spend our time properly and plan well ahead. This enabled the team to identify significant challenges in advance and secure solutions according to the plan. Our well-planned time management prevented last-minute challenges so that we could be ready with the product by the delivery date.