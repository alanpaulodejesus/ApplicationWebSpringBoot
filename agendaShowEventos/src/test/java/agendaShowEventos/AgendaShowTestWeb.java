package agendaShowEventos;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgendaShowTestWeb {

    public AgendaShowTestWeb() {
        super();
    }
    //@Test
    public void validarRedirecionamentoAgendaShow() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/agendaShowEventos/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/agendas");
        WebElement agenda=driver.findElement(By.id("btn-retornar-nova-agenda"));
        agenda.click();
        String actualUrl="http://localhost:8080/agendaShow";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //driver.quit();
    }
}
