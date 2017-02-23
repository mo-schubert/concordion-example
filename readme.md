# Spec-for-example with Concordion

This is a project to try out spec-by-example using [concordion](http://concordion.org)

##Description

Currently this project contains two examples:

* A basic calculator with a specification in English
* The discount calculation for the registration of a training course with a specification in German

## How the work has been done

You are wondering what steps I took in order to create the examples? Basically the examples were created using the following three steps:

**STEP 1: Discussing & documenting:**
In the first step, I specified the feature and added some basic business rules. Based on this I tried to find some examples using the method [Example Mapping](https://cucumber.io/blog/2015/12/08/example-mapping-introduction). I added these examples to the specification (see src/test/resources). For example:

    99 + 1 = 100

**STEP 2: Instrumenting:**
Based on the specification I created a fixture class for the example. This class is the connection between the specification and the system. The methods in the fixture class can be called by annotations in the specification file. In the specification file of the calculator you can find the following line:

    [99](- "#firstvalue") + [1](- "#secondvalue") = [100.0](- "?=add(#firstvalue, #secondvalue)")


You instantly see the annotations. Maybe you are also wondering why I changed the value of 100 to 100.0. The reason is that the "add"-method returns a double value. Concordion interprets the number 100 as an integer and so a test would fail. 

While instrumenting the specification, try to keep the fixture class stable.

**STEP 3: Coding:**
My final step was to implement the system according the specification in way that they meet the test criteria.

## Notes about the implementation

* The game is implemented in Java 8.
* The project is set up as a Maven project.
* This project is using [concordion](http://concordion.org) for the specification and the acceptance tests

## How to use this example

* Import the project into your IDE
* Execute the tests in the folder src/test/java and check if they are successful
* Concordion creates a html page for each specification including the results. The following image shows the page for the calculator specification. If you take a closer look at the screenshot, you will see that the last test fails.

***

![screenshot](https://github.com/mo-schubert/concordion-example/blob/master/doc/images/screenshot-calculator-spec.PNG)

***
