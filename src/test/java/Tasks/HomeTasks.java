package Tasks;

import Utils.ListaWidgets;
import org.openqa.selenium.WebDriver;

public class HomeTasks {

    private WebDriver driver;
    private ListaWidgets listaWidgets;

    public HomeTasks(WebDriver driver){
        this.driver = driver;
        listaWidgets = new ListaWidgets(driver);
    }

    public void acessarItemListaFuncionalidade(String topico , String subTopico){

        listaWidgets.getTopicoListaFuncionalidade(topico).click();
        listaWidgets.getSubTopicoListaFuncionalidade(subTopico).click();
    }
}
