#QA Mobile

QA Mobile is made with Appium.

## Components

* Java 8
* Appium Server 1.9.1
* Appium cliente 4.1.2
* Maven
* Android and Ios Simulators or Devices

## Running Tests

1. Start appium server: `$ appium` ( Use method appiumServerUp to start appium server automatically, and appiumServerDown to close)
	
2. Run implemented android tests: `$ mvn clean test -Dcucumber.options="--tags @teste01" -Denv.PLATAFORM=ANDROID_OREO`

3. Run implemented ios tests: `$ mvn clean test -Dcucumber.options="--tags @teste01" -Denv.PLATAFORM=IPHONE_8`

## IMPORTANT

* Before run the tests you need to start android device or emulator and appium server.


## OPERATIONAL SYSTEMS FOR TESTS

###ANDROID

* ANDROID_OREO_DEV (Simulator)

###IOS

* IPHONE_6S_DEV (Simulator)

## Documentation

* **[Appium Docs](http://appium.io/)**
* **[Selenium Docs](https://www.seleniumhq.org/docs/)**









