package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class US_01_StespDefinitions {
    Faker faker=new Faker();
    Actions actions =new Actions(Driver.getDriver());
    MedunnaPage medunnaPage=new MedunnaPage();
    @Given("kullanici medunna anasayfasinda")
    public void kullanici_medunna_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @Then("Kullanici simgesine tiklar")
    public void kullanici_simgesine_tiklar() {
        medunnaPage.girisButonu.click();


    }

    @Then("register butonuna tiklar")
    public void register_butonuna_tiklar() {
        medunnaPage.registerButonu.click();

    }

    @Then("SSN numarasi bos birakildigi icin {string} yazisi cikmali")
    public void ssn_numarasi_bos_birakildigi_icin_yazisi_cikmali(String string) {
        String expectedData="Your SSN is required.";
        String actualResult=medunnaPage.ssnRequaredHatasi.getText();
        Assert.assertTrue(expectedData.contains(actualResult));


    }

}
