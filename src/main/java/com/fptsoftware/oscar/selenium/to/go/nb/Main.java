/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptsoftware.oscar.selenium.to.go.nb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author ASUS
 */
public class Main {
    
    // TEST CASE #1: FUNCTIONAL TESTING - TEST CHỨC NĂNG CỦA APP
    //               HONG CÓ TEST HÀM (VIỆC NÀY CỦA DÂN DEV)
    //               TEST CHỨC NĂNG (XEM APP HOẠT ĐỘNG RA SAO Ở GÓC NHÌN
    //               USER, GÓC NHÌN XÀI APP, KO CARE CODE, KO THÊM BIẾT CODE)
    //               TEST CHỨC NĂNG LÀ TEST GÓC NHÌN NGƯỜI DÙNG!!!
    //               CHƠI VỚI UI - USER INTERFACE
    //               CÓ 2 CHỨC NĂNG - DO DÂN QC ĐẢM NHẬN
    // CÁCH 1: TRÂU BÒ DÙNG SỨC: CLICK CLICK CLICK CLICK NHẬP NHẬP GÌ ĐÓ
    //         HOÀN TOÀN THỦ CÔNG = TAY
    // MỞ APP = TAY, NHẤN CHUỘT = TAY, NHẬP INFO = TAY, XEM KQ TRẢ VỀ CỦA APP
    // = MẮT, VÀ TỰ KẾT LUẬN ĐÚG SAI
    // KĨ THUẬT MANUAL TESTING - CHẠY BÀNG CƠM CỦA QC
    
    // CÁCH 2: DÙNG TRÍ, DÒNG CODE ĐỂ TỰ ĐỘNG HOÁ TOÀN BỘ THAO TẤC = TAY CỦA
    // DÂN QC. DÂN QC LÚC NÀY PHẢI BIẾT VIẾT CODE, OOP LUÔN NHƯNG HONG CẦN
    // BIẾT LÀM APP, CHỈ ĐỦ DÙNG ĐỂ VIẾT CODE LÀM APP CHẠY NHƯ MA NHẬP
    // THEO KỊCH BẢN MÌNH MUỐN => TEST AUTOMATION, AUTOMATION TESTING
    // DÙNG THÊM THƯ VIỆN, BÊN NGOÀI ĐỂ TRỢ GIÚP
    
    // CÓ 3 CÁCH ĐỂ CHƠI TEST AUTOMATION
    // 1. DÙNG TOOL
    
    // 2. DÙNG TOOL RA CODE
    
    // 3. CODE: SELENNIUM, CYPRESS, PLAYWRIGHT: 3 BỘ THƯ VIỆN NỔI TIẾNG
    //    GIÚP TA ĐIỀU KHIỂN TRÌNH DUYỆT, MOBILE APP, DESKTOP
    //    QUA CODE
    
    // TOOL Ở MỤC 1 CHÍNH LÀ XÀI 3 THẰNG NÀY!!!
    
    
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--incoginito");
        opts.addArguments("--lang=de-DE");
        WebDriver myBrowser = new ChromeDriver(opts);
        myBrowser.manage().window().maximize();
        myBrowser.get("https://demo.guru99.com/V4/");
        
        Thread.sleep(10000);
        myBrowser.quit();
    }
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
//        
//        ChromeOptions opts = new ChromeOptions();
//        opts.addArguments("--incoginito");
//        opts.addArguments("--lang=de-DE");
//        
//        WebDriver myBrowser = new ChromeDriver(opts);
//        // myBrowser là biến object trả tới trình duyệt - object rất bự
//        // ta muốn trình duyệt làm gì, ta gọi myBrowser.
//        // kĩ thuật điều khiến trình duyệt = code ! Giúp QC tránh nhàm chán
//        // khi cần test lại app trả trình duyệt
//        
//        myBrowser.manage().window().maximize();
//        myBrowser.get("https://google.com");
//        
//        // đi bắt 1 tag của 1 trình duyệt - định vị - location
//        // nên nhốt: trong lập trình OOP mọi thứ đều là object
//        // Trình duyệt chứa trang Web cũng đang là object bự
//        // Chứa bên trong object khác - trang web
//        // trang web là object - DOM (<html>...<html>)
//        //                             object
//        // object <html> lại chứa bên trong nhiều obj khác
//        // <head>
//        // <body>
//        
//        // object <body> chứa nhiều <tag> <p> <br> <a> <img src = alt =>
//        // mỗi tag lại là 1 obj
//        // gọi chung là WebElement
//        
//        // mò vào object trang Google vừa tải về đi tìm object tương đương
//        // đường vào ô search
//        WebElement searchBox = myBrowser.findElement("By.Xpath("input[name='uid']"));
//        searchBox.sendKeys("Anh thương em nhất mà");
//        searchBox.submit();
//        
//        // delay 5s
//        Thread.sleep(5000);   //interupt 
//        myBrowser.quit();
//    }
}
