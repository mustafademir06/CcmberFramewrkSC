package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage page = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("Kullanici Nutella aratir")
    public void kullanici_nutella_aratir() {

        page.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {

        Assert.assertTrue(page.aramaSonucu.getText().contains("Nutella"));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();
    }
}
