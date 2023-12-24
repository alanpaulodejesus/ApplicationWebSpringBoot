#language: pt
Funcionalidade: : Realizar agendamento de show

  @smoke
  Cenario: : Realizar agendamento de show com sucesso
    Dado que existe uma agenda inserida na tabela
    E acesso a aplicacao
    E preencho informações de nome, local, data e hora
    Quando aciono comando de agendar
    Então é exibido a tela de listar