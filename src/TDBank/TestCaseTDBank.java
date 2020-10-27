package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCaseTDBank {


    WebDriver driver;
    String tdbankurl ="https://www.td.com/us/en/personal-banking/online-banking/";


    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(tdbankurl);
    }



    // Test 1:
   @Test(enabled = false)
   public void checktdBankUrl() throws InterruptedException {
    driver.get(tdbankurl);
    System.out.println("We Are Now Testing: " + driver.getCurrentUrl());
    String expectedTdBankUrl=  "https://www.td.com/us/en/personal-banking/online-banking/";
    String actualTdBankUrl= driver.getCurrentUrl();
    //Validate Links
    Assert.assertEquals(actualTdBankUrl,expectedTdBankUrl , "Test Failed, Link Does Not Match");
    Thread.sleep(3000);
}






    //test2
    @Test(enabled = false)
    public void checkHomePageTitle() throws InterruptedException {
       driver.get(tdbankurl);
        String expectedTitle = "Safe and secure Online Banking from TD Bank | TD Bank";
        String actualTitle = driver.getTitle();
        // Validation
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Title does not match");
        Thread.sleep(5000);
    }



    //test 3:( test failed)
    @Test(enabled = false)
    public void checkHomePageTitleFail() throws InterruptedException {
        driver.get(tdbankurl);
        String expectedTitle = "Saf and secure Online Banking from TD Bank | TD Bank";
        String actualTitle = driver.getCurrentUrl();
        // Validation:
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Title does not match");
        Thread.sleep(5000);
    }


