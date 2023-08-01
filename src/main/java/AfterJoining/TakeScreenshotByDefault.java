package AfterJoining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotByDefault {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		
		driver.get("https://github.com/andygibson/datafactory");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("‪C:\\Users\\Itsme\\eclipse-workspace\\My_project\\SkipScreenshot");
//		try {
//			FileUtils.copyFile(src, dest);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		driver.close();

	}

}
