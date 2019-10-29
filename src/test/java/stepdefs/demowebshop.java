package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class demowebshop {
	WebDriver d;
	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://demowebshop.tricentis.com/");
	   
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
		d.findElement(By.xpath("//a[@class='ico-login']")).click();
	    
	}
	@When("user types {string} and {string} credentials")
	public void user_types_and_credentials(String email, String password) {
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}

	@When("user clicks on login option")
	public void user_clicks_on_login_option() {
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("user is on the home page")
	public void user_is_on_the_home_page() {
	   String a_txt= d.getTitle();
	   String e_txt="Demo Web Shop";
	   Assert.assertEquals(e_txt,a_txt);
	}

	
	
	
	
@Given("above user is in login page")
public void above_user_is_in_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("http://demowebshop.tricentis.com/");
   
    
}

@Given("above user clicks on login button")
public void above_user_clicks_on_login_button() {
	d.findElement(By.xpath("//a[@class='ico-login']")).click();
}


@When("avove user types emailme and passwordme credentials")
public void avove_user_types_emailme_and_passwordme_credentials() {
	d.findElement(By.xpath("//input[@id='Email']")).sendKeys("path456@gmail.com");
	d.findElement(By.xpath("//input[@id='Password']")).sendKeys("path456");
   
}

@When("above user clicks on login option")
public void above_user_clicks_on_login_option() {
	d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();  
}

@Then("above user is on the home page")
public void above_user_is_on_the_home_page() {
	 String a_txt= d.getTitle();
	   String e_txt="Demo Web Shop";
	   Assert.assertEquals(e_txt,a_txt);
   
}






	@Given("again user is on demo webshop")
	public void again_user_is_on_demo_webshop() {
	    
	}

	@Given("User clicks on shopping cart")
	public void user_clicks_on_shopping_cart() {
	   
	}

	@When("user gives the product name")
	public void user_gives_the_product_name() {
	  
	}

	@Then("list of product is displayed")
	public void list_of_product_is_displayed() {
	    
	}



}
