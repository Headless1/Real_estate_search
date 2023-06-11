package HelpDesk;

import core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Board extends BasePage {
    @FindBy(xpath = "//*[@id='mainAdditionalParams_0']//*[@class='item-pseudoselect form-selected small']")
    private WebElement price;

    @FindBy(xpath = "//input[@id='234_from']")
    private WebElement inputPrice;

    @FindBy(xpath = "//*[@id=\"domSearchPanel\"]/section[1]/div[3]/h3/a")
    private WebElement card;

    public Board() {
        PageFactory.initElements(driver, this);
    }

    public Board priceSearching(String myPrice){
        price.click();
        inputPrice.sendKeys(myPrice, Keys.ENTER);
        return this;
    }

    public CardofHouse openCard(){
        card.click();
        return new CardofHouse();
    }
}