//Test 4:
    @Test(enabled = false)
    public void checkProduct() throws InterruptedException {
       // driver.get(tdbankurl);
        driver.findElement(By.id("td-desktop-nav-dropdown-link-2")).sendKeys("Products");
        Thread.sleep(3000);
        //validation:
        String expectedText = "Products";
        String actualText = driver.findElement(By.xpath("//*[@id=\"td-desktop-nav-dropdown-link-2\"]")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }
    //Test 5:
    @Test(enabled = false)
    public void checkService() throws InterruptedException {
        driver.findElement(By.id("td-desktop-nav-dropdown-link-3")).sendKeys("Services");
        Thread.sleep(3000);
        //validation:
       String expectedText = "Services";
       String actualText = driver.findElement(By.xpath("//*[@id=\"td-desktop-nav-dropdown-link-3\"]")).getText();
     // Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }

    //Test 6:
  @Test(enabled = false)
   public void checkLogin() throws InterruptedException {

      driver.findElement(By.id("td-desktop-nav-dropdown-link-4")).sendKeys("Log In");
      Thread.sleep(3000);
      //validation:
      String expectedText = "Log In";
      String actualText = driver.findElement(By.xpath("//*[@id=\"td-desktop-nav-dropdown-link-4\"]")).getText();
      Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

  }
 // Test 7:
    @Test(enabled = false )
    public void checkPersonal() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[1]")).click();
        Thread.sleep(3000);
      //  validation:
        String expectedText = "Personal";
        String actualText = driver.findElement(By.xpath("//li[@class='active']")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }



    // Test 8:
    @Test(enabled = false)
    public void checkOnlineBanking() throws InterruptedException {
        String expectedTitle = "https://onlinebanking.tdbank.com/#/authentication/login";
        driver.get("https://onlinebanking.tdbank.com/#/authentication/login");
        String actualTitle = driver.getCurrentUrl();
        driver.findElement(By.xpath("//*[@id=\"formElement_0\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"formElement_1\"]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();



    }
    // Test 9:
    @Test(enabled = false )
    public void checkCreditCardSignUp() throws InterruptedException {
        String expectedTitle = "https://www.tdcardservices.com/?product=TDBANK";
        driver.get("https://www.tdcardservices.com/?product=TDBANK");
        String actualTitle = driver.getCurrentUrl();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"actionLink\"]/span/div/div/p[1]")).click();

//       // validation:
        String expectedText = "Enter your card number to get started";
        String actualText = driver.findElement(By.xpath(" //*[@id=\"sectionContent\"]/div/div/div")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }




  // Test 10:
    @Test(enabled = false )
    public void checkTextEnrollInOnlineBanking() throws InterruptedException {

        driver.findElement(By.cssSelector("#ba_1_title > span")).click();
        Thread.sleep(3000);
        //  validation:
        String expectedText = "Enroll in Online Banking.";
        String actualText = driver.findElement(By.xpath("//*[@id=\"ba_1_title\"]/span")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }


    // Test 11:
    @Test(enabled = false)
    public void checkLoanLineOfCredit () throws InterruptedException {
        String expectedTitle = "https://onlinebanking.tdbank.com/#/settings/productServices";
        driver.get("https://onlinebanking.tdbank.com/#/settings/productServices");

        String expectedTitle1 = "https://onlinebanking.tdbank.com/#/authentication/login?redirect=%2Faccounts";
        driver.get("https://onlinebanking.tdbank.com/#/authentication/login?redirect=%2Faccounts");

        driver.findElement(By.xpath("//*[@id=\"top\"]/div/ul[1]/li[2]/a/span")).click();
        Thread.sleep(2000);


        driver.findElement(By.cssSelector("body > div.td-app-container.ng-isolate-scope.tdOnceSettingsApp_productServicesState_bg > div.ng-scope.td-container-fluid > div > div.quick-links.divider.td-margin-top-16.td-margin-bottom-20.td-row > div > div > div:nth-child(3) > div.td-quick-link-label > span")).click();
        Thread.sleep(2000);

        //  validation:
        String expectedText = "Products";
        String actualText = driver.findElement(By.cssSelector("#top > div > ul.td-menuList.td-top-level-nav-left.td-full-height.td-ui-flex-align-items-center.ng-isolate-scope.td-ui-flex > li.td-menuItem.ng-scope.ng-isolate-scope.td-ui-flex.td-menu-priority-20.td-menu-width-null.td-menu-type-.td-menu-tag-smallBusiness.td-menu-tag-retail.td-menu-tag-legacyNav.td-menu-tag-pageTopNav > a > span ")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");


        String expectedText1 = "Loans & Lines\n" +
                "of Credit";
        String actualText1 = driver.findElement(By.cssSelector("body > div.td-app-container.ng-isolate-scope.tdOnceSettingsApp_productServicesState_bg > div.ng-scope.td-container-fluid > div > div.quick-links.divider.td-margin-top-16.td-margin-bottom-20.td-row > div > div > div:nth-child(3)")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");


    }


   // Test 12:
    @Test(enabled = false)
    public void checkForAndroidDevices() throws InterruptedException {

        driver.get(tdbankurl);
        driver.findElement(By.cssSelector("#product1_item1 > div > div.td-col-xs-12.td-product-details > div:nth-child(4) > div > button")).click();
        Thread.sleep(3000);


        //  validation:
        String expectedText = "For AndroidTM devices†";
        String actualText = driver.findElement(By.xpath("//*[@id=\"product1_item1\"]/div/div[2]/div[4]/div/button ")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }

    //Test 13:
    @Test(enabled = false)
    public void checkTransferAndSendMoney () throws InterruptedException {

        driver.get(tdbankurl);
        driver.findElement(By.cssSelector("#Tab_2 > div.td-tabs-carousel-tab-content > h4")).click();
        Thread.sleep(3000);

        //  validation:
        String expectedText = "Transfers and Send Money";
        String actualText = driver.findElement(By.xpath("//*[@id=\"Tab_2\"]/div[1]")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }

    //Test 14:
    @Test(enabled = false)
    public void checkStudentBanking() throws InterruptedException {
        String expectedTitle = "https://www.td.com/us/en/personal-banking/student-services/";
        driver.get("https://www.td.com/us/en/personal-banking/student-services/");



        driver.findElement(By.id("td-desktop-nav-dropdown-link-3")).sendKeys("Services");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#main > section.tdct-single-tool-container.td-bg-mint-green > div > div > div.td-wrapper.td-col-sm-offset-1.td-col-xs-12.td-col-sm-7.td-col-md-7.td-col-lg-6 > div.td-button-container.td-col-sm-8.td-col-sm-offset-right-4.td-col-md-6.td-col-md-offset-right-6 > button")).click();
        Thread.sleep(3000);


        //validation:
        String expectedText = "Thank you for your patience - we'll be back soon.";
        String actualText = driver.findElement(By.xpath("//*[@id=\"controller\"]/div/div[2]/div/div/h1")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }

    //Test 15:
    @Test(enabled = false )
    public void checkStatementAndNotices() throws InterruptedException {
        driver.get(tdbankurl);

        driver.findElement(By.cssSelector("#Tab_4 > div.td-tabs-carousel-tab-content > h4")).click();
        Thread.sleep(3000);

        //validation:
        String expectedText = "Statements and Notices";
        String actualText = driver.findElement(By.xpath("//*[@id=\"Tab_4\"]/div[1]/h4")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }


    //Test 16:
    @Test(enabled = false)
    public void checkBankingEmailAlerts() throws InterruptedException {
        driver.get(tdbankurl);

        driver.findElement(By.cssSelector("#Tab_5 > div.td-tabs-carousel-tab-content > h4")).click();
        Thread.sleep(3000);

        //validation:
        String expectedText = "Banking E-mail Alerts";
        String actualText = driver.findElement(By.xpath("//*[@id=\"Tab_5\"]/div[1]/h4")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }




    //Test 17:
    @Test(enabled = false)
    public void checkPersonalLoan() throws InterruptedException {
        driver.get(tdbankurl);
        String expectedTitle = "https://www.td.com/us/en/personal-banking/personal-loan/";
        driver.get("https://www.td.com/us/en/personal-banking/personal-loan/");

        driver.findElement(By.cssSelector("#aBanner0 > div > div > div > div > div > button")).click();
        Thread.sleep(3000);

        //validation:
        String expectedText = "Welcome! You're one step away from checking your loan options.";
        String actualText = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/customer-applications-personal-stage/article/div[1]/section/h1")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");


    }

    //Test 18:
    @Test(enabled = false)
    public void checkProtectionOfPersonalCreditReportAndScore() throws InterruptedException {
        driver.get(tdbankurl);
        String expectedTitle = "https://www.td.com/us/en/personal-banking/learning/";
        driver.get("https://www.td.com/us/en/personal-banking/learning/");


        driver.findElement(By.cssSelector("#Tab_2 > div.td-tabs-carousel-tab-content")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//*[@id=\"protectingCreditReportFindMore\"]/a")).click();
        Thread.sleep(3000);


        //validation:
        String expectedText = "Protecting your personal credit report and score";
        String actualText = driver.findElement(By.xpath("//*[@id=\"main\"]/section[2]/div/div/h1")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }


    //Test 19:
    @Test(enabled = false)
    public void checkTDGoReloadablePrepaidCard() throws InterruptedException {
        driver.get(tdbankurl);
        String expectedTitle = "https://www.td.com/us/en/personal-banking/prepaid-cards/";
        driver.get("https://www.td.com/us/en/personal-banking/prepaid-cards/");


        driver.findElement(By.cssSelector("#product1 > div")).click();
        Thread.sleep(3000);


        driver.findElement(By.cssSelector("#main > section.td-single-product.td-bg-white > div > div:nth-child(2) > div.td-col-xs-12.td-col-sm-7.td-col-md-5 > div.td-row > div > button")).click();
        Thread.sleep(3000);


        //validation:
        String expectedText = "";
        String actualText = driver.findElement(By.xpath("//*[@id=\"main\"]/section[3]/div/div[2]/div[2]/div[2]/div/button")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }



    @Test(enabled = true)
    public void checkLearnMoreAboutSmallBusinessOnlineBanking() throws InterruptedException {
        driver.get(tdbankurl);
        String expectedTitle = "https://www.td.com/us/en/small-business/online-banking/";
        driver.get("https://www.td.com/us/en/small-business/online-banking/");

        driver.findElement(By.cssSelector("#Tab_1 > div.td-tabs-carousel-tab-content > h4")).click();
        Thread.sleep(3000);

        //validation:
        String expectedText = "Manage Your Accounts";
        String actualText = driver.findElement(By.xpath("//*[@id=\"Tab_1\"]/div[1]/h4")).getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");

    }


    @AfterMethod
        public void tearDown () {
            //driver.close();
            driver.quit();
        }


    }
