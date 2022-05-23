package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.CadastroTasks;
import Tasks.HomeTasks;
import Tasks.IndexTasks;
import Tasks.InformacoesUsuarioTasks;
import Utils.FileOperations;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RealizarCadastroDeUsuario extends TestBase {

    private WebDriver driver = getDriver();

    private IndexTasks indexTasks = new IndexTasks(driver);
    private HomeTasks homeTasks = new HomeTasks(driver);
    private CadastroTasks cadastroTasks = new CadastroTasks(driver);
    private InformacoesUsuarioTasks informacoesUsuarioTasks = new InformacoesUsuarioTasks(driver);


    Properties escolherTipoAutomacao = FileOperations.getProperties("indexDados");
    Properties itemLista = FileOperations.getProperties("widgetsDados");
    Properties dados =  FileOperations.getProperties("cadastroUsuario");


    @Test
    public void realizarCadastroDeUsuario() throws Exception{
        try{
            Report.createTest(" Realizar novo cadastro de usuario" , ReportType.SINGLE);

            indexTasks.acessarPaginaDeAutomacao(escolherTipoAutomacao.getProperty("automacaoWeb"));

            homeTasks.acessarItemListaFuncionalidade(itemLista.getProperty("listaTopicoFormulario") , itemLista.getProperty("listaSubTopicoCriarUsuario"));

            cadastroTasks.preencherCadastroCompleto( dados.getProperty("nome") , dados.getProperty("ultimoNome") ,
                    dados.getProperty("email" ) , dados.getProperty("endereco") , dados.getProperty("univercidade") ,
                    dados.getProperty("profissao") , dados.getProperty("genero") , dados.getProperty("idade"));
            cadastroTasks.criarUsuario();

            informacoesUsuarioTasks.validarCadastroUsuario(dados.getProperty("mensagemDeCadastro"));
        }catch ( Exception e ){
            Report.log(Status.ERROR , e.getMessage() , Screenshot.fullPageBase64(driver));
        }
    }
}
