package selenium_javaITC;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class sample2 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe" );
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
WebElement searchBox = null;
			//			WebElement searchBox=driver.findElement(By.name("username"));
		    searchBox.sendKeys("student");
	       // Thread.sleep(2000);
		    WebElement searchBox1=driver.findElement(By.name("password"));
		    searchBox1.clear();
		    searchBox1.sendKeys("Password123");
		    WebElement searchBox2=driver.findElement(By.id("submit"));
		    searchBox2.click();
		    Thread.sleep(5000);
		    System.out.println("Data Submitted");
		    
//			
		}

	}



