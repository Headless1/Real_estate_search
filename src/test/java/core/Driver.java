package core;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class Driver {

    @Before
    public void setUpDriverBeforeScenario(){
        Configuration.timeout = 60000;
    }
}
