package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformacoesUsuarioPage {

    private WebDriver driver;
    private Waits waits;

    public InformacoesUsuarioPage(WebDriver driver){
        this.driver  = driver;
        waits = new Waits(driver);
    }

    public WebElement getLabelCadastroRealizadoComSucesso(){
        return waits.visibilityOfElement(By.id("notice"));
    }
}
