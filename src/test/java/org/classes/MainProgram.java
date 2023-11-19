package org.classes;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class MainProgram extends Base{
	 
	@BeforeClass
	public static void initialStep() {
		browserLaunch("chrome");
	loadUrl("https://www.flipkart.com/account/login");
		
	}
@Test
public void tc1() {
	String name="aadhiraisubramani@gmail.com";
	Login login = new Login();
	passValue(login.getEmail(), name);
	implicitlyWait();
	elementClick(login.getRequestButton());
	implicitlyWait();
	
	Assert.assertEquals("aadhiraisubramani@gmail.com",name);
}
@After
public void after() throws IOException {
  implicitlyWait();
	File file = new File("C:\\Users\\HP\\eclipse-workspace\\Flipkarttask\\target\\flip.png");
	screenshot(file);
}
@AfterClass
public static void afterclass() {
	closingUrl();
}
}
