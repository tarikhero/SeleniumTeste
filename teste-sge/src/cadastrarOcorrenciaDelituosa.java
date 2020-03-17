import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class cadastrarOcorrenciaDelituosa {

	@Test
	public void cadastrarOcorrenciaDelituosaa()  {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.41.4.101:8080/SGE3/");
		
		WebElement campoDeLogin = driver.findElement(By.id("j_idt7:username"));		
		campoDeLogin.sendKeys("SGTO1");
		
		WebElement campoDeSenha = driver.findElement(By.id("j_idt7:password"));
		campoDeSenha.sendKeys("JUsgtosspba");
		
		WebElement botaoLogar= driver.findElement(By.id("j_idt7:j_idt16"));
		botaoLogar.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement delituoso = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formIndex:j_idt77")));		
		
		boolean status = delituoso.isDisplayed();
		
		if(status==true) {
			WebElement botaoCadastrarOcorrenciaDelituosa= driver.findElement(By.id("formIndex:j_idt77"));
			botaoCadastrarOcorrenciaDelituosa.click();
		}
		
		WebDriverWait esperar = new WebDriverWait(driver, 30);
		WebElement element = esperar.until(ExpectedConditions.visibilityOfElementLocated(By.id("formularioGeral:panelid_header")));		
		
		boolean carregamento = element.isDisplayed();
		
		if(carregamento==true) {		
			WebElement campoNumeroOcorrencia = driver.findElement(By.id("formularioGeral:noco_input"));		
			campoNumeroOcorrencia.sendKeys("160320");
			
			WebElement campoDataDoFato = driver.findElement(By.id("formularioGeral:buttonData_input"));
			campoDataDoFato.sendKeys("16/03/2020");
			
			WebElement campoHoraDoFato = driver.findElement(By.id("formularioGeral:mask_input"));
			campoHoraDoFato.sendKeys("12:12");
			
//			WebElement inserirMunicipio = driver.findElement(By.id("formularioGeral:idMunicipio_input"));
//			inserirMunicipio.sendKeys("Salvador");
//			
//			WebElement inserirArea = driver.findElement(By.id("formularioGeral:fatoarea_input"));
//			inserirArea.sendKeys("14ª DT- BARRA - SALVADOR");
//			
//			WebElement inserirLogradouro = driver.findElement(By.id("formularioGeral:logradouro_input"));
//			inserirLogradouro.sendKeys("BARRA / RUA MACEIO");
		}
		
		
		WebElement incluirDelito = driver.findElement(By.id("formularioGeral:j_idt291"));
		incluirDelito.click();
	
		WebElement = driver.findElement(By.id(""));
		
		

		
		
	}
	
}
