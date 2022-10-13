package pageObjectsModels;



public class LoginPage {
	public WebDriver idriver;
	public LoginPage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txtUser;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	public void setUserName(String uname) throws Exception {
//		txtUser.clear();
		Thread.sleep(3000);
		txtUser.sendKeys(uname);
	}
	public void setPassword(String pwd) throws Exception {
//		txtPassword.clear();
		Thread.sleep(3000);
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		
		btnLogin.click();
	}
	
}
