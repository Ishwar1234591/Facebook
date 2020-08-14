package facebook.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Pappppppppu\\Facebook\\src\\test\\resources\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.get("https://www.facebook.com/");
		driver.findElementByXPath("//*[@name='email']").sendKeys("Indra@123");
		driver.findElementByXPath("(//*[@type='password'])[1]").sendKeys("Ishu1234");
		driver.findElementByXPath("//*[@name='login']").click();
		


	}

}


