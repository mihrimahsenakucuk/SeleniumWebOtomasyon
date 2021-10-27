import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    public BasePage(Driver driver){
        this.driver = driver;
    }

    public Boolean goruntule(By locator){
        return find(locator).isDisplayed();
    }

    public void tikla(By locator){
        final (locator).click();
    }




}
