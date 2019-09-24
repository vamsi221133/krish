package selenium_test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class print_screen_test {
	public static void main(String ar[]) throws IOException
	{
		//ujhighjignji
		//uhguuhu
		System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\Desktop\\vishwa\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		// WebDriver driver =new FirefoxDriver();
		 driver.manage().window().maximize();
		// driver.get("https://www.toolsqa.com/");
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIktfF_cDK5AIVwoRwCh2k9AXuEAAYASAAEgKz6vD_BwE&ef_id=EAIaIQobChMIktfF_cDK5AIVwoRwCh2k9AXuEAAYASAAEgKz6vD_BwE:G:s&s_kwcid=AL!739!3!326505318642!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		/*TakesScreenshot shot=((TakesScreenshot)driver);
		for(int i=1;i<=4;i++)
		{
			File SrcFile=shot.getScreenshotAs(OutputType.FILE);
		File desFile=new File("C:\\Users\\training\\Videos\\scr.jpg");
		Files.copy(SrcFile, desFile);
		}*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div[2]/div[4]/div/div[2]/div/div[1]/div/div[4]/div/a/div[1]/div/img"));
		js.executeScript("arguments[0],scrollntoView();",element);
	}

}
