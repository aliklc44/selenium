package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eger testtimiz sirasinda birden fazla sayfa arasinda ileri geri haraket edeceksek
        driver.get() yerine driver.navigate().to() methodunu kullaniriz.
        ve sonrasindan forward(), back() veya refresh() method'larini kullanabiliriz
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // amazon a geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebook a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
    }
}
