package selenium_javaITC;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement jsAlertBtn= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlertBtn.click();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert says: " + alert1.getText());
        alert1.accept(); // Accept the alert
        Thread.sleep(1000);
        
        WebElement jsConfirmBtn= driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        jsAlertBtn.click();
        Alert alert2=driver.switchTo().alert();
        System.out.println("confirmation says: " + alert2.getText());
        alert2.accept(); // Accept the alert
        Thread.sleep(1000);
        
        WebElement jspromptBtn= driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        jspromptBtn.click();
        Alert alert3=driver.switchTo().alert();
        System.out.println("prompt says: " + alert3.getText());
        Thread.sleep(2000);
        
        
        alert3.sendKeys("selenium user");
        alert3.accept(); // Accept the alert
        Thread.sleep(3000);
        //Print result text
        String resultText = driver.findElement(By.id("result")).getText();
        System.out.println("Final Result: " + resultText);
        
	}
}



