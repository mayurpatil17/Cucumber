package stepDefinitions;




public class LoginSteps extends Base {
	@Given("User Launch chrome Browser")
	public void user_launch_chrome_browser() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		ap=new LoginPage(driver);

	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);


	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String username, String password) throws Exception {

		ap.setUserName(username);
		ap.setPassword(password);
	}

	@When("User click on Login")
	public void user_click_on_login() {
		ap.clickLogin();

	}
