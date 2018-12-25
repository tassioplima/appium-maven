package br.com.appium.teste.test.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {
    @After
    public void afterEachScenario(Scenario scenario){
        Print.takeScreenShot(scenario);
        AllureHelper.saveScreenshootOfScenario(scenario);
        DriverFactoryManager.reLaunchApp();
    }
}
