package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeadStep extends BaseClassLead {
	String leadID;
	@When("Click on Merge Leads Button")
	public void merge() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	@When("Click on Find Leads Button by entering the fname in lookup1 and lookup along with that get leadid")
	public void mergetext() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Geetha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Dhana");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
	}
	@When("Click on Merge Button")
	public void mergebutton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}
	@When("Click on Find Leads Button in merge")
	public void findmerge() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Enter the LeadId in merge")
	public void  leadmerge() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@When("Click on Find Leads Button in merge window")
	public void findLeadMerge() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Verify the text for records")
	public void verifyMerge() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
