package br.com.appium.teste.steps.definitions;

import br.com.appium.teste.screens.login.InitialScreen;
import br.com.appium.teste.test.utils.Commons;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import static org.junit.Assert.*;

public class TesteSteps {

    InitialScreen initialScreen;
    Commons commons;

    public TesteSteps() {
        initialScreen = new InitialScreen();
        commons = new Commons();
    }

    // ----------------------- DADO ----------------------- //

    @Dado("^que tenha  aberto o app$")
    public void que_tenha_aberto_o_app() {
    }

    // ----------------------- QUANDO ----------------------- //

    @Quando("^clicar no formulário$")
    public void clicar_no_formulário() {
        this.initialScreen.clickFormulario();
    }

    @Quando("^e colocar o meu nome \"([^\"]*)\"$")
    public void e_colocar_o_meu_nome(String nome) {
        this.initialScreen.inputNome(nome);

    }

    @Quando("^salvar a alteração$")
    public void salvar_a_alteração() {
        this.initialScreen.saveClick();

    }

    @Quando("^clicar no swipe$")
    public void clicarNoSwipe() {
        this.initialScreen.clickSwipe();

    }

    @Quando("^realizo a gesture$")
    public void realizoAGesture() {

        commons.swipe(800, 1300, 150, 1300);
    }

    @Quando("^realizo a gesture de scroll$")
    public void realizoAGestureScroll() {
        commons.swipe(500, 1500, 500, 700);
    }

    @Quando("^faco gesto e volto$")
    public void facoGestoEVolto() {

    }


    // ----------------------- ENTÃO ----------------------- //

    @Entao("^realiza scroll$")
    public void realizaScroll() {

    }

    @Entao("^irei visualizar o meu nome na tela$")
    public void irei_visualizar_o_meu_nome_na_tela() {
        assertTrue("Fulano não encontrado", this.initialScreen.assertNome("Fulano"));
    }


    @Entao("^gesture realizada com sucesso$")
    public void gestureRealizadaComSucesso() {
        assertTrue("Não foi encontrado o texto:'Chegar até o fim'", this.initialScreen.assertText("Chegar até o fim"));
    }

    @Entao("^scroll realizada com sucesso$")
    public void gestureScrollRealizadaComSucesso() {
        assertTrue("Não foi encontrado o texto:'Opção bem escondida'", this.initialScreen.assertText("Opção bem escondida"));
    }

}
