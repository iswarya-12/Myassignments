package week1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LauchProgram {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DLF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ishu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.className("inputBox")).sendKeys("ishm");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Electrical");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hello everyone");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("heelo@gmail.com");
		WebElement statecode = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(statecode);
		dd.selectByVisibleText("Indiana");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
