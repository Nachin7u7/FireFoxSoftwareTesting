package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startFX {
	FirefoxDriver fx;

	@BeforeEach
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
		fx = new FirefoxDriver();
		fx.get("https://www.google.com/");
	}

	@Test
	public void wait() throws InterruptedException {
		Thread.sleep(3000);
	}

	@AfterEach
	public void closeBrowser() {
		fx.quit();
	}
}
