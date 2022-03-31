import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\DEV\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://google.com");


        WebElement element = driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a"));//взять элемент
        element.click();

        WebElement button = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Для бизнеса')]")));// явное ожидание
        System.out.println(button.getAttribute("baseURI"));//Работа с properties атрибута
        button.click();


        button = driver.findElement(By.xpath("//p[@class='hero-fb--description']"));

        System.out.println(button.getText());//Вывод текста из атрибута

        driver.get("https://google.com");

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));

        input.sendKeys("Летов", Keys.ENTER);//Ввод текста и поиск. Вместо текста можно передать путь к файлу
    }
}
