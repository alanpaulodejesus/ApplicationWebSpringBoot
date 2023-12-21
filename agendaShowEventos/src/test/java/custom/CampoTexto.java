package custom;

import org.openqa.selenium.WebElement;

public class CampoTexto {

    public static void preencher(WebElement elemento, String valor) {
        elemento.clear();
        elemento.sendKeys(valor);
    }
}
