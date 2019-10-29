package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Demoregisterlogin {
	WebDriver d;
	@Given("Karthik launvhed chrome browser")
	public void karthik_launvhed_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
	}

	@Given("launched demowebshop url")
	public void launched_demowebshop_url() {
		d.get("http://demowebshop.tricentis.com/");   
	}

	@When("clicked on register button")
	public void clicked_on_register_button() {
		d.findElement(By.xpath("//a[@class='ico-register']")).click(); 
	}

	@When("gives correct credentials")
	public void gives_correct_credentials() {
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys("pakk@gmail.com");
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		d.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("password");
		d.findElement(By.xpath("//input[@id='register-button']")).click();
	}

	@Then("user gets sucessful registration message")
	public void user_gets_sucessful_registration_message() {
		String a_txt= d.getTitle();
		   String e_txt="Demo Web Shop. Register";
		   Assert.assertEquals(e_txt,a_txt);
	        
	}

	@When("clicked on login button")
	public void clicked_on_login_button() {
		d.findElement(By.xpath("//a[@class='ico-login']")).click();
	}

	@When("user gives correct credentials")
	public void user_gives_correct_credentials() {
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys("pax@gmail.com");
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("krish123");
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("user moves to home page")
	public void user_moves_to_home_page() {
		String a_txt=d.getTitle();
		   String e_txt="Demo Web Shop";
		   Assert.assertEquals(e_txt, a_txt);
		   d.close(); 
	}

}
