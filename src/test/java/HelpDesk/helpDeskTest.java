package HelpDesk;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class helpDeskTest extends BaseTest {
    @Test
    public void checkHouse(){
        MainPage mainPage = new MainPage();
        mainPage.searching();
        String myPrice = "100000";
        Board board = new Board();
        board.priceSearching(myPrice);



        Assert.assertEquals(board.openCard().getpriceOfhoue(), TestValues.TEST_PRICE);

    }
}
