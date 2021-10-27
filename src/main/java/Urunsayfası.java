import java.sql.Driver;

public class Urunsayfası extends BasePage {
    By urunisimLocator = new By.ByCssSelector("optionid:1668324");


    public Urunsayfası(Driver driver) {
        super(driver);
    }

    public boolean isOnUrunSayfası() {
      return goruntule(urunisimLocator);
    }

    public void selectUrun(int i) {
    }

    public boolean isOnUrunDetaySayfasi() {
    }
}
