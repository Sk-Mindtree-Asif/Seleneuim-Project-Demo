package Mindtree_Assesment.Assesment;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
    //invoke chrome driver.
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//hit the url of google.com.
	driver.get("http://google.com");
	
	//vaidate the title page is corrrect
    System.out.println(driver.getTitle());
    
   //validate to landed on current url.
    System.out.println(driver.getCurrentUrl());
   
    //navigate to moneycontrol.com
   driver.navigate().to("https://www.moneycontrol.com/");
   driver.navigate().to("https://www.moneycontrol.com/");
   

   
   //click on navigation --- button
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//span[@class='open_hamburger']")).click();
   
   //click on PF Selector.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//li[@cid='8']")).click();


   //click on income tax-calculator.
   Thread.sleep(2000L);
   driver.findElement(By.cssSelector("a[href*='income-tax-calculator']")).click();


   
   //enter the age in the input field.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
   
   //select the selecter value as the question mentioned.
   Thread.sleep(2000L);
   Select s=new Select(driver.findElement(By.xpath("//select[@class='custselect']")));
   s.selectByIndex(1);
   
   //click on next button
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//a[@title='Next']")).click();
   
   //send the value as key on annual salary field.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//input[@id='annual_salary']")).sendKeys("1500000");
   
   
   //send the value as key on business income field.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//input[@id='business_income']")).sendKeys("20000");
   
   
   //send the value as key on other income field.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//input[@id='other_income']")).sendKeys("100000");
   
   //click on next button.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//a[@id='income_tab_next']")).click();
   
   //send the value as key on Annual rent paid.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//input[@id='rent_paid']")).sendKeys("10000");
   
   //click on next button
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//a[@href='#summary']")).click();
   
   //display the amount to fetch the amount and dispalyed.
   Thread.sleep(2000L);
   WebElement w1=driver.findElement(By.xpath("//span[@id='display_tax']"));
   System.out.println("You will have to pay "+w1.getText());
   System.out.println();
   
   //back to the navigation icon to click
   Thread.sleep(3000L);
   driver.findElement(By.xpath("//span[@class='open_hamburger']")).click();
   
   //selct on or click on Forum selector.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//li[@cid='4']")).click();
   
   //click on latest polls url.
   Thread.sleep(3000L);
   driver.findElement(By.cssSelector("a[title='Latest Polls']")).click();
   
   //move on to latest poll to historical poll.
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//a[@id='proftbx2']")).click();
      
   //fetch the 3rd yes% given in this question and print out.
   Thread.sleep(2000L);
   WebElement E2=driver.findElement(By.xpath("//*[@id=\"profile_cnt2\"]/div[2]/div[4]/div[1]/div[3]/ul/li[1]/strong"));
   System.out.println("Yes"+E2.getText());

   
   
   
	}
}


//driver.navigate().to("https://www.moneycontrol.com/personal-finance/tools/income-tax-calculator");
//driver.findElement(By.xpath("//a[contains(@href,'income-tax-calculator')]")).click();
//driver.findElement(By.cssSelector("a[title='Income Tax Calculator']")).click();
//driver.findElement(By.xpath("//a[@class='menu_markethm']//a[title='Income Tax Calculator']")).click();
//System.out.println("yes");



//driver.navigate().to("https://www.moneycontrol.com/");

//click on submit button icon magnifite glass.
//Thread.sleep(2000L);

// driver.findElement(By.cssSelector("a[href*='historical-polls']")).click();

//WebElement E2=driver.findElement(By.xpath("//div[@rel='18177']//span[@class='bullet yes']"));
//driver.findElement(By.tagName(null));