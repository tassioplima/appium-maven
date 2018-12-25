# language: pt
@teste
Funcionalidade: Teste appium

  @teste01
  Cenário: Abrir app do appium.apk
    Dado que tenha  aberto o app
    Quando clicar no formulário
    E e colocar o meu nome "Fulado"
    E salvar a alteração
    Então irei visualizar o meu nome na tela
