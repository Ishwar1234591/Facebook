Feature: Login Functionality


Background: user is successfully logged in
When user open the "chrome" and exe "E:\\\\Pappppppppu\\\\Facebook\\\\src\\\\test\\\\resources\\\\DRIVER\\\\chromedriver.exe"
When user enters the url "https://www.facebook.com/"

@SmokeTest
Scenario: Login functionality for invalid username and password
When user enters "Indra@123" as username
When user enters "Ishu1234" as password
When user enter click on Login button
Then user on the "Facebook" page 