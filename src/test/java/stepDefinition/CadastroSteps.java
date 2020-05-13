package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import screen.CadastroScreen;

public class CadastroSteps {
    CadastroScreen screen = new CadastroScreen();

    @Dado("^que estou na tela do formulario$")
    public void que_estou_na_tela_do_formulario() throws Throwable {
        screen.tocarEmFormulario();
    }

    @Quando("^quando preencher os dados do cadastro corretamente$")
    public void quando_preencher_os_dados_do_cadastro_corretamente() throws Throwable {
        screen.preencherForm("Aladin", "filme infantil", "Infantil");

    }

    @Quando("^enviar o cadastro$")
    public void enviar_o_cadastro() throws Throwable {
        screen.enviarCadastro();
    }

    @Entao("^devo ver os dados enviados$")
    public void devo_ver_os_dados_enviados() throws Throwable {
        Assert.assertEquals("Aladin", screen.titNomeMsg());
    }
}
