package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.InformacoesUsuarioPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InformacoesUsuarioTasks {

    private WebDriver driver;
    private InformacoesUsuarioPage informacoesUsuarioPage;


    public InformacoesUsuarioTasks(WebDriver driver){
        this.driver = driver;
        informacoesUsuarioPage = new InformacoesUsuarioPage(driver);
    }

    public void validarCadastroUsuario(String mensagemCadastroValidar){
        String mensagem = informacoesUsuarioPage.getLabelCadastroRealizadoComSucesso().getText();

        assertAll(
                () -> assertEquals( mensagemCadastroValidar , mensagem)
        );

        Report.log(Status.PASS , "Cadastro realizado com sucesso" , Screenshot.fullPageBase64(driver));
    }
}
