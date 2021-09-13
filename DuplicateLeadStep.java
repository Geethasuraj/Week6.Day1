package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DuplicateLeadStep extends BaseClassLead {
	@When("Click on Find Leads Button")
	public void findLeadswin1() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on Phone in DuplicateLead")
	public void phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the phone number as <phno> in duplicate")
	public void phno2() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@When("Click on Find Leads Button in window")
	public void findLeadsbut2() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	}
	@When("Click on first record in Duplicate")
	public void first() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Click on Duplicate Record Button")
	public void duplicate() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@When("Click on Submit Button in Duplicate")
	public void submit3() {
		driver.findElement(By.name("submitButton")).click();
	}

}
