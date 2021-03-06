package br.com.appium.teste.steps.definitions;

import br.com.appium.teste.test.utils.AllureHelper;
import br.com.appium.teste.test.utils.DriverFactoryManager;
import br.com.appium.teste.test.utils.Print;
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
