package br.com.appium.teste.test.utils;

import br.com.appium.teste.screens.base.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.HashMap;

public class Commons extends BaseScreen {

    public static TouchAction action = new TouchAction(DriverFactoryManager.getDriver());

    public static void swipe(int startX, int startY, int endX, int endY) {

        action.press(PointOption.point(startX, startY)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600))).moveTo(PointOption.point(endX, endY)).release().perform();
    }

    public static void holdElement(MobileElement mobile) {
        //  new TouchAction(DriverFactoryManager.getDriver()).longPress(mobile).perform();
    }

    public static void holdElementiOS(MobileElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactoryManager.getDriver();
        HashMap<String, String> tapObject = new HashMap<String, String>();
        tapObject.put("element", ((RemoteWebElement) element).getId());
        tapObject.put("duration", "2");
        js.executeScript("mobile: touchAndHold", tapObject);
    }

    public static void swipeiOS() {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactoryManager.getDriver();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
    }

    public static void swipeInvertiOS() {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactoryManager.getDriver();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: swipe", scrollObject);
    }

    public static void dataPicker(MobileElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactoryManager.getDriver();
        HashMap<String, String> picker = new HashMap<String, String>();
        picker.put("order", "next");
        picker.put("offset", "0.15");
        picker.put("element", ((RemoteWebElement) element).getId());
        js.executeScript("mobile: selectPickerWheelValue", picker);
    }

}
