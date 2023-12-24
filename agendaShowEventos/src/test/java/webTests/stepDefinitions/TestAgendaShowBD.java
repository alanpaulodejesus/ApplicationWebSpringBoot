package webTests.stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import sql.connection.SingletonConnection;
import sql.model.Agenda;
import webTests.page.PageAgendaShow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static webTests.BaseTest.getDriver;

public class TestAgendaShowBD {
    PageAgendaShow pageAgendaShow = new PageAgendaShow();
    private String sql="SELECT * FROM agenda where codigo ='1'";
    private Connection connection;
    public static String recuperarNome;
    public static String recuperarLocal;

    @Dado("^que existe uma agenda inserida na tabela$")
    public void recuperarDadoTabela() throws InterruptedException, SQLException {
        connection = SingletonConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        result.next();
            Agenda agenda = new Agenda();
            recuperarNome = agenda.setNome(result.getString("nome"));
            recuperarLocal = agenda.setLocal(result.getString("local"));
    }

    @E("^acesso a aplicacao$")
    public void acessoAplicacao() throws InterruptedException {
        getDriver();
        pageAgendaShow.clicarNovaAgenda();
    }

    @E("^preencho informações de nome, local, data e hora$")
    public void preencherInformacoesAgendaShow(){
        pageAgendaShow.preencherCampoNome("Nome retornado de banco: "+recuperarNome);
        pageAgendaShow.preencherCampoLocal("Local retornado de banco:"+recuperarLocal);
        pageAgendaShow.preencherCampoData("18/12/2023");
        pageAgendaShow.preencherCampoHora("10:00");
    }

    @Quando("^aciono comando de agendar$")
    public void clicarComandoAgendar(){
        pageAgendaShow.clicarAgendar();
    }

    @Então("^é exibido a tela de listar$")
    public void verificarTelaDeListarAgenda(){
        pageAgendaShow.clicarListarNovaAgendar();
    }

}
