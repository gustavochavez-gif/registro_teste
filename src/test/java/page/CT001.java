package page;

import org.openqa.selenium.By;

import config.Base;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class CT001 extends Base{
	@Dado("^o click no botão Bank Manager Login;$")
	public void clickBtnManagerLogin() throws Throwable {
	    try {
	    	//browserChrome();
			//driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	    	 //driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	    	 driver.findElement(By.xpath("//div[2]/button")).click();
	    	Thread.sleep(2000);
	    } catch (Exception e) {
	    	System.out.println(e.getMessage());
	    } 
	    
	}
	@E("^clicar no botão Add customer;$")
	public void clickAddCustomer() throws Throwable {
		try {
			 driver.findElement(By.xpath("//div[2]/div/div/button")).click();
			 Thread.sleep(1000);
	    } catch (Exception e) {
	    	System.out.println(e.getMessage());
	    }
	  
	}

	@E("^preencher todos os campos: \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\";$")
	public void preencherTodoCampos(String name, String sobrename, String PostCode ) throws Throwable {
		 try {
		        driver.findElement(By.xpath("//input[@type='text']")).clear();
			    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gustavo");
			    driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
			    driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
			    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("chavez");
			    driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
			    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
			    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("72120-025");	
			    Thread.sleep(1000);
		    } catch (Exception e) {
		    	System.out.println(e.getMessage());
		    }
	}
	
	@E("^clicar no botão Adicionar;$")
	public void clicarBtnAdicionar() throws Throwable {
		 try {
			   driver.findElement(By.xpath("//button[@value='']")).click();
			   //assertEquals("Customer added successfully with customer id :7", 
			   Thread.sleep(2000);
		    } catch (Exception e) {
		    	System.out.println(e.getMessage());
		    }
	   
	}

	@Então("^verificar se usuario foi cadastrado no sistema;$")
	public void verificarUsuarioCadastrado() throws Throwable {
		 try {
		    	
		    } catch (Exception e) {
		    	System.out.println(e.getMessage());
		    }
	   
	}



}
