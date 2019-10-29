package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class fblogin {
	WebDriver d;

@Given("user is in fb login page")
public void user_is_in_fb_login_page() {
    System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
    d=new ChromeDriver();
    d.get("http://en-gb.facebook.com/login/");
    
}

@When("user provides correct credentials")
public void user_provides_correct_credentials() {
    d.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijit1997bam@gmail.com");
    d.findElement(By.xpath("//input[@id='pass']")).sendKeys("pppp");
    d.findElement(By.name("login")).click(); 
}
@When("clicks on login button")
public void clicks_on_login_button() {
	d.findElement(By.name("login")).click(); 
}

@Then("user is on homepage")
public void user_is_on_homepage() {
    System.out.println("Hello iam in home page");

}

@Then("sees the title of page is Facebook")
public void sees_the_title_of_page_is_Facebook() {
	String a_txt=d.getTitle();
	 String e_txt="facebook";
	 Assert.assertEquals(e_txt,a_txt);
	 System.out.println("sucessful login");
	    
    
}


}
