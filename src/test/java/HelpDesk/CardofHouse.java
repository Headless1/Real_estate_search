package HelpDesk;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardofHouse extends BasePage {
    @FindBy(xpath = "//b[@class='size30']")
    private WebElement priceOfhoue;

    @FindBy(xpath = "//a[@title=\"Вінниця\"][@class=\"elem hover\"]")
    private WebElement cityOfhouse;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/main/div[2]/div[1]/div[1]/h1")
    private WebElement title;

    @FindBy(xpath = "//a[@class=\"unlink notification-point-wrap\"]")
    private WebElement login;

    public CardofHouse() {
        PageFactory.initElements(driver, this);
    }

    public String getTile(){
        return title.getText();
    }

    public String getpriceOfhoue(){
        return priceOfhoue.getText();
    }

    public String getcityOfhouse(){
        return cityOfhouse.getText();
    }

    public void Login(){
        login.click();
    }
}
