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
		aa.sendkeys("varun");
	}
	@Test 
	public void c() {
		WebElement bb=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		bb.sendkeys("bharath");
		WebElement address=driver.findElement(By.xpath("//*[@ng-model='Adress']"));
		address.sendkeys("xxxxxxxxxxxxxxx");
	}
	
	@Test
	public void d() {
		WebElement email=driver.findElement(By.xpath("//*[@ng-model='EmailAdress']"));
		email.sendkeys("bharath@gmail.com");
		WebElement phone=driver.findElement(By.xpath("//*[@ng-model='Phone']"));
		phone.sendkeys("9876543321");
	}
		
	}

}
