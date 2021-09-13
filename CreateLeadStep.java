package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStep extends BaseClassLead{
	
	/*@Given("Enter the username as {string}")
	public void username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@And("Enter the password as {string}")
	public void password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on Login button")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Click on CRMSFA link")
	public void crmlink() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@And("Click on Leads Button")
	public void leads() {
		driver.findElement(By.linkText("Leads")).click();
	}*/
	
	@When("Click on Create Leads Button")
	public void click_on_create_leads_button(){
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the companyName as {string}")
	public void enter_the_company_name_as(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	@And("Enter the firstname as {string}")
	public void fname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@And("Enter the lastname as {string}")
	public void lname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@And("Enter the phonenumber as {string}")
	public void phnum(String phnum) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
	}
	@When("Click on Submit button")
	public void submit() {
		driver.findElement(By.name("submitButton")).click();
	}

}
