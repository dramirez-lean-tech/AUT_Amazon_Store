# AUT_Amazon_Store

## General Information
This project is about the automation of the Amazon store page.
***
## Requirements
- Java 1.8.0
- JDK 17
- Gradle 6.8.3
***
## Installation
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
## Run Test
The user wants to shop for the Samsung TV from the Amazon store website
- the test case, approximate 44 seconds run time 
```
gradle :clean :test --tests "runners.Runner" :aggregate
```
***  
## Browsers
The following are valid for the used
- Google Chrome Version 109.0.5414.75 (64-bit)
- Firefox 109.0 (32-bit)
- Edge Version 109.0.1518.55 (64-bit)
***
## SO
- Windows 10
- Windows 11
