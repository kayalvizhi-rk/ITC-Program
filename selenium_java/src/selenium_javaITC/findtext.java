package selenium_javaITC;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class findtext {
		public static void main(String[]args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C://Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 // Step 1: Open Google
	       driver.get("https://the-internet.herokuapp.com/login");
	       // Step 2: Locate the search box and type a query
	       WebElement userName = driver.findElement(By.id("username"));
	       userName.clear();
	       userName.sendKeys("tomsmith");
	       //searchBox.sendKeys(Keys.RETURN);  // Press Enter key
	       WebElement password = driver.findElement(By.id("password"));
	       password.clear();
	       password.sendKeys("SuperSecretPassword!");
	       WebElement submitBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
	       submitBtn.click();
	      // searchBox.sendKeys(Keys.RETURN);
	       // Step 3: Wait briefly for results to load (you can use WebDriverWait for better wait)
	       Thread.sleep(10000);
	       // Step 4: Print the title of the results page
	       // Verify the result page contains submitted data
	       String pageSource = driver.getPageSource();
	       if (pageSource.contains("mytestuser")) {
	           System.out.println("Button click successful, data submitted.");
	       } else {
	           System.out.println("Submission failed or data not found.");
	       }
	       // Step 5: Close browser
	       driver.quit();
	   }
	 
	   }
	 

