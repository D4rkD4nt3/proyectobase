package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.AcademyChoucairData;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than camilo wants to learn automation at the academy Choucair$")
    public void thanCamiloWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled(  "Camilo").wasAbleTo(OpenUp.thePage(), Login.onThePage(academyChoucairData.get(0).getStrUser(),
                academyChoucairData.get(0).getStrpassword()));
    }
    @When("^he search for the course on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlataform(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }
    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecrusosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {

    }
}