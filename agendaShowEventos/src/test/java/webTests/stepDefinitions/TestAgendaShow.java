package webTests.stepDefinitions;

import org.junit.Test;
import sql.connection.DataBaseConnection;
import webTests.page.PageAgendaShow;

import io.cucumber.java.pt.*;
import org.junit.Before;

import static webTests.BaseTest.getDriver;
public class TestAgendaShow {
    PageAgendaShow pageAgendaShow = new PageAgendaShow();
    DataBaseConnection dataBase = new DataBaseConnection();
    public static String nome;
    private String sql="SELECT * FROM agenda where codigo ='1'";
    @Before
    public void setUp() throws Exception {
        getDriver();
        dataBase.iniciar(sql, "nome");
    }

    @Test
    public void preencherAgendamentoDeShow() throws InterruptedException {
        pageAgendaShow.clicarNovaAgenda();
        pageAgendaShow.preencherCampoNome("Agora é: " + nome);
        pageAgendaShow.preencherCampoLocal("BH");
        pageAgendaShow.preencherCampoData("19/12/2023");
        pageAgendaShow.preencherCampoHora("11:00");
        pageAgendaShow.clicarAgendar();
        pageAgendaShow.clicarListarNovaAgendar();
    }

}
