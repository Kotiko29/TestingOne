package MyTest;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTest {
    public static void main(String[] Args){
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        ChromeDriver Driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//        FirefoxDriver Driver = new FirefoxDriver();
        Driver.manage().window().maximize();
        Driver.get("http://google.ru");
        Driver.close();
        
    }
}
