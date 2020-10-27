package TDBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage {

    public static void main(String[] args) {
        String browserDriverPath = "C:\\Users\\yamih\\WebAutomation_HomeWork\\BrowserDriver\\windows\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",browserDriverPath);
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.td.com/");
    }







}

