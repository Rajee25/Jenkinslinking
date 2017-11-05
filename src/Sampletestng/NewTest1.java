package Sampletestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  
	  WebDriver W = new FirefoxDriver();
	  
	W.navigate().to("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	  
  }
}
