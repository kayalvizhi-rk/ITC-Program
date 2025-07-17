package selenium_javaITC;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class dropdown {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe" );
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/dropdown");
			WebElement dropdown = driver.findElement(By.id("dropdown"));
	        Select select = new Select(dropdown);
	        select.selectByVisibleText("Option1");
	       
	        select.selectByIndex(2);
	        System.out.println("Selected by index: Option 2");
	        Thread.sleep(1000);
	        // Step 6: Select option by value
	        select.selectByValue("1");
	        System.out.println("Selected by value: 1 (Option 1)");
	        Thread.sleep(1000);
	        // Step 7: Close browser
	        driver.quit();

	        
		}
	}


