import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;


import java.util.concurrent.TimeUnit;

   public class LogIn {

        protected WebDriver driver;
        public static String loginUrl="https://www.lcwaikiki.com/tr-TR/TR";

        @Before
        public void setUp() {
            try {
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\sena\\IdeaProjects\\SeleniumWebOtomasyon\\driver\\chromedriver.exe");
                driver= new ChromeDriver(capabilities);
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();

                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
                driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        @Test
        public void login(){
            try{
                driver.get(loginUrl);
                driver.findElement(xpath("name='LoginEmail'")).sendKeys("mskucukk@outlook.com");
                sleep(5000);

                driver.findElement(xpath("name='Password'")).sendKeys("123");
                sleep(5000);

                driver.findElement(xpath("'Login'")).click();
                sleep(5000);

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 

    }









