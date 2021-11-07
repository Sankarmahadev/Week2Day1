package Week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentone {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Sankar");
	    driver.findElement(By.id("lastNameField")).sendKeys("M");
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	    System.out.println(text);
	   driver.close();
	}
	
}	    
	    
