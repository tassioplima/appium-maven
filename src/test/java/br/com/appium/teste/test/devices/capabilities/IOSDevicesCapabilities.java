package br.com.appium.teste.test.devices.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import br.com.appium.teste.test.utils.Utils;

import java.io.File;

public enum IOSDevicesCapabilities {

    IPHONE_8("capabilities/iphone-8.json"),
    IPHONE_FISICO("capabilities/iphone-fisico.json");

    private String path;

    IOSDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getIOSCapabilitiesFromPlataform() {
        DesiredCapabilities iosCapabilities = Utils.pathToDesiredCapabilitites(this.path);
        iosCapabilities.setCapability("app", new File("apps/appium.app").getAbsolutePath());
        return iosCapabilities;
    }

    public static void showAvaliableIphoneDevices() {
        System.out.println("======= IOS DEVICES ====== ");
        for (IOSDevicesCapabilities iosDevicesCapabilities : IOSDevicesCapabilities.values()) {
            System.out.println(iosDevicesCapabilities.name());
        }
    }
}
