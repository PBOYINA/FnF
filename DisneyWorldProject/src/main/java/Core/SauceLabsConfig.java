package Core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsConfig {

	public static WebDriver createDriver(String username, String accessToken, String testname) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, "Windows 10");
		options.setCapability(CapabilityType.BROWSER_VERSION, "latest");
		Map<String, Object> sauceOptions = new HashMap();
		sauceOptions.put("username",username);
		sauceOptions.put("accessKey", accessToken);
		sauceOptions.put("tunnel-identifier", "tab-shared-tunnel");
		sauceOptions.put("name", "Profile UI - " +testname);
		sauceOptions.put("screenResolution", "1280x1024");
		options.setCapability("sauce:options", sauceOptions);
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");
		return new RemoteWebDriver(url, options);

    }
}