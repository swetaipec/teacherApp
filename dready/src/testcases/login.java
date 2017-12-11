package testcases;

public class login {

	public void Login() throws InterruptedException {
	    System.out.println("IN teacher_LOGIN TEST ");
	    this.getDriver().context("NATIVE_APP");// set the context to Native
	    _sign_in_button.click(); 
	    Thread.sleep(10000); // sleep
	    Set<String> contextNames = getDriver().getContextHandles();
	    for (String contextName : contextNames) {
	        System.out.println(contextName);
	        if (contextName.contains("WEBVIEW")) {
	            getDriver().context(contextName);
	        }
	    }
	    this.getDriver().findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("abc@gmail.com");
}}

