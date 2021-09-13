package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadStep extends BaseClassLead{
	@When("Click on Find Leads Button1")
	public void findLeadwin3() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Click on Phone in DeleteLead")
	public void phone1() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the phone number as <phno> in delete")
	public void phno3() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");	
	}
	@When("Click on Find Leads Button in window1")
	public void findLeadbut4() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Delete the Lead and search")
	public void delete() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	
	@Then("Search for deleted record")
	public void verify() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
