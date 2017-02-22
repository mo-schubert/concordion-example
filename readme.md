# Spec-for-example implementation using Concordion

This is a project to try out spec-by-example using [concordion](http://concordion.org)

##Description

Currently this project contains two examples:

* A basic calculator
* The discount calculation for the registration of a training course

## How the work has been done

1. Discussing & documenting: First the specification was written. This was done using the method [Example Mapping](https://cucumber.io/blog/2015/12/08/example-mapping-introduction). The specification can be find in the package src/test/resources.
2. Instrumenting: For each specification a fixture class was created. This fixture class has been used to execute the tests
3. Coding: Based on the tests the implementation was changed in order to meet the specification.

##The implementation

* The game is implemented in Java 8.
* The project is set up as a Maven project.
* This project is using [concordion](http://concordion.org) for the specification and the acceptance tests

## How to use this example

* Import the project into your IDE
* Execute the tests in the folder src/test/java and check if they are successful
* Concordion also an html page for each specification including the results. The following image shows the page. If you take a closer look at the screenshot, you will see that the last test fails.

![screenshot](https://github.com/mo-schubert/concordion-example/blob/master/doc/images/screenshot-calculator-spec.PNG)
