package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static configUrl.Configs.URL_AGENDA;

public class BaseTest {

    protected static WebDriver driver;

    protected BaseTest(){}

    public static synchronized WebDriver getDriver(){

        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "src/test/java/agendaShowEventos/chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URL_AGENDA);
        }
        return driver;
    }
}
