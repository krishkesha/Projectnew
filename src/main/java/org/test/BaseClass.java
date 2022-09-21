package org.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	
	public static WebDriver lanuchbrowser(String browser) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;	
	}
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
		
	public static void  implicityWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);	
	}
    public static String getCurrentUrl() {
	    String currentUrl = driver.getCurrentUrl();
	    return currentUrl;    
    }
    public static String getTitle() {
	String title = driver.getTitle();
	return title;
    }	
	
     public static void quit() {
	 driver.quit();
    }
	 public static void sendKeys(WebElement k, String Value) {
	 k.sendKeys(Value);		
	}	
		
	 public static void click(WebElement k) {
     k.click();
	}	
     public static String getAttritute(WebElement k) {
		String attribute = k.getAttribute("value");
        return attribute ;
	}	
		
     public void screenshot(String path) throws IOException {
		TakesScreenshot k = (TakesScreenshot)driver;
		File src = k.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File f=new File(path);
		FileUtils.copyFile(src, f);
		
		
		
		
		
		

	}
		
	}
     

	


