# SauceDemo


**Things to know about SauceDemo project**

SauceDemo Project is a UI Test Automation Framework build using TestNG Framework.
It run the Automation on Chrome browser only. But can be upgraded as per needs or Requirement
It contains a Data.properties file to provide your input such as Login Username, password etc

**Pre-Requisite:**
1. This project is build using Mac OS so to run the project you would need a Mac OS system. This the because the chromedriver which is being used is compatible with Mac OS.

2. It Requires Chrome version 107 to run the Automation as we are using chromedriver 107

3. To Run it using terminal you must have Apache Maven Installed

4. If it gives the error “Error: chromedriver” cannot be opened because the developer cannot be verified. Unable to launch the chrome browser”
   when you execute the script for the first time then perform below steps
      1. Go to Terminal 
      2. Change the directory where the chrome driver is present for eg., ……/sandbox/chromedriver
      3. Run the command xattr -d com.apple.quarantine chromedriver
This will resolve the issue

**To Run the Automation Using Eclipse:**
1. Install Eclipse if not already Installed
2. Install TestNG plugin from Marketplace
      Steps to install TestNG Plugin:
      1. Go to Help from Top Menu
      2. Click on Eclipse Market place
      3. Search TestNG
      4. Click on Install
      5. Restart Eclipse
3. Open testNg.xml file
4. Right click
5. Click on Run As
6. Select TesNG suite

**To Run the Automation Using Terminal:(Maven should be installed)**
1. Change the directory to SauceDemo project 
2. Run command mvn test

**To change the inputs like Username password etc**
You have to change it from Data.properties file present in Project

You can find the file src/test/resource

You can also select which product to select just by entering the Product Name in Data.properties file

**To See the Execution Reports**
The Project generates a ExtentReport After Execution 
You can find the Report in path test-output/reports/testreport.html
