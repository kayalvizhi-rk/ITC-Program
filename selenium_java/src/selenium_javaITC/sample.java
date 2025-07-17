package selenium_javaITC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/LabsKraft/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
	    // Maximize the browser window
	       driver.manage().window().maximize();
	       // Step 2: Navigate to Google
	       driver.get("https://www.google.com");
	       System.out.println("Opened Google: " + driver.getTitle());
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       // Step 3: Navigate to Wikipedia
	       driver.navigate().to("https://www.wikipedia.org");
	       System.out.println("Opened Wikipedia: " + driver.getTitle());
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       // Step 4: Navigate Back to Google
	       driver.navigate().back();
	       System.out.println("Went back to: " + driver.getTitle());
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       // Step 5: Navigate Forward to Wikipedia
	       driver.navigate().forward();
	       System.out.println("Went forward to: " + driver.getTitle());
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       // Step 6: Refresh Wikipedia Page
	       driver.navigate().refresh();
	       System.out.println("Page refreshed: " + driver.getTitle());
	       try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       // Step 7: Close browser
	       driver.quit();
		
		
	}
}
	


