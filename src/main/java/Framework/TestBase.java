package Framework;

import Utils.FileOperations;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class TestBase extends DriverManager{

    private static WebDriver driver;

    public static WebDriver getDriver(){
        driver = getDriver(TypeDriver.CHROME);
        return driver;
    }

    @BeforeAll
    public static void setUp(){
        String urlSite = FileOperations.getProperties("url").getProperty("urlSite");

        getDriver().get(urlSite);
    }

    @AfterAll
    public static void tearDown() throws  Exception{
        Thread.sleep(4000);
        Report.close();
        quitDriver();
    }
}
