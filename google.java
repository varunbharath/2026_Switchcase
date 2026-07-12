import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//	}
	@Test
	 public void a() { 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	}
	
	@Test 
	public void b() {
		WebElement aa=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		aa.sendkeys("uyfuyfye");
	}

}
