package facebook.method;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOperation1 
{
	   public static WebDriver driver=null;
	   
	 public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	   
		public static Hashtable<String,Object> browserLaunch(Object [] inputparameters)
		{   
			try{
			String strbrowsername=(String) inputparameters[0];
			String webDriverExepath=(String) inputparameters[1];
			
			if(strbrowsername.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", webDriverExepath);
				 driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(strbrowsername.equalsIgnoreCase("FF"))
			{
				System.setProperty("webdriver.FF.driver", webDriverExepath);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
			}
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
			}
			return outputParameters;
		}
		
		public static Hashtable<String,Object> applicatinLaunch(Object [] inputparameters)
		{   
			try {
			String strURL=(String) inputparameters[0];
			    driver.get(strURL);
		
			    
			    outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "Action: Application Launch, Input Given:"+inputparameters[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: Application Launch, Input Given:"+inputparameters[0].toString());
			}
				return outputParameters;
		}
		
		public static Hashtable<String,Object> sendkeys(Object [] inputparameters)
		{    
			try {
			String xpath=(String) inputparameters[0];
			String value=(String) inputparameters[1];
			WebElement obj=driver.findElement(By.xpath(xpath));
			           obj.clear();
			           obj.sendKeys(value);
			           
			    outputParameters.put("STATUS", "PASS");
			    outputParameters.put("MESSAGE", "Action: Sendkeys, Input Given:"+inputparameters[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: Sendkeys, Input Given:"+inputparameters[0].toString());
			}
					return outputParameters;
		}
		
		public static Hashtable<String,Object> clickonLogin(Object [] inputparameters)
		{   
			try {
			String xpath=(String) inputparameters[0];
			WebElement obj1=driver.findElement(By.xpath(xpath));
			           obj1.click();
			  
			   outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: click on login, Input Given:"+inputparameters[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: Sendkeys, Input Given:"+inputparameters[0].toString());
			}
					return outputParameters;
		}
		 
		public static Hashtable<String,Object> validation(Object [] inputparameters)
		{   
			
			String xpath=(String) inputparameters[0];
			String String1=(String) inputparameters[1];
			WebElement web=driver.findElement(By.xpath(xpath));
			         
			    String String2=web.getText();
			  
			    try
			    {
			    if(String1.equalsIgnoreCase(String2))
			    {
			    	System.out.println("Test case Pass");
			    }
			    else 
			    {
			    	System.out.println("Test case Fail");
			    }
			    
			    outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "Action: Validation, Input Given:"+inputparameters[0].toString());
			    }
			   catch(Exception e)
			   {
				   outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "Action: Validation, Input Given:"+inputparameters[0].toString());
			   }
			
				return outputParameters;
		
			
			}
			    		
		


	public static void main(String[] args)
	{


	}

}
