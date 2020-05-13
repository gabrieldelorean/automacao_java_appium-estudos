package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CadastroScreen extends BaseScreen{

    @AndroidFindBy(id="fab")
    private MobileElement btnNovo;

    public void tocarEmFormulario(){
        btnNovo.click();
    }

    @AndroidFindBy(id="inputTitle")
    private MobileElement title;

    @AndroidFindBy(id="inputDescription")
    private MobileElement description;

    @AndroidFindBy(id="inputCategory")
    private  MobileElement categ;

    @AndroidFindBy(id="save")
    private MobileElement btnSave;

    @AndroidFindBy(id="tvTitle")
    private MobileElement titNome;

    public void preencherForm(String tit, String descrip, String categoty){
        title.setValue(tit);
        description.setValue(descrip);
        categ.setValue(categoty);
    }

    public void enviarCadastro(){
        btnSave.click();
    }

    public String titNomeMsg(){
        return titNome.getText();
    }
}