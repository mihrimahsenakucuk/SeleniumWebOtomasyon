import java.sql.Driver;

public class Urunsayfas─▒ extends BasePage {
    By urunisimLocator = new By.ByCssSelector("optionid:1668324");


    public Urunsayfas─▒(Driver driver) {
        super(driver);
    }

    public boolean isOnUrunSayfas─▒() {
      return goruntule(urunisimLocator);
    }

    public void selectUrun(int i) {
    }

    public boolean isOnUrunDetaySayfasi() {
    }
}
