import java.sql.Driver;

public class AramaCubugu extends BasePage {

    By aramaCubuguLocator = By.id("search");
    By aramaclick = By.id("hdnSearch");

    public AramaCubugu(Driver driver) {
        super(driver);
    }

    public void search(String pantolon) {
        type(aramaCubuguLocator , pantolon);
        click(aramaclick);
    }
}
