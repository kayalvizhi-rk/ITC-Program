package selenium_javaITC;


	import java.io.IOException;
	 
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class checkbox {
		public static void main(String[]args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C://Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 //Step 2: Open checkbox test page
		        driver.get("https://the-internet.herokuapp.com/checkboxes");
		        Thread.sleep(2000);
		        // Step 3: Locate the first checkbox
		        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		        // Step 4: Check status
		        System.out.println("Checkbox 1 Selected? " + checkbox1.isSelected());
		        System.out.println("Checkbox 1 Enabled?  " + checkbox1.isEnabled());
		        System.out.println("Checkbox 1 Displayed? " + checkbox1.isDisplayed());
		        // Step 5: If not selected, click it
		        if (!checkbox1.isSelected()) {
		            checkbox1.click();
		            System.out.println("Checkbox 1 was not selected, so it was clicked.");
		        } else {
		            System.out.println("Checkbox 1 is already selected.");
		        }
		        // Step 6: Wait and close
		        Thread.sleep(2000);
		        driver.quit();
		    }
		
}
