package selenium_javaITC;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class googlesearch {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    // Step 2: Navigate to Google
	    driver.get("https://www.google.com");
	    WebElement searchBox=driver.findElement(By.name("q"));
	    searchBox.sendKeys("Selenium WebDriver");
	    searchBox.sendKeys(Keys.RETURN);  // Press Enter key
	    // Step 3: Wait briefly for results to load (you can use WebDriverWait for better wait)
	    Thread.sleep(3000);
	   
	    // Step 4: Print the title of the results page
	    System.out.println("Results Page Title: " + driver.getTitle());
	    // Step 5: Close the browser
	    driver.quit();
	    
		

	}
	}


