package week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaftop");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vimala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		WebElement src =driver.findElement(By.name("dataSourceId"));
        Select Emp =new Select(src);
        Emp.selectByVisibleText("Employee");
        WebElement markcam =driver.findElement(By.name("marketingCampaignId"));
        Select pay=new Select(markcam);
        pay.selectByValue("9001");
        WebElement owner =driver.findElement(By.name("ownershipEnumId"));
        Select sh=new Select(owner);
        sh.selectByIndex(5);
        WebElement gen =driver.findElement(By.name("generalCountryGeoId"));
        Select ind =new Select(gen);
        ind.selectByVisibleText("India");
        driver.findElement(By.className("smallSubmit")).click();
        System.out.println(driver.getTitle());
		
	}

}
