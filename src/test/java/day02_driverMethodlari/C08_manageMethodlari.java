package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // maximixe iken boyutları konumu alalım
        System.out.println("maximize konum: " + driver.manage().window().getPosition());
        System.out.println("maximize boyut: " + driver.manage().window().getSize());

        // fullscreen iken boyutlari alalim
        System.out.println("fullscreen konum: " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut: " + driver.manage().window().getSize());

    }
}
