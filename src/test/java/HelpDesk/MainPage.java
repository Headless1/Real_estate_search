package HelpDesk;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = "//input[@placeholder='Введіть місто']")
    private WebElement inputCity;

    @FindBy(xpath = "//div[@title='Вінниця, Вінницька область']")
    private WebElement pickCity;

    @FindBy(xpath = "//button[@class='button-border bold-500 small size18']")
    private WebElement pickList;

    @FindBy(xpath = "//a[@class='flex f-space f-center button-search']")
    private WebElement pickFind;

    public MainPage() {
        driver.get("https://dom.ria.com/uk/");
        PageFactory.initElements(driver, this);
    }

    public void searching(){
        inputCity.click();
        pickCity.click();
        pickList.click();
        pickFind.click();
    }
}
