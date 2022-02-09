import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximised");
		driver.get("https://www.flipkart.com");
		System.out.println("FLipkart is opened");
		driver.quit();
		System.out.println("Browser is closed");

	}

}
