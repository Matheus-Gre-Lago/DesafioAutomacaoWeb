package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage {

    private WebDriver driver;
    private Waits waits;

    public CadastroPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getTextFieldNome(){
        return waits.visibilityOfElement(By.id("user_name"));
    }

    public WebElement getTextFieldUltimoNome(){
        return waits.visibilityOfElement(By.id("user_lastname"));
    }

    public WebElement getTextFieldEmail(){
        return waits.visibilityOfElement(By.id("user_email"));
    }

    public WebElement getTextFieldEndereco(){
        return waits.visibilityOfElement(By.id("user_address"));
    }

    public WebElement getTextFieldUniversidade(){
        return waits.visibilityOfElement(By.id("user_university"));
    }

    public WebElement getTextFieldProfissao(){
        return waits.visibilityOfElement(By.id("user_profile"));
    }

    public WebElement getTextFieldGenero(){
        return waits.visibilityOfElement(By.id("user_gender"));
    }

    public WebElement getTextFieldIdade(){
        return waits.visibilityOfElement(By.id("user_age"));
    }

    public WebElement getButtonCriar(){
        return waits.visibilityOfElement(By.name("commit"));
    }

    public WebElement getButtonVoltar(){
        return waits.visibilityOfElement(By.xpath("//*[@class='col s12 center']/a"));
    }

}
