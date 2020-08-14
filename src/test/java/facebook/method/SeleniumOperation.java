package facebook.method;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperation
{
    static ChromeDriver driver=null;
	  public static void browserLaunch(String browserproperty, String exepath)
	   {
		   String browser=browserproperty;
		   String exe=exepath;
		   
		   System.setProperty(browser, exe);
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
	   }
	  
	  public static void applicationLaunch(String url)
	  {
		  String Urlname=url;
		  driver.get(Urlname);
	  }
      
	  public static void username(String uname)
	  {
		  String name=uname;
		  driver.findElementByXPath("//*[@name='email']").sendKeys(name);
	  }
	  
	  public static void password(String pname)
	  {
		  String name1=pname;
		  driver.findElementByXPath("(//*[@type='password'])[1]").sendKeys(name1);
	  }
	  
	  public static void clickonLogin()
	  {
		  driver.findElementByXPath("(//*[@type='submit'])[1]").click();
	  }
	  
	  public static void validation()
	  {
		  driver.findElementByXPath("//*[text()='Facebook']");
	  }

	public static void main(String[] args) 
	{
		browserLaunch("webdriver.chrome.driver", "E:\\\\Pappppppppu\\\\Facebook\\\\src\\\\test\\\\resources\\\\DRIVER\\\\chromedriver.exe");
		applicationLaunch("https://www.facebook.com/");
		username("Indra@123");
		password("Ishu1234");
		clickonLogin();

	}

}
