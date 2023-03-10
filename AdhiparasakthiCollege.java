package Pappaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdhiparasakthiCollege {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://devadch.pappaya.com/application-form");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//APPLICANT DETAILS
			driver.findElement(By.id("first_name")).sendKeys("Zack");
			driver.findElement(By.id("last_name")).sendKeys("Williams");
			driver.findElement(By.id("dob")).sendKeys("01042005");
			driver.findElement(By.id("mobile")).sendKeys("9988990099");
			driver.findElement(By.name("emailid")).sendKeys("zack@gmail.com");
			driver.findElement(By.id("critical_father_mobile")).sendKeys("7777688654");
			driver.findElement(By.id("critical_guardian_mobile")).sendKeys("6677655654");
			WebElement genderElement = driver.findElement(By.id("gender"));
			Select gender = new Select(genderElement);
			gender.selectByVisibleText("Male");
			WebElement religionElement = driver.findElement(By.id("religion"));
			Select Religion = new Select(religionElement);
			Religion.selectByValue("2");
			WebElement communityElement = driver.findElement(By.id("caste"));
		    Select Community = new Select(communityElement);
		    Community.selectByVisibleText("OC");
		    //PARENT DETAILS
		    driver.findElement(By.name("father_name")).sendKeys("Larry");
			driver.findElement(By.id("father_number")).sendKeys("7777688654");
			driver.findElement(By.name("father_mail")).sendKeys("larry@gmail.com");
		    driver.findElement(By.name("mother_name")).sendKeys("Candice");
			driver.findElement(By.id("m_number")).sendKeys("7777655659");
			driver.findElement(By.name("m_mail")).sendKeys("candi@gmail.com");
	        driver.findElement(By.name("guardian_name")).sendKeys("Vijay");
			driver.findElement(By.id("guardian_number")).sendKeys("6677655654");
			driver.findElement(By.name("guardian_mail")).sendKeys("vjay@gmail.com");
			//CONTACT DETAILS
		    driver.findElement(By.name("door_no")).sendKeys("No:4, Ganapathy street, Radhai Nagar");
		    driver.findElement(By.name("street_name")).sendKeys("No:4, Ganapathy street, Radhai Nagar");
		    driver.findElement(By.name("area")).sendKeys("Chennai");
		    WebElement stateElement = driver.findElement(By.id("state"));
		    Select State = new Select(stateElement);
		    State.selectByValue("720");
		    driver.findElement(By.name("pincode")).sendKeys("600016");
		    driver.findElement(By.name("billingtoo")).click();
		    //Qualifying Exam Details (12th)
		    driver.findElement(By.name("schoolnametwelve")).sendKeys("ABP PUBLIC SCHOOL");
		    driver.findElement(By.id("month-year-hsc")).sendKeys("March");
	        Actions a = new Actions(driver);
	        a.sendKeys(Keys.TAB).build().perform();
	        driver.findElement(By.id("month-year-hsc")).sendKeys("2023");
	        WebElement mediumElement = driver.findElement(By.name("twelvemedium"));
	        Select Medium = new Select(mediumElement);
	        Medium.selectByVisibleText("English");
	        WebElement boardElement = driver.findElement(By.name("twelveboard"));
	        Select Board = new Select(boardElement);
	        Board.selectByVisibleText("State Board");
	        driver.findElement(By.id("awaiting")).click();
	        WebElement sub1Ele = driver.findElement(By.id("twelvesubject1"));
	        Select Sub1 = new Select(sub1Ele);
	        Sub1.selectByVisibleText("English");
	        WebElement sub2Ele = driver.findElement(By.id("twelvesubject2"));
	        Select Sub2 = new Select(sub2Ele);
	        Sub2.selectByVisibleText("Tamil");
	        WebElement sub3Ele = driver.findElement(By.id("twelvesubject3"));
	        Select Sub3 = new Select(sub3Ele);
	        Sub3.selectByVisibleText("Mathematics");
	        WebElement sub4Ele = driver.findElement(By.id("twelvesubject4"));
	        Select Sub4 = new Select(sub4Ele);
	        Sub4.selectByVisibleText("Physics");
	        WebElement sub5Ele = driver.findElement(By.id("twelvesubject5"));
	        Select Sub5 = new Select(sub5Ele);
	        Sub5.selectByVisibleText("Chemistry");
	        WebElement sub6Ele = driver.findElement(By.id("twelvesubject6"));
	        Select Sub6 = new Select(sub6Ele);
	        Sub6.selectByVisibleText("Computer Science");
	        //Courses preferred
	        WebElement courseEle = driver.findElement(By.id("courseapplied"));
	        Select Course = new Select(courseEle);
	        Course.selectByValue("51");
	        driver.findElement(By.xpath("(//input[@name='proficiency'])[2]")).click();
	        driver.findElement(By.id("dec")).click();
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        
	        System.out.println();

		}

	}