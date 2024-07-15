package hospital_management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Login extends BaseDriver{
	
	@Test
	
	public void test() throws InterruptedException{
		
		driver.manage().window().maximize();
		driver.get("https://carepro-training.ihmafrica.com/");
		Thread.sleep(10000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("tester");
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("tester2023!");
		Thread.sleep(1000);
		
		WebElement box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		box.click();
		Thread.sleep(1000);
		
		WebElement signin = driver.findElement(By.className("button"));
		signin.click();
<<<<<<< HEAD
		Thread.sleep(30000);
=======
		Thread.sleep(10000);
>>>>>>> origin/master
		
		
		WebElement province = driver.findElement(By.xpath("//form/div[1]/div[1]/select"));
		province.click();
		WebElement province2= driver.findElement(By.xpath("//option[contains(text(),'Lusaka')]"));
		province2.click();
		Thread.sleep(1000);
		
		WebElement district1 = driver.findElement(By.xpath("//form/div[1]/div[2]/select"));
		district1.click();
		WebElement district2 = driver.findElement(By.xpath("//form/div[1]/div[2]/select/option[6]"));
		district2.click();
		Thread.sleep(2000);
		
		WebElement facility = driver.findElement(By.xpath("//form/div[1]/div[3]/div/div[2]/input"));
		facility.click(); 
		facility.sendKeys("Dr. Watson Dental Clinic");
		Thread.sleep(2000);
		WebElement facility2 = driver.findElement(By.xpath("//div[contains(text(),'Dr. Watson Dental Clinic')]"));
		facility2.click();
		Thread.sleep(5000);
		
		WebElement btn = driver.findElement(By.className("button"));
		btn.click();
<<<<<<< HEAD
		Thread.sleep(30000);
=======
		Thread.sleep(5000);
>>>>>>> origin/master
		
		
		WebElement nrc = driver.findElement(By.xpath("//form/div[1]/div[1]/div[1]/input"));
		nrc.sendKeys("111111111");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//form/div[2]/button[1]"));
		search.click();
<<<<<<< HEAD
		Thread.sleep(30000);
		
		WebElement patiendt = driver.findElement(By.xpath("//button[contains(text(),'Attend to Patient')]"));
		patiendt.click();
		Thread.sleep(30000);
=======
		Thread.sleep(10000);
		
		WebElement patiendt = driver.findElement(By.xpath("//button[contains(text(),'Attend to Patient')]"));
		patiendt.click();
		Thread.sleep(5000);
>>>>>>> origin/master
		
		WebElement vital = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]"));
		vital.click();
		Thread.sleep(4000);
		
		WebElement addVital = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		addVital.click();
<<<<<<< HEAD
		Thread.sleep(30000);
=======
		Thread.sleep(10000);
>>>>>>> origin/master
				////body/div[@id='root']/div[2]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]
		/*
		 *  //body/div[@id='root']/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/div[1]/img[1]
		 *  //body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]
		 * 
		 */
	}

}
