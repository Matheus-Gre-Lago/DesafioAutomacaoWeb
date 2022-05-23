package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {

    private WebDriver driver;
    private Waits waits;

    public IndexPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getButtonAutomacao(String texto){
        return waits.visibilityOfElement(By.xpath("//*[a='"+ texto +"']/a"));
    }
}
