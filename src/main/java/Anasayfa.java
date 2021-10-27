import java.sql.Driver;


public class Anasayfa extends BasePage {

    AramaCubugu aramaCubugu;

    public Anasayfa(Driver driver) {
        super(driver);
        aramaCubugu= new AramaCubugu(driver);
    }


    public AramaCubugu aramaCubugu() {
        return this.aramaCubugu;
    }

    public boolean urunekleme() {
    }

    public void sepeteGit() {
    }
}

