package ashwini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	WebDriver driver;
@BeforeMethod
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.get("https://www.facebook.com");
   }
@Test(priority=1,groups="title")
public void verifyGoogletitle()
{
	String title = driver.getTitle();
	System.out.println(title);
}
/*@Test(priority=2,groups="logo")
public void verifyLogo()
{
	boolean result = driver.findElement(By.xpath("//a[@title='Go to Facebook hom']")).isDisplayed();
			if(result==true)
			{
				System.out.println("is displayed");
			}
			else
			{
				System.out.println("not dispalyed");
			}*/
//}
@Test(priority=3,groups="test")
public void verifyTest()
{
boolean test = driver.findElement(By.xpath("//a[text()='Forgotten account?']")).isDisplayed();
}
@Test(priority=4,groups="test")
public void test1()
{
	System.out.println("test1 is runnking");
//	int a= 10/0;
}
@Test(priority=5,groups="test")
public void test2()
{
	System.out.println("test2 is running");
	//int b= 10/0;
}

@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}

