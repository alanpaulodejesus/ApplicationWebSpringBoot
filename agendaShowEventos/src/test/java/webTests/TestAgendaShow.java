package webTests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.*;
import org.junit.Before;
import static webTests.BaseTest.getDriver;

public class TestAgendaShow {
    PageAgendaShow pageAgendaShow = new PageAgendaShow();
    static String nome= "TESTE ABC";

    @Before
    public void setUp() throws Exception {
        getDriver();
    }

    @Dado("^que eu preencho informação de nome$")
    public void preencherNomeAgendaShow() throws InterruptedException {
        pageAgendaShow.clicarNovaAgenda();
        pageAgendaShow.preencherCampoNome(nome);
    }
    @E("^preencho informação de local$")
    public void preencherLocalAgendaShow(){
        pageAgendaShow.preencherCampoLocal("BH UAI");
    }
    @E("^preencho informação de data$")
    public void preencherDataAgendaShow(){
        pageAgendaShow.preencherCampoData("18/12/2023");
    }
    @E("^preencho informação de hora$")
    public void preencherHoraAgendaShow(){
        pageAgendaShow.preencherCampoHora("10:00");
    }
    @Quando("^aciono comando de agendar$")
    public void clicarComandoAgendar(){
        pageAgendaShow.clicarAgendar();
    }
    @Então("^verifico a tela de listar$")
    public void verificarTelaDeListarAgenda(){
        pageAgendaShow.clicarListarNovaAgendar();
    }

//    public void realizarAgendaShow(){
//        pageAgendaShow.preencherCampoNome(nome);
//        pageAgendaShow.preencherCampoLocal("BH UAI");
//        pageAgendaShow.preencherCampoData("18/12/2023");
//        pageAgendaShow.preencherCampoHora("10:00");
//        pageAgendaShow.clicarAgendar();
//        pageAgendaShow.clicarListarNovaAgendar();
//    }
}
