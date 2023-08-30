package Teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class teste {
    private WebDriver driver;

    // Inicializar metodos base
    @BeforeMethod
    public void iniciar() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aluno\\Desktop\\projetoteste\\chromedriver_win32\\chromedriver.exe");


    }
    @Test
    public void testarpaginahome(){
        driver.get("https://demo.automationtesting.in/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("email@email");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("email@email");
       /// Thread.sleep(5000);
        driver.findElement(By.id("enterimg")).click();

        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Paola");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Borges");

        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Silveira Martins");

        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("46988014180");

        driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]")).click();

        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();

        Select ano = new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
        ano.selectByVisibleText("1994");

        Select mes = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
        mes.selectByVisibleText("February");

        Select dia = new Select(driver.findElement(By.id("daybox")));
        dia.selectByVisibleText("23");

        Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        skill.selectByVisibleText("Android");

    }

    @Test
    public void testarLoginInvalido() {

        // Abrir a URL informada
        driver.get("url_site");

        // Clicar em elementos como botões ou links
        driver.findElement(By.xpath("XPATH")).click();

        // Digitar em elementos de input
        driver.findElement(By.xpath("XPATH")).sendKeys("SEU_TEXTO");

        // Limpa o texto digitado
        driver.findElement(By.xpath("XPATH")).clear();

        // Armazana o texto do elemento
        String Texto = driver.findElement(By.xpath("XPATH")).getText();

        //Compara o texto retornado com o que deveria retornar de fato
        Assert.assertEquals("SEU_TEXTO", Texto);

        // Elementos Select
        Select Day = new Select(driver.findElement(By.xpath("XPATH")));
        Day.selectByVisibleText("Atributo_que_deseja_selecionar");

    }
// Finalizar teste e fechar o navegador
        @AfterMethod
        public void finalizar () throws InterruptedException {
            Thread.sleep(5000); // aguarda 5 segundos e fecha o navegador
            // Esse metodo irá fechar o navegador
            driver.quit();
        }

    }

