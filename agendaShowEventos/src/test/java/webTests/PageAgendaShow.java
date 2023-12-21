package webTests;

import custom.CampoTexto;
import custom.Comando;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import static configUrl.Configs.URL_AGENDA_SHOW;

public class PageAgendaShow extends BaseTest{

    @FindBy(id ="btn-retornar-nova-agenda") private WebElement btnNovaAgenda;

    @FindBy(id ="btn-listagem-agenda-show") private WebElement btnListarNovaAgenda;
    @FindBy(id ="btn-agendar") private WebElement btnAgendar;
    @FindBy(id ="campo_nome") private WebElement campoNome;
    @FindBy(id ="campo_local") private WebElement campoLocal;
    @FindBy(id ="campo_data") private WebElement campoData;
    @FindBy(id ="campo_hora") private WebElement campoHora;

    public PageAgendaShow(){
        PageFactory.initElements(getDriver(), this);
    }

    public void clicarNovaAgenda() throws InterruptedException {
        Thread.sleep(1000);
        Comando.clicar(btnNovaAgenda);
    }

    public void clicarAgendar(){
        Comando.clicar(btnAgendar);
    }

    public void clicarListarNovaAgendar(){
        Comando.clicar(btnListarNovaAgenda);
    }
    public void validarUrl(){
        String actualUrl= URL_AGENDA_SHOW;
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void preencherCampoNome(String nome){
        CampoTexto.preencher(campoNome, nome);
    }

    public void preencherCampoLocal(String local){
        CampoTexto.preencher(campoLocal, local);
    }

    public void preencherCampoData(String data){
        CampoTexto.preencher(campoData, data);
    }

    public void preencherCampoHora(String hora){
        CampoTexto.preencher(campoHora, hora);
    }

}
