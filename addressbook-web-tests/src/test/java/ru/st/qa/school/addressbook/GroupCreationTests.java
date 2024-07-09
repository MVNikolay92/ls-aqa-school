package ru.st.qa.school.addressbook;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests {

    private static  WebDriver driver;
    private static String baseUrl;

    @BeforeAll
    public static void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
