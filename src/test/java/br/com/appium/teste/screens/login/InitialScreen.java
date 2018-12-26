package br.com.appium.teste.screens.login;

import br.com.appium.teste.screens.base.BaseScreen;
import br.com.appium.teste.test.model.JSON;
import br.com.appium.teste.test.model.JSONs;
import br.com.appium.teste.test.utils.DriverFactoryManager;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.concurrent.TimeUnit;


public class InitialScreen extends BaseScreen {

    public static JSON jSONLogged;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Formulário']")
    private MobileElement clickFormulario;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Swipe']")
    private MobileElement clickSwipe;

    @AndroidFindBy(accessibility = "nome")
    private MobileElement inputNome;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='save']/android.widget.TextView")
    private MobileElement save;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Nome')]")
    private MobileElement assertName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Chegar até o fim')]")
    private MobileElement assertText;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Opção bem escondida)]")
    private MobileElement assertTextOpcao;

    public void clickFormulario() {
        this.clickFormulario.click();
    }

    public void clickSwipe() {
        this.clickSwipe.click();
    }

    public void inputNome(String nome) {

        this.inputNome.sendKeys(nome);
    }

    public void saveClick() {

        this.save.click();
    }

    public boolean assertNome(String nome) {
        return this.assertName.getText().contains(nome);

    }

    public boolean assertText(String text) {
        return this.assertText.getText().contains(text);
    }

}
