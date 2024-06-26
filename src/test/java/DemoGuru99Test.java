/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author ASUS
 */
public class DemoGuru99Test {
    private static WebDriver myBrowser;
    @Test // Test case #1 Check login successfully with
          // valid manager account
    
          // STEPS/PROCEDURES:
          //    1. Open a certain browser, e.g. Chrome
          //    2. Navigate to the login page by typing the url:
          //    https://demo.guru99.com/v4
          //    3. Input a valid manager account, e.g. mngr546335/a1!
          //    4. Hit Login button to login to the system with admin role
          // EXPECTED RESULT
          //    The admin page appears with the welcome message
          //    in the format of: Manager Id: <user-name>
          //        e.g with the above account
          //            Manager Id: mngr546335
          // STATUS: nhờ dân QC khác, test thử xem tính năng chạy đúng ko
          //        đúng - ghi PASSED
          //        sai - ghi FAILED, MÔ TẢ LẠI TÌNH HUỐNG NÀY TRONG 
          //        JIRA, BUGZILLA -> LOG BUG
    
          // NẾU VIỆC TEST NÀY CHẠY BẰNG CƠM -> GỌI LÀ MANUAL TESTING
          // NẾU TỰ ĐỘNG HOÁ VIỆC NÀY, KỂ CẢ BÁO ĐÚNG, SAI (XANH ĐỎ)
          // THÌ GỌI LÀ TEST TỰ ĐỘNG, TEST AUTOMATION
          // DÂN QC PHẢI BIẾT VIẾT CODE ĐỂ TỰ ĐỘNG HOÁ CÔNG VIỆC KIỂM THỬ
          // CODE NÀY GỌI LÀ TEST SCRIPT, TEST AUTOMATION SCRIPT
    
    public void testLoginWithGivenRightManagerAccountRunsWell() {
        // TEST SCRIPT
        myBrowser.get("https://demo.guru99.com/v4");
        WebElement txtUserName = myBrowser.findElement(By.xpath("//input[@name='uid']"));
        txtUserName.sendKeys("mngr546335");
        WebElement txtPassword = myBrowser.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("a1!");
        WebElement btnLogin = myBrowser.findElement(By.xpath("//input[@name='btnLogin']"));
        btnLogin.click();
    }
    
    @BeforeAll // hàm này sẽ chạy 1 lần duy nhất trước tất cả các hàm 
    // @Test, thường dùng để khởi động các biến dùng chung trong các màm @Test
    // hay chuẩn bị data... cho mọi hàm @Test dùng
    
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--incoginito");
        opts.addArguments("--lang=de-DE");
        myBrowser = new ChromeDriver(opts);
        myBrowser.manage().window().maximize();
                
    }
    
    @AfterAll // chạy 1 lần duy nhất sau khi tất cả vài trăm @Test đã chạy xong
    // nó hay dùng để dọn dẹp ram, dọn dẹp phục hồi database sau khi insert
    // rác trong quá trình test các chức năng
    public static void teardown() throws InterruptedException{
        Thread.sleep(5000);
        myBrowser.quit();
    }
}
