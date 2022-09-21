package org.pages;

import org.test.BaseClass;

public class MainClass extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {

		lanuchbrowser("chrome");
		urlLaunch("https://www.facebook.com/login/");
		implicityWait(60);
		Thread.sleep(3000);
		
		LoginClass l=new LoginClass();
//		l.getTextUsername().sendKeys(arg0);
//		l.getTextPassword().sendKeys(arg0);
		sendKeys(l.getTextUsername(),"Keshav");
		sendKeys(l.getTextPassword(), "12345");
	 
	l.getBtnlogin().click();
	quit();

	}
	

}
 