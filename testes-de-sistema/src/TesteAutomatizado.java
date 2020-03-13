import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TesteAutomatizado {
	
	@Test
	public void cadastrarUmNovoUsuario()  {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4200/");
		
		WebElement campoDeNome = driver.findElement(By.id("nome"));		
		campoDeNome.sendKeys("Fulano");
		
		WebElement campoDeIdade = driver.findElement(By.id("idade"));
		campoDeIdade.sendKeys("25");

		WebElement botaoCadastrar= driver.findElement(By.id("cadastrar"));
		botaoCadastrar.click();
			
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cadastrar")));
		
		boolean achouNome = driver.getPageSource().contains("Fulano");
		boolean achouIdade = driver.getPageSource().contains("25");
		
		assertTrue(achouNome);
		assertTrue(achouIdade);
		
		driver.close();
		
	}
}