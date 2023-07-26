package week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com");
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		driver.findElement(By.xpath("(//label[@for='j_idt87:basic:0'])")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).isSelected();
        driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click(); 
        boolean enabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
        if(enabled) {
        	System.out.println("enabled");
        }else { 	
        	System.out.println("Disabled");
        }
        	driver.findElement(By.xpath("(//ul[@data-label='Cities']")).click();
        	driver.findElement(By.xpath("(//label[text()='Miami'])[2]'")).click();
        	driver.findElement(By.xpath("(//label[text()='London'])[2]'")).click();
	
        	
	}

        		
        		
}

