package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {
    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/svg")
    public WebElement girisButonu;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement registerButonu;

    @FindBy(xpath = "//input[@id=\"ssn\"]")
    public WebElement ssnAlani;

    @FindBy(xpath = "  //*[@id=\"register-form\"]/div[1]/div")
    public WebElement ssnRequaredHatasi;





}
