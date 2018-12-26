# language: pt
@teste
Funcionalidade: Teste appium

  @teste01
  Cenário: Abrir app do appium.apk
    Dado que tenha  aberto o app
    Quando clicar no formulário
    E e colocar o meu nome "Fulano"
    E salvar a alteração
    Então irei visualizar o meu nome na tela

  @teste02
  Cenário: Realizar gestures iOS e Android
    Dado que tenha  aberto o app
    Quando clicar no swipe
    E realizo a gesture
    Então gesture realizada com sucesso

  @teste03
  Cenário: Realizar gestures scroll iOS e Android
    Dado que tenha  aberto o app
    Quando realizo a gesture de scroll
    Então giscroll realizada com sucesso