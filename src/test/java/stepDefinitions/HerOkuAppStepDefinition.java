package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerOkuAppPage;
import utilities.ReusableMethod;


public class HerOkuAppStepDefinition {
    HerOkuAppPage page = new HerOkuAppPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {

        page.addButonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {

        ReusableMethod.visibilityOfWait(page.deleteButonu);
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(page.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {

        page.deleteButonu.click();
    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        Assert.assertTrue(page.deleteListesi.isEmpty());
    }
}