package testcase;



	import pom.loginpage_1;
	import testsetup.basesetup_1;
	public class logintest_1 extends basesetup_1 {
		    public static void main(String[] args) {
		        logintest_1 test = new logintest_1();
		        test.setUp();
		        test.driver.get("https://the-internet.herokuapp.com/login");
		        loginpage_1 loginPage = new loginpage_1(test.driver);
		        loginPage.login("student", "Password123");
		        // You can add validations here
		        String currentUrl = test.driver.getCurrentUrl();
		        System.out.println("Login success. Navigated to: " + currentUrl);
		        test.tearDown();
		    }
		
	}




