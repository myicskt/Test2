package test2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTwo {

	@Test
	public void init() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		if (driver.findElements(By.xpath("//form/ul/li[1]/input")).size() != 0) {
			driver.findElement(By.xpath("//form/ul/li[1]/input")).click();;
			driver.findElement(By.name("submit")).click();
		} else {
			System.out.println("There is no items in list ");
		}
		driver.quit();

	}
}
