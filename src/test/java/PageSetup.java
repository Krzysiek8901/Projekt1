// Programowanie obiektowe: dziedziczenie - extends

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {
    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

        // roznica driver.close() a driver.quit()

    }

    @AfterEach
    public void close() {
        // roznica driver.close() a driver.quit()
          driver.close();
    }
}

