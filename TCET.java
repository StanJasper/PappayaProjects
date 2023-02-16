package office;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TCET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tcet.pappaya.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click Application Form
		driver.findElement(By.xpath("//span[text()='Application Form']")).click();
		//First name, Last name, DOB
		driver.findElement(By.id("first_name")).sendKeys("ANAND");
		driver.findElement(By.id("last_name")).sendKeys("SAMINATHAN");
		driver.findElement(By.id("dob")).sendKeys("01012005");
		//Mobile number, Email id
		driver.findElement(By.id("mobile")).sendKeys("4969007890");
		driver.findElement(By.name("emailid")).sendKeys("anndh@gmail.com");
		//Gender
		WebElement genderElement = driver.findElement(By.id("Gender"));
		Select Gender = new Select(genderElement);
		Gender.selectByVisibleText("Male");
		//Religion
		WebElement religionElement = driver.findElement(By.id("religion"));
		Select Religion = new Select(religionElement);
		Religion.selectByVisibleText("Hindu");
		//Community
		WebElement communityElement = driver.findElement(By.id("caste"));
	    Select Community = new Select(communityElement);
	    Community.selectByVisibleText("OC");
	    //Citizenship
	    WebElement citiElement = driver.findElement(By.id("citizenship"));
	    Select Citizenship = new Select(citiElement);
	    Citizenship.selectByValue("1");
	    //Mothertongue
	    WebElement motherElement = driver.findElement(By.id("mother_tongue"));
	    Select Mothertongue = new Select(motherElement);
	    Mothertongue.selectByValue("1");
	    //Parent details
	    driver.findElement(By.name("father_name")).sendKeys("Raaetsz");
	    driver.findElement(By.name("father_number")).sendKeys("5969022504");
	    driver.findElement(By.name("mother_name")).sendKeys("Razzsaes");
	    driver.findElement(By.name("m_number")).sendKeys("3769002904");
	    //Contact details
	    driver.findElement(By.name("door_no")).sendKeys("27");
	    driver.findElement(By.name("street_name")).sendKeys("Visu Street");
	    driver.findElement(By.name("area")).sendKeys("Chromepet");
	    driver.findElement(By.name("city")).sendKeys("Chennai");
	    driver.findElement(By.name("district")).sendKeys("Chengalpet");
	    WebElement ctryElement = driver.findElement(By.name("country"));
	    Select Country = new Select(ctryElement);
	    Country.selectByVisibleText("India");
	    WebElement stateElement = driver.findElement(By.id("state"));
	    //driver.findElement(By.id("state")).click();
	    Select State = new Select(stateElement);
	    State.selectByVisibleText("Tamil Nadu");
	    driver.findElement(By.id("pincode")).sendKeys("600044");
	    //driver.findElement(By.name("billingtoo")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	    //Qualifying Exam Details 12th/Diploma
	    driver.findElement(By.name("schoolnametwelve")).sendKeys("ABP SCHOOL");
	    driver.findElement(By.id("month-year-hsc")).sendKeys("March");
        Actions a = new Actions(driver);
        a.sendKeys(Keys.TAB).build().perform();
        driver.findElement(By.id("month-year-hsc")).sendKeys("2023");
        driver.findElement(By.id("village_town_city")).sendKeys("Chennai");
        WebElement mediumElement = driver.findElement(By.name("twelvemedium"));
        Select Medium= new Select(mediumElement);
        Medium.selectByVisibleText("English");
        WebElement boardElement = driver.findElement(By.name("twelveboard"));
        Select Board = new Select(boardElement);
        Board.selectByVisibleText("State Board");
        //Courses Prefered
        WebElement courseElement = driver.findElement(By.id("courseapplied"));
        Select Course = new Select(courseElement);
        Course.selectByValue("94");
        WebElement course2Element = driver.findElement(By.id("courseapplied_2"));
        Select Course2 = new Select(course2Element);
        Course2.selectByValue("95");
        WebElement course3Element = driver.findElement(By.id("courseapplied_3"));
        Select Course3 = new Select(course3Element);
        Course3.selectByValue("89");
        driver.findElement(By.xpath("(//input[@name='proficiency'])[2]")).click();
        driver.findElement(By.xpath("(//input[@name='hostel_wanted'])[2]")).click();
        //Declaration
        driver.findElement(By.id("dec")).click();
        //Submit
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        







		

	}

}
