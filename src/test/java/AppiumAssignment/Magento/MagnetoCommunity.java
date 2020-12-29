package AppiumAssignment.Magento;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class MagnetoCommunity {
  @Test
  public void f() throws MalformedURLException {
		DesiredCapabilities capability=new DesiredCapabilities();
		capability.setCapability("deviceName", "Pratibha");
		capability.setCapability("platformName", "Android");
		capability.setCapability("browserName", "Chrome");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/button")).click();
		driver.findElement(By.linkText("Community")).click();
		String TechRes=driver.findElement(By.linkText("Tech Resources")).getText();
		Assert.assertEquals(TechRes, "Tech Resources");

  }
}
