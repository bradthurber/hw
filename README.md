[![Stories in Ready](https://badge.waffle.io/bradthurber/hw.svg?label=ready&title=Ready)](http://waffle.io/bradthurber/hw)
some more edits whee

helloworld-html5: HTML5 + REST Hello World Example 
===================
Author: Jay Balunas, Burr Sutter, Douglas Campos, Bruno Olivera
Level: Beginner
Technologies: CDI, JAX-RS, HTML5
Summary: Basic HTML5 |Demonstrates the use of CDI 1.1 and JAX-RS using the HTML5 architecture and RESTful services on the backend
Target Product: WFK
Source: <https://github.com/wildfly/quickstart/>

What is it?
-----------

This example demonstrates the use of *CDI 1.1* and *JAX-RS* in *JBoss WildFly* using the HTML5 + REST architecture.
The application is basically a smart, HTML5+CSS3+JavaScript front-end using RESTful services on the backend.

The example can be deployed using Maven from the command line or from Eclipse using JBoss Tools.

System requirements
-------------------

All you need to build this project is Java 7.0 (Java SDK 1.7) or better, Maven
3.0 or better.

The application this project produces is designed to be run on JBoss WildFly.

An HTML5 compatible browser such as Chrome, Safari 5+, Firefox 5+, or IE 9+ are
required.

With the prerequisites out of the way, you're ready to build and deploy.

Deploying the application
-------------------------

### Deploying locally

First you need to start the JBoss container. To do this, run

    $JBOSS_HOME/bin/standalone.sh

or if you are using windows

    $JBOSS_HOME/bin/standalone.bat

To deploy the application, you first need to produce the archive to deploy using
the following Maven goal:

    mvn package

You can now deploy the artifact by executing the following command:

    mvn wildfly:deploy

This will deploy both the client and service applications.

The application will be running at the following URL <http://localhost:8080/wildfly-helloworld-html5/>.

To undeploy run this command:

    mvn wildfly:undeploy

You can also start the JBoss container and deploy the project using JBoss Tools. See the
<a href="https://github.com/wildfly/quickstart/guide/Introduction/" title="Getting Started Developing Applications Guide">Getting Started Developing Applications Guide</a>
for more information.

Importing the project into an IDE
=================================

Detailed instructions for using Eclipse / JBoss Tools with are provided in the
<a href="https://github.com/wildfly/quickstart/guide/Introduction/" title="Getting Started Developing Applications Guide">Getting Started Developing Applications Guide</a>.

If you created the project from the commandline using archetype:generate, then
you need to import the project into your IDE. If you are using NetBeans 6.8 or
IntelliJ IDEA 9, then all you have to do is open the project as an existing
project. Both of these IDEs recognize Maven projects natively.

Downloading the sources and Javadocs
====================================

If you want to be able to debug into the source code or look at the Javadocs
of any library in the project, you can run either of the following two
commands to pull them into your local repository. The IDE should then detect
them.

    mvn dependency:sources
    mvn dependency:resolve -Dclassifier=javadoc

Development notes
=================

You can test the REST endpoint using the following URL
[http://localhost:8080/\<artifactId>/hello/json/David/]("http://localhost:8080/<artifactId>/hello/json/David/").

HelloWorld.java - establishes the RESTful endpoints using JAX-RS

Web.xml - maps RESTful endpoints to "/hello"

index.html - is a jQuery augmented plain old HTML5 web page

Copyright headers
-----------------

To update the copyright headers, just run `mvn license:format -Dyear=<current year>`


