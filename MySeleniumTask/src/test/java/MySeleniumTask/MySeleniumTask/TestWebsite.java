package MySeleniumTask.MySeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebsite {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Chrome90\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/marketingAPAC/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("A@123bc");
		//driver.findElement(By.xpath("//input[@id='u_0_3_pv']")).click();
		//driver.findElement(By.xpath("//input[@id=\"u_0_3_tv\"]")).click();
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.manage().deleteAllCookies();
		//Thread.sleep(5000);
		//driver.quit(); 
	}

}
