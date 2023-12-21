#language: pt
Funcionalidade: : Realizar agendamento de show

  @smoke
  Cenario: : Realizar agendamento de show com sucesso
    Dado que eu preencho informação de nome
    E preencho informação de local
    E preencho informação de data
    E preencho informação de hora
    E aciono comando de agendar
    Então verifico a tela de listar