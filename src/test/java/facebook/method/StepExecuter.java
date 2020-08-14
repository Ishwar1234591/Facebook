package facebook.method;

public class StepExecuter
{

	public static void main(String[] args) 
	{
		  //browser launch
				Object [] input=new Object[2];
				input [0]="Chrome";
				input [1]="E:\\\\Pappppppppu\\\\Facebook\\\\src\\\\test\\\\resources\\\\DRIVER\\\\chromedriver.exe";
				SeleniumOperation1.browserLaunch(input);
				
				//application launch
				Object [] input2=new Object[1];
				input2 [0]="https://www.facebook.com/";
				SeleniumOperation1.applicatinLaunch(input2);
				
				//enter Username
				Object [] input3=new Object[2];
				input3 [0]="//*[@name='email']";
				input3 [1]="Indra@123";
				SeleniumOperation1.sendkeys(input3);
				
				//enter password
				Object [] input4=new Object[2];
				input4 [0]="(//*[@type='password'])[1]";
				input4 [1]="Ishu1234";
				SeleniumOperation1.sendkeys(input4);
				
				//click on login
				Object [] input5=new Object[1];
				input5 [0]="(//*[@type='submit'])[1]";
				SeleniumOperation1.clickonLogin(input5);
				
				//validation
				Object [] input6=new Object[2];
				input6 [0]="//*[text()='sorry,something went wrong']";
				input6 [1]="sorry,something went wrong";
				SeleniumOperation1.validation(input6);


	}

}
