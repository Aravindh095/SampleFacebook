package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\FlipKart\\SampleProject\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//1.by  Id
//		WebElement txtUserName=driver.findElement(By.id("email"));
//		txtUserName.sendKeys("test@gmail.com");
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		txtPass.sendKeys("aravindh@123");
//		WebElement btnClick = driver.findElement(By.id("u_0_b"));
//		btnClick.click();
	
		//2.By Name
//		WebElement txtName = driver.findElement(By.name("email"));
//		txtName.sendKeys("test@gmail.com");
//		WebElement txtPass = driver.findElement(By.name("pass"));
//		txtPass.sendKeys("12345456");
//		WebElement btnClick = driver.findElement(By.name("login"));
//		btnClick.click();
		//3.Class Name using https://login.yahoo.com/
		
//		WebElement txtPhone = driver.findElement(By.className("phone-no"));
//		txtPhone.sendKeys("9876543219");
		
		//4.Linked Text
		
		//driver.findElement(By.linkText("Forgot username?")).click();
		
		//5. Partial Link
		
//		WebElement parClick = driver.findElement(By.partialLinkText("username?"));
//		parClick.click();
		
		//6. Tag Name
//		WebElement txtSend = driver.findElement(By.tagName("input"));
//		txtSend.sendKeys("kumaran@kumaran.com");
		
		//7. CSS selector
//		WebElement txtUsername = driver.findElement(By.cssSelector("#usernameOrEmail"));
//		txtUsername.sendKeys("Kumaran@kumaran.com");

		//FindElements
//		
//		driver.findElement(By.id("inputValEnter")).sendKeys("Phones",Keys.ENTER);
//		Thread.sleep(2000);
//		List<WebElement> txtList = driver.findElements(By.className("product-title"));
//		for (WebElement mobile : txtList) {
//			String text = mobile.getText();
//			System.out.println(text);
		Thread.sleep(2000);
			driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
			driver.findElement(By.name("q")).sendKeys("phone");
		}
	}


