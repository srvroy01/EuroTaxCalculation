# EuroTaxCalculation

INTRODUCTION
------------

Thank you for downloading the EuroTaxCalculation.  This Sample Java Drools Kie Integration project contains code designed
to create a rule engine for Belgium and Germany tax calculations having individual rule files. 

FUTURE SCOPE: The project can be used to extend with any number of countries for calculating their indivdual tax rates having individual rule files with a single rule engine. There is also scope to convert this entire project easily into a JBPM project or deploy it as web service using REST or in a webserver such as JBoss, Wildfly or Tomcat. This can be done directly from the eclipse IDE.

There is also scope to wrap this entire project with Junit test suite.

REQUIREMENTS
------------

JDK 1.8
Eclipse IDE(latest version with Maven and drools plugins)
Apache Maven Plugin 3.5.x
Drools 7.x 


CONTENTS
--------

This sample zip contains:

    /readme.txt - this file
    /kmodule.xml - this is the main configuration file for the rule engine service which dynamically creates rule engine instances to be used by drool files
    *.drl - Drools files containing tax rules for corresponding European countries.
    /pom.properties - external property file for setting the project artifact and version number. The file is used by the rule engine at the runtime
    /lib - contains all dependent jar files downloaded from maven repo to run the sample
    /src - java code to execute the project
    /.classpath & .project - project files for eclipse

DOCUMENTATION & SUPPORT
-----------------------


PRE-REQUISITES
--------------

The following are pre-requisites to successfully run the sample code:

1. Java 1.5 or above along with Eclipse IDE with maven plugin needs to be installed
2. Apache Maven plugin for eclispe
3. Drools Plugin for eclipse.

RUNNING THE EXAMPLE
-------------------

1. Unzip the files EuroTaxCalculation.zip file to a folder on you hard drive.  
2. After opening eclipse, import the codebase in Eclipse as "Import existing Maven Project"
3. Click on Windows->Preferences Tab, click on Maven-> User Settings and check whether settings.xml is configured to the Maven local repository.
4. Refresh the project and run 'mvn clean install' either from the Eclipse IDE or from the command line. This will build and compile all the java classes. Wait till it shows " Build Success' on the console.
5. Finally after sucessful maven compile, right click on the project folder EuroTaxCalculation and click on 'Run as java application'to see the output
6.Numeric options will come to select the corresponding tax calculation for each country. Select the corresposnding option to ge the output tax percentage for the country.


COMPILING THE EXAMPLE
--------------------- 

Run 'mvn clean install' either from the Eclipse IDE or from the command line. This will build and compile all the java classes. Wait till it shows " Build Success' on the console.

DEBUGGING THE EXAMPLE IN ECLIPSE IDE
---------------------
1. From the command line, run "ant setup" to generate the Java stubs. 
2. Load the project into Eclipse.  
a) Copy the unzipped folder into your Eclipse workspace
b) In Eclipse, Import: 
- File -> Import ->Import existing Maven Project
- Enter project name, and point the project's root folder to the unzipped folder's location
- Click 'Next'
- Click 'Finish'
3. Create a Run/Debug Configuraiton for TaxCalculationEngine.java by putting a breakpoint in any line of the class
c) Navigate to src/main/java , and navigate to com.sample.EuroTaxCalculation. TaxCalculationEngine.java and right click to select "Run As => Run Configurations".  Click on "Arguments" tab, and specify the VM parameters as: 
  -Dtest.properties=./test.properties
  
