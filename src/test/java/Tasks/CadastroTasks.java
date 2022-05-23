package Tasks;

import PageObjects.CadastroPage;
import org.openqa.selenium.WebDriver;

public class CadastroTasks {

    private WebDriver driver;
    private CadastroPage cadastroPage;

    public CadastroTasks(WebDriver driver){
        this.driver =driver;
        cadastroPage = new CadastroPage(driver);
    }

    public  void preencherCadastroCompleto(String nome, String ultimoNome, String email, String endereco,
                                           String universidade, String profissao, String genero , String idade){
        preencherNome(nome);
        preencherUltimoNome(ultimoNome);
        preencherEmail(email);
        preencherEndereco(endereco);
        preencherUniversidade(universidade);
        preencherProfissao(profissao);
        preencherGenero(genero);
        preencherIdade(idade);
    }

    public void preencherNome(String nome){
        cadastroPage.getTextFieldNome().sendKeys(nome);
    }

    public void preencherUltimoNome(String ultimoNome){
        cadastroPage.getTextFieldUltimoNome().sendKeys(ultimoNome);
    }

    public void preencherEmail(String email){
        cadastroPage.getTextFieldEmail().sendKeys(email);
    }

    public void preencherEndereco(String endereco){
        cadastroPage.getTextFieldEndereco().sendKeys(endereco);
    }

    public void preencherUniversidade(String universidade){
        cadastroPage.getTextFieldUniversidade().sendKeys(universidade);
    }

    public void preencherProfissao(String profissao){
        cadastroPage.getTextFieldProfissao().sendKeys(profissao);
    }

    public void preencherGenero(String genero){
        cadastroPage.getTextFieldGenero().sendKeys(genero);
    }

    public void preencherIdade(String idade){
        cadastroPage.getTextFieldIdade().sendKeys(idade);
    }

    public void criarUsuario(){
        cadastroPage.getButtonCriar().click();
    }

    public void voltarParaHome(){
        cadastroPage.getButtonVoltar().click();
    }
}
