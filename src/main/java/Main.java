import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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
        element=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div[1]"));
        element.sendKeys("9126839293", Keys.ENTER);
        WebElement button = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Для бизнеса')]")));// явное ожидание
Thread.sleep(20000);
try {
    element=driver.findElement(By.xpath("#folders-container > div > div.chatlist-top > ul > li:nth-child(5) > div.c-ripple"));
    element.click();
}catch (Exception e){
    System.out.println("loooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooox\nddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
}



        System.out.println(button.getAttribute("baseURI"));//Работа с properties атрибута
        button.click();


        button = driver.findElement(By.xpath("//p[@class='hero-fb--description']"));
        System.out.println(button.getText());//Вывод текста из атрибута


        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
        input.sendKeys("Летов", Keys.ENTER);//Ввод текста и поиск. Вместо текста можно передать путь к файлу
        //input.clear();//очистить поле ввода


        // Actions actions =new Actions();
        /*actions.contextClick()//Клик правой кнопкой мыши

        actions.moveToElement()//навести на какой-то элемент
        actions.keyDown()//нажали клавишу
        actions.keyUp()//нажали отпустили клавишу
        actions.clickAndHold()//нажать и удержать
        actions.release()//отпустить при удержании
        actions.dragAndDropBy(element,100,100)//смещение элемента по  x на 100 и по y на 100
        actions.pause()//задержки в действии
        actions.build()//собрать все действия выше в одно
        actions.perform();//применить все действия выше*/
        driver.get("https://mrdoob.com/projects/chromeexperiments/google-space/");
        WebElement element1 = driver.findElement(By.xpath("//img"));
        WebElement element2 = driver.findElement(By.xpath("//a [contains(text(),'Advertising Programs')]"));
        Actions actions = new Actions(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actions.moveToElement(element1).clickAndHold().moveToElement(element2).build().perform();

    }
}
