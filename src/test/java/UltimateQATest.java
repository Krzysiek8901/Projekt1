import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// klasy /interfeis / enum / klasa abstrakcyjna / adnotacja
// modyfikatory dostępu (hermetyzacja/ enkapsulacja): public / private / package-private / protected
    public class UltimateQATest extends PageSetup{

    // typy danych w Java: proste i złożone (obiektowe)

    // biblioteka JUnit: alternatywna to biblioteka TestNG
    // zwracanie z funkcji; void nie zwraca nic



    @Test
    public void testOne() {
        WebElement button = driver.findElementById("idExample");
        button.click();

        WebElement text = driver .findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", text.getText());
    }

}


