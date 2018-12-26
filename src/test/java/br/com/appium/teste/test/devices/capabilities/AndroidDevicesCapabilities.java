package br.com.appium.teste.test.devices.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import br.com.appium.teste.test.utils.Utils;

import java.io.File;

public enum AndroidDevicesCapabilities {


    ANDROID_OREO("capabilities/android-oreo.json"),
    ANDROID_PIE("capabilities/android-pie.json"),
    ANDROID_FISICO("capabilities/android-fisico.json");


    private String path;

    AndroidDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getAndroidCapabilitiesFromPlataform() {
        DesiredCapabilities androidCapabilities = Utils.pathToDesiredCapabilitites(this.path);
        androidCapabilities.setCapability("app", new File("apps/appium.apk").getAbsolutePath());
        return androidCapabilities;
    }

    public static void showAvaliableAndroidDevices() {
        System.out.println("======= ANDROID DEVICES ====== ");
        for (AndroidDevicesCapabilities androidDevicesCapabilities : AndroidDevicesCapabilities.values()) {
            System.out.println(androidDevicesCapabilities.name());
        }
    }
}
