package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppageobject {
public WebDriver driver;
private	By a=By.xpath("//input[@name=\"UserFirstName\"]");
private	By b=By.xpath("//input[@name=\"UserLastName\"]");
private	By c=By.xpath("//input[@name=\"UserTitle\"]");
private By d=By.xpath("//span[contains(text(),'Next')]");	
private By e=By.xpath("//select[@name=\"CompanyEmployees\"]");	
private By f=By.xpath("//input[@name=\"CompanyName\"]");
private By g=By.xpath("//select[@name=\"CompanyCountry\"]");
	public signuppageobject(WebDriver driver) {
   this.driver=driver;
}

	public WebElement userfirstname() {
		
	return driver.findElement(a);
	}
	
	public WebElement userlastname() {
		return driver.findElement(b);
	}
	
	public WebElement usertitle() {
		return driver.findElement(c);
	}
	
	public WebElement clickonnextbutton() {
		return driver.findElement(d);
	}
	
	
	public WebElement companyemployee() {
		
		return driver.findElement(e);
	}
	
	
	public WebElement companyname() {
		return driver.findElement(f);
	}
	
	
	public WebElement companycountry() {
		return driver.findElement(g);
	}
	
	
}
