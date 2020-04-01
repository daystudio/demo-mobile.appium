# demo.appium

This is made for the purpose of demonstrating how black box automated test on the apps works, with appium framework.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


## Running the tests

A step by step series of examples that tell you how to get a development env running

#### Appium Server

First download and run appium server from link: [appium.io](http://appium.io/)


#### Appium Desktop Inspector

In case you need to change the test cases, use inspector to get the component xpath.
Appium Desktop Inspector come with Appium.  Click the magnifying class on Appium to start it.
Input the Desired Capability as same in your source code

```
{
  "appium-version": "1.15.1",
  "platformName": "Android",
  "platformVersion": "9.0",
  "deviceName": "emulator-5554",
  "app": "/Users/k/Documents/_projects/demo.appium/_doc/app-debug.apk"
}
```

#### Android Emulator

For Android tests, start the emulator. And then check the emulator name with

```
adb devices
```

And fill the name into the code.

#### iOS Emulator

Install WebDriverAgent from [link](https://github.com/facebookarchive/WebDriverAgent)

#### Run Test

After you have appium server started and the emulator started, you may build and run with

```
mvn clean test
```

will show

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running mou.TestAppium
```

that means the test is works and RUNNING

## Working with Eclipse

To import code into Eclipse, use
```
File -> Open Projects from File System
```

Then simply
```
Run As -> Maven Test
```

## Built With

* [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) - Java
* [Maven](https://maven.apache.org/) - Dependency Management
* [Selenium](https://www.seleniumhq.org/) - Web Test Framework
* [Cucumber](https://cucumber.io/) - BDD Test Framework

## Contributing


## Versioning


## Authors

* **ck chan** - *Initial work* - [cck](https://github.com/daystudio)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments
