package HelpDesk;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Selenide.$x;

public class MainPage{

    private final SelenideElement inputCity = $x("//input[@placeholder='Введіть місто']");

    private final SelenideElement pickCity = $x("//div[@title='Вінниця, Вінницька область']");

    private final SelenideElement pickFind = $x("//a[@class='flex f-space f-center button-search']");

    private final SelenideElement price = $x("//*[@id='mainAdditionalParams_0']//*[@class='item-pseudoselect form-selected small']");

    private final SelenideElement inputPrice = $x("//input[@id='234_from']");

    private final SelenideElement switch_button = $x("//button[@class='button-border bold-500 small'][not(contains(@class, 'noClickEvent'))]");

    private final SelenideElement card = $x("//div[@class='search-result-list f100']//h3[contains(@class, 'tit')]");

    private final SelenideElement priceOfhoue = $x("//b[@class='size30']");

    private String getresult(){
        return priceOfhoue.getText().replaceAll("[^0-9]", "");
    }
    @Given("We open the site {string}")
    public void OpenMainPage(String url){
        Selenide.open(url);
    }
    @When("Enter filters")
    public void searching(){
        inputCity.click();
        pickCity.click();
        pickFind.click();
    }
    @And("Enter the price")
    public void priceSearching(){
        price.click();
        String myPrice = "100000";
        inputPrice.sendKeys(myPrice, Keys.ENTER);
    }
    @And("We open the real estate page")
    public void openCard(){
        switch_button.click();
        card.click();
    }
    @Then("The real estate price is greater than or equal to {int}")
    public void getpriceOfhoue(int minValue){
        String result = getresult();
        int resultNumber = Integer.parseInt(result);
        Assert.assertTrue("Current result" + resultNumber, resultNumber >= minValue);
    }


}
