package Tasks;

import PageObjects.IndexPage;
import org.openqa.selenium.WebDriver;

public class IndexTasks {

    private WebDriver driver;
    private IndexPage indexPage;

    public IndexTasks(WebDriver driver){
        this.driver = driver;
        indexPage = new IndexPage(driver);
    }

    public void acessarPaginaDeAutomacao(String texto){
        indexPage.getButtonAutomacao(texto).click();
    }

}
