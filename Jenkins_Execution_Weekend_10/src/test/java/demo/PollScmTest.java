package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollScmTest {
	@Test
	public void poll() {
		WebDriver driver=new ChromeDriver();
		
		Reporter.log("PollScmTest class executed",true);
	}
}
