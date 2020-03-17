import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class logarNoSge {	
	@Test
	public void login()  {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.41.4.101:8080/SGE3/");
		
		WebElement campoDeLogin = driver.findElement(By.id("j_idt7:username"));		
		campoDeLogin.sendKeys("SGTO1");
		
		WebElement campoDeSenha = driver.findElement(By.id("j_idt7:password"));
		campoDeSenha.sendKeys("JUsgtosspba");

		WebElement botaoCadastrar= driver.findElement(By.id("j_idt7:j_idt16"));
		botaoCadastrar.click();
			
		
//		boolean achouLogin = driver.getPageSource().contains("Fulano");
//		boolean achouSenha = driver.getPageSource().contains("25");	
//		assertTrue(achouLogin);
//		assertTrue(achouSenha);
		
//		driver.close();	
	}
}