# AUT_Amazon_Store

## General Information
This project is about the automation of the Amazon store page.
***
##Tools
- IntelliJ
- Gradle
## Requirements
- Java 1.8.0
- JDK 17
- Gradle 6.8.3
***
##Installation
```
gradle build
```
## Project structure
Screenplay design pattern using serenity BDD

- SetupConfiguration: initial configuration
```
src/test/java/stepdefinitions/SetupConfiguration.java
```
- Feature : Test scenario using Gherkin language with cucumber
```
  src/test/resources/features/shopping.feature
```
- Runners : Classes used to run the test scenarios 
```
src/test/java/runners/Runner.java
```
##Run Test
```
 gradle :clean :test --tests "runners.shopping" :aggregate
```
##Test Case
The user wants to shop for the Samsung TV from the Amazon store website

- the test case, approximate 44 seconds run time 
  ```
    gradle :experiment_a --tests "runners.Pre_PostTestRunner" :aggregate 
   ```
***  
##Browsers
The following are valid for the used
- Chrome
- Firefox
- Edge
***
##SO
- Windows 10
- Windows 11
