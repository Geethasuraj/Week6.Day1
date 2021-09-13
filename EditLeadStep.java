package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLeadStep extends BaseClassLead {
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

	@And("Click on Find Leads Button in Edit")
	public void findLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Click on Phone")
	public void phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter the phone number as {string}")
	public void phno1(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}

	@When("Click on Find Leads Button in the window")
	public void findLeadswin() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@And("Click on first record in Edit")
	public void firstrecord() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@And("Click on Edit Button")
	public void edit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Enter the company  name as {string}")
	public void comname(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}

	@When("Click on Submit Button in Edit")
	public void submit1() {
		driver.findElement(By.name("submitButton")).click();
	}
}
