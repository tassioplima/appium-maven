package br.com.appium.teste.test.utils;

import cucumber.api.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class AllureHelper {

    private static void screenShot(String status, Scenario scenario) {
        byte[] screenshootBytes = ((TakesScreenshot) DriverFactoryManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        InputStream screenshootStream = new ByteArrayInputStream(screenshootBytes);
        Allure.addAttachment(scenario.getName() +" - "+ status, screenshootStream);
    }

    public static void saveScreenshootOfScenario(Scenario scenario) {
        if (!scenario.isFailed()) {
            screenShot("PASSED", scenario);

        } else {
            screenShot("FAILED", scenario);
        }
    }
}
