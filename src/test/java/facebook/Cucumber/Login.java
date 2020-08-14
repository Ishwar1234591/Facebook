package facebook.Cucumber;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import facebook.method.SeleniumOperation1;

public class Login
{
	@When("^user open the \"([^\"]*)\" and exe \"([^\"]*)\"$")
	public void user_open_the_and_exe(String arg1, String arg2) throws Throwable 
	{
		Object [] input=new Object[2];
		input [0]="Chrome";
		input [1]="E:\\\\Pappppppppu\\\\Facebook\\\\src\\\\test\\\\resources\\\\DRIVER\\\\chromedriver.exe";
		SeleniumOperation1.browserLaunch(input);
	}

	@When("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String arg1) throws Throwable 
	{
		Object [] input2=new Object[1];
		input2 [0]="https://www.facebook.com/";
		SeleniumOperation1.applicatinLaunch(input2);
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable 
	{
		Object [] input3=new Object[2];
		input3 [0]="//*[@name='email']";
		input3 [1]="Indra@123";
	    Hashtable<String,Object> input3obj=SeleniumOperation1.sendkeys(input3);
	    HTMLReportGenerator.StepDetails(input3obj.get("STATUS").toString(), "user enters \"([^\"]*)\" as username", input3obj.get("MESSAGE").toString());
    }

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable 
	{
		Object [] input4=new Object[2];
		input4 [0]="(//*[@type='password'])[1]";
		input4 [1]="Ishu1234";
		 Hashtable<String,Object> input4obj=SeleniumOperation1.sendkeys(input4);
		 HTMLReportGenerator.StepDetails(input4obj.get("STATUS").toString(), "user enters \"([^\"]*)\" as password", input4obj.get("MESSAGE").toString());
	}

	@When("^user enter click on Login button$")
	public void user_enter_click_on_Login_button() throws Throwable 
	{
		Object [] input5=new Object[1];
		input5 [0]="(//*[@type='submit'])[1]";
		 Hashtable<String,Object> input5obj=SeleniumOperation1.clickonLogin(input5);
		 HTMLReportGenerator.StepDetails(input5obj.get("STATUS").toString(), "user enter click on Login button", input5obj.get("MESSAGE").toString());
		 
		
	 }

	@Then("^user on the \"([^\"]*)\" page$")
	public void user_on_the_page(String arg1) throws Throwable 
	{
		Object [] input6=new Object[2];
		input6 [0]="//*[text()='Facebook']";
		input6 [1]="Facebook";
		 Hashtable<String,Object> input6obj=SeleniumOperation1.validation(input6);
		 HTMLReportGenerator.StepDetails(input6obj.get("STATUS").toString(), "user on the \"([^\"]*)\" page", input6obj.get("MESSAGE").toString());
	 }


	public static void main(String[] args) 
	{
		

	}

}
