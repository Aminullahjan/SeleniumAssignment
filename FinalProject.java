import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FinalProject {

	public static void main(String[] args) throws InterruptedException {
		// Final Project

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Welcome, please sign in!'])[1]/following::div[2]")).click();
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		driver.findElement(By.linkText("Customers")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear cache'])[1]/following::p[20]")).click();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");
		driver.findElement(By.linkText("Add new")).click();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/Create");
		driver.findElement(By.id("Email")).click();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("jaminullah@gmail.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("Osman@123");
		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("Aminullah");
		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("Jawad");
		driver.findElement(By.id("Gender_Male")).click();
		driver.findElement(By.xpath("//div[@id='customer-info']/div[2]/div[6]/div[2]/span/span/span")).click();

		// Date of birth
		String exp_month = "January 1990";
		String exp_date = "1";

		while (true) {

			String month = driver.findElement(By.xpath("//*[@id=\"1007564c-f37b-4e98-84ce-5e0ff2590b6a\"]/div[1]/a[2]"))
					.getText();

			if (month.equals("exp_month")) {
				break;
			}

			else {
				driver.findElement(By.xpath("//*[@id=\"1007564c-f37b-4e98-84ce-5e0ff2590b6a\"]/div[1]/a[3]/span"))
						.click();
			}

			List<WebElement> ele = (List<WebElement>) driver.findElement(By.xpath("//tbody//tr//td/a"));

			for (WebElement element : ele) {
				element.click();
				break;
			}
		}

		driver.findElement(By.id("Company")).click();
		driver.findElement(By.id("Company")).clear();
		driver.findElement(By.id("Company")).sendKeys("LSSNCA");
		driver.findElement(By.id("IsTaxExempt")).click();
		driver.findElement(By.xpath("//div[@id='customer-info']/div[2]/div[9]/div[2]/div/div/div/div")).click();
		driver.findElement(By.xpath("//ul[@id='SelectedNewsletterSubscriptionStoreIds_listbox']/li[2]")).click();
		driver.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='customer-info']/div[2]/div[10]/div[2]/div/div/div/div")).click();
		driver.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']/li")).click();
		driver.findElement(By.id("VendorId")).click();
		new Select(driver.findElement(By.id("VendorId"))).selectByVisibleText("Vendor 1");
		driver.findElement(By.id("Active")).click();
		driver.findElement(By.id("Active")).click();
		driver.findElement(By.id("AdminComment")).click();
		driver.findElement(By.id("AdminComment")).click();
		driver.findElement(By.id("AdminComment")).clear();
		driver.findElement(By.id("AdminComment")).sendKeys("I have successfully added a customer into system.");
		driver.findElement(By.id("AdminComment")).click();
		driver.findElement(By.id("AdminComment")).clear();
		driver.findElement(By.id("AdminComment")).sendKeys("I have successfully added a customer into the system.");
		driver.findElement(By.name("save-continue")).click();

	}

}
