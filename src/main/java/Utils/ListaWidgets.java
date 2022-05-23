package Utils;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListaWidgets {

    private WebDriver driver;
    private Waits waits;

    public ListaWidgets(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getTopicoListaFuncionalidade(String texto){
        return  waits.visibilityOfElement((By.xpath("//*[@class='collapsible collapsible-accordion']/*/a[text()='"+ texto +"']")));
    }

    public WebElement getSubTopicoListaFuncionalidade(String texto){
        return waits.visibilityOfElement((By.xpath("//*[@class='collapsible-body']//a[text()='"+ texto +"']")));
    }
}
