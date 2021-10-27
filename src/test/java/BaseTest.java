import org.testng.annotations.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestResultLogger.class)
public class BaseTest {
    WebDriver driver;

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
    }


}
