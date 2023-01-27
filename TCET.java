package office_work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TCET {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://tcet.pappaya.com/");
        driver.manage().window().maximize();
        
        //implicit wait
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //actions
        
        Actions a = new Actions(driver);

        //APPLICANT DETAILS
        
        driver.findElement(By.xpath("//span[text()='Application Form']")).click();
        driver.findElement(By.id("first_name")).sendKeys("NIJAY");
        driver.findElement(By.id("last_name")).sendKeys("PAWAN");
        driver.findElement(By.id("dob")).sendKeys("02022001");
        driver.findElement(By.id("mobile")).sendKeys("9999999999");
        driver.findElement(By.id("emailid")).sendKeys("nr@gmail.com");

        // Waiting for the page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender")));

        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        WebElement genderElement = driver.findElement(By.id("gender"));
        Select Gender = new Select(genderElement);
        Gender.selectByIndex(1);
        WebElement relegionElement = driver.findElement(By.id("religion"));
        Select Relegion = new Select(relegionElement);
        Relegion.selectByIndex(1);
        WebElement casteElement = driver.findElement(By.id("caste"));
        Select Caste = new Select(casteElement);
        Caste.selectByIndex(1);
    
        //PARENT DETAILS
        
        driver.findElement(By.name("father_name")).sendKeys("Manjith");
        driver.findElement(By.name("father_number")).sendKeys("9098998765");
        driver.findElement(By.name("mother_name")).sendKeys("Geetha");
        driver.findElement(By.name("m_number")).sendKeys("9098997875");
        
        //CONTACT DETAILS
        
        driver.findElement(By.name("door_no")).sendKeys("No. 32");
        driver.findElement(By.name("street_name")).sendKeys("Kamaraj Street");
        driver.findElement(By.name("area")).sendKeys("Anna Nagar");
        driver.findElement(By.name("city")).sendKeys("Chennai");
        driver.findElement(By.name("district")).sendKeys("Chennai");
        
        WebElement countryElement = driver.findElement(By.id("country"));
        Select Country = new Select(countryElement);
        Country.selectByIndex(1);
        
//        Thread.sleep(1000);
        
        WebElement stateElement = driver.findElement(By.id("state"));
        driver.findElement(By.id("state")).click();
        Select State = new Select(stateElement);
        State.selectByVisibleText("Tamil Nadu");
//        State.selectByIndex(2);
        
        driver.findElement(By.name("pincode")).sendKeys("600001");
        
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        
//      QUALIFYING EXAM 12th
        
        driver.findElement(By.name("schoolnametwelve")).sendKeys("Montfort MHSS");
        WebElement MonthYearHSC = driver.findElement(By.id("month-year-hsc"));
        driver.findElement(By.id("month-year-hsc")).sendKeys("May");
        a.sendKeys(Keys.TAB).build().perform();
        a.sendKeys(MonthYearHSC, "2022").build().perform();
        a.sendKeys(Keys.TAB).build().perform();
        
     // Waiting for the page to load
        WebDriverWait waitMedium = new WebDriverWait(driver, Duration.ofSeconds(10));
    
        waitMedium.until(ExpectedConditions.visibilityOfElementLocated(By.name("twelvemedium")));
        
        WebElement mediumElement = driver.findElement(By.name("twelvemedium"));
        Select Medium = new Select(mediumElement);
        Medium.selectByIndex(2);
        WebElement boardElement = driver.findElement(By.name("twelveboard"));
        Select Board = new Select(boardElement);
        Board.selectByIndex(2);
        
        //SUBJECTS
        
        WebElement sub1Element = driver.findElement(By.name("twelvesubject1"));
        Select Subject1 = new Select(sub1Element);
        Subject1.selectByVisibleText("Language I");
        WebElement sub2Element = driver.findElement(By.name("twelvesubject2"));
        Select Subject2 = new Select(sub2Element);
        Subject2.selectByVisibleText("Mathematics");
        WebElement sub3Element = driver.findElement(By.name("twelvesubject3"));
        Select Subject3 = new Select(sub3Element);
        Subject3.selectByVisibleText("Physics");
        WebElement sub4Element = driver.findElement(By.name("twelvesubject4"));
        Select Subject4 = new Select(sub4Element);
        Subject4.selectByVisibleText("Chemistry");
        WebElement sub5Element = driver.findElement(By.name("twelvesubject5"));
        Select Subject5 = new Select(sub5Element);
        Subject5.selectByVisibleText("Biology");
        
        //COURSES
        
        WebElement courseElement = driver.findElement(By.name("courseapplied"));
        Select Course = new Select(courseElement);
        Course.selectByVisibleText("Regular-UG-BE-Aeronautical Engineering");
        
        driver.findElement(By.xpath("(//input[@name='proficiency'])[2]")).click();
        
        driver.findElement(By.xpath("(//input[@name='hostel_wanted'])[2]")).click();
        
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        
        driver.findElement(By.name("passport_input")).sendKeys("E:\\Jasper\\private\\JAVA\\Automation\\data\\Profile-Male-PNG.png");   
       
       // driver.findElement(By.xpath("(//input[@name='declaration'])")).click();
        
        driver.findElement(By.xpath("(//input[@type='submit'])")).click();
        
        
    }
}
