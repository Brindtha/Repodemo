package selenium;

import org.openqa.selenium.support.ul.select;

public class democode {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
WebDriver driver=new chromeDriver();
driver.get("https://oraniumtech.com/home.html");
driver.manage().window().maximize();
System.out.println("Title: " +driver.getTitle());
Object By;
webelement ele=driver.findElement(By.xpath("//div//ul//li[2]/a"));

}
}