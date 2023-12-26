package webTests.stepDefinitions;

import org.junit.Test;
import sql.connection.QueryConnection;
import webTests.page.PageAgendaShow;

import org.junit.Before;

import java.sql.ResultSet;

import static webTests.BaseTest.getDriver;
public class TestAgendaShow {
    PageAgendaShow pageAgendaShow = new PageAgendaShow();
    public static String nome;
    public static String local;
    private String sql="SELECT * FROM agenda where codigo ='20'";
    @Before
    public void setUp() throws Exception {
        QueryConnection con = new QueryConnection();
        ResultSet data = con.data("",sql);
        nome = data.getString("nome");
        local = data.getString("local");
    }

    @Test
    public void preencherAgendamentoDeShow() throws InterruptedException {
        getDriver();
        pageAgendaShow.clicarNovaAgenda();
        pageAgendaShow.preencherCampoNome("RECUPERADO BANCO: " + nome);
        pageAgendaShow.preencherCampoLocal("RECUPERADO BANCO: " + local);
        pageAgendaShow.preencherCampoData("19/12/2023");
        pageAgendaShow.preencherCampoHora("11:00");
        pageAgendaShow.clicarAgendar();
        pageAgendaShow.clicarListarNovaAgendar();
    }

}
