package week2day1assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathsession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
        //driver.findElement(By.xpath("//a[text()='Debit Limited Account']")).click();
        driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account123");
        driver.findElement(By.xpath("//textarea[1]")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("vims");
       // driver.findElement(By.xpath("//input[@id='officeSiteName]']")).sendKeys("tapleaf");
        driver.findElement(By.xpath(" //input[@id='officeSiteName']")).sendKeys("Testleafpractise");
        driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
        WebElement Enum=driver.findElement(By.name("industryEnumId"));
        Select ind=new Select(Enum);
        ind.selectByIndex(3);
        WebElement own =driver.findElement(By.name("ownershipEnumId"));
        Select corp=new Select(own);
        corp.selectByVisibleText("S-Corporation");
        WebElement src =driver.findElement(By.name("dataSourceId"));
        Select Emp=new Select(src);
        Emp.selectByValue("LEAD_EMPLOYEE");
        WebElement mark=driver.findElement(By.name("marketingCampaignId"));
        Select ecom=new Select(mark);
        ecom.selectByIndex(6);
        WebElement gen =driver.findElement(By.name("generalStateProvinceGeoId"));
        Select tex =new Select(gen);
        tex.selectByValue("TX");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
         
        
	}

}
