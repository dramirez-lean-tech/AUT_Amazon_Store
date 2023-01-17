# AUT_Amazon_Store

## General Information
This project is about the automation of the Amazon store page.
***
## Requirements
- Java
- JDK 17
- Gradle
***
## Versions
serenityCoreVersion = ""
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
- Feature : Test scenario using Gherkin language
```
  src/test/resources/features/shopping.feature
```
- Runners : Classes used to run the test scenarios using cucumber
```
src/test/java/runners/Runner.java
```
##Run Test
```
 gradle :clean :test --tests "runners.shopping" :aggregate
```
###Test Case
- The user wants to shop for the Samsung TV from the Amazon store website
> the test case, approximate run time 44 seconds
  ```
    gradle :experiment_a --tests "runners.Pre_PostTestRunner" :aggregate 
   ```

