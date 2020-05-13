package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import support.Utils;

import java.io.File;

public class Hooks {

    @After //import cucumber.api.java.After;
    public void after(Scenario scenario){
        File screenshot = Utils.gerarScreenShot(scenario);
        Utils.embedScreenshot(screenshot, scenario.getName());
    }

}