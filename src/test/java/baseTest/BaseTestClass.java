package baseTest;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BaseTestClass {

    static public WebDriver driver;
    public Logger logger;
    public Properties proObject;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {

        //read properties file
        FileReader file = new FileReader(".//src//test//resources//config.properties");
        //create object of properties class
        proObject = new Properties();
        //load properties file
        proObject.load(file);
        //get the value of properties
        String browserName = proObject.getProperty("browsername");

        logger = LogManager.getLogger(this.getClass());
        //driver = new ChromeDriver();
        switch(browserName.toUpperCase()){  //CHROME
            case "CHROME":
                driver = new ChromeDriver();
                break;
            case "EDGE":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser not supported");
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(proObject.getProperty("url"));
        driver.manage().window().maximize();
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    public void setInutField(String fieldName, String value) {
        driver.findElement(By.xpath("//label[contains(text(),'"+fieldName+"')]/following::input[1]")).sendKeys(value);
    }

    public String captureScreen(String tname) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
        File targetFile=new File(targetFilePath);
        FileUtils.copyFile(sourceFile,targetFile);
        //sourceFile.renameTo(targetFile);
        return targetFilePath;


        // this is anew line
        // this is anew line
        // this is anew line
        // this is anew line
        // this is anew line
        // this is anew line
        // this is anew line

    }



}
