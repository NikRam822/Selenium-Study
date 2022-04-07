import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String addUser="Папа";
        String groupName="Test_group2";
        String phone = "9126839293";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\DEV\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://web.telegram.org/k/");

        Thread.sleep(6000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"auth-pages\"]/div/div[2]/div[2]/div/div[2]/button[2]/div"));//взять элемент
        element.click();
        Thread.sleep(2000);
        element = driver.findElement(By.xpath("//*[@id=\"auth-pages\"]/div/div[2]/div[2]/div/div[2]/button/div"));//взять элемент
        element.click();
        Thread.sleep(2000);
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div[1]"));
        element.sendKeys(phone, Keys.ENTER);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код из сообщения:");
        String data = scanner.nextLine();
        element = driver.findElement(By.xpath("//input[@type='tel']"));
        element.sendKeys(data);

        Thread.sleep(5000);

        element = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        element.sendKeys(groupName, Keys.ENTER);//ВВОД
        Thread.sleep(500);
        element = driver.findElement(By.xpath("//*[@id=\"search-container\"]/div[2]/div/div/div[1]/div/div[1]/ul/li/div[1]"));
        element.click();
        element = driver.findElement(By.xpath("//div[@class=\"sidebar-header topbar\"]"));
        element.click();
        Thread.sleep(1000);
        element = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/div/div[2]/button/div"));
        element.click();

        element=driver.findElement(By.xpath("//input[@class=\"selector-search-input i18n\"]"));
        element.sendKeys(addUser);//Имя из файла
        Thread.sleep(8000);
        element=driver.findElement(By.cssSelector("body > div.popup.popup-forward.active > div > div.popup-body > div > div > div > div.sidebar-left-section-container > div > div > ul > li"));
        element.click();
        Thread.sleep(500);
        element=driver.findElement(By.cssSelector("body > div.popup.popup-peer.popup-add-members.active > div > div.popup-buttons.popup-buttons-row > button:nth-child(1) > div"));
        element.click();
    }
}
