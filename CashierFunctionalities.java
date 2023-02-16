package office;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CashierFunctionalities {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://tcet.pappaya.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.xpath("//b[text()='Sign in']")).click();
     driver.findElement(By.id("login")).sendKeys("tcetcashier");
     driver.findElement(By.id("password")).sendKeys("Pappaya@123");
     driver.findElement(By.xpath("//button[text()='Login']")).click();
     driver.findElement(By.xpath("//a[@class='dropdown full']")).click();
     driver.findElement(By.xpath("(//span[@class='oe_menu_text'])[2]")).click();
     driver.findElement(By.xpath("//span[@class='fa arrow']")).click();
     driver.findElement(By.xpath("(//span[@class='oe_menu_text nav-label'])[2]")).click();
     driver.findElement(By.xpath("//ul[@class='nav nav-second-level collapse in']//li[3]//span/parent::a")).click();
     driver.findElement(By.xpath("(//a[@class='oe_menu_leaf'])[4]")).click();
     driver.findElement(By.xpath("(//td[@class='o_data_cell o_list_button o_invisible_modifier'])[1]")).click();
	}

}
