package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {

        /*En ilkel haliyle bir otomasyon yapmak için
        Classımıza otomasyon için gerekli olan webdriver in yerini göstermemiz gerekir
        bunun için Java kütüphanesinden System.setProperty() methodu kullanırız
        method2 parametre istemektedir
        ilki kullanacagımız driver : webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu : src/resources/drivers/chromedriver.exe


         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.close();

    }


}
