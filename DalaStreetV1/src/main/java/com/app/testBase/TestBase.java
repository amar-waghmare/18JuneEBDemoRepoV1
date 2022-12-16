package com.app.testBase;

import org.testng.annotations.*;

public class TestBase {
	
	@BeforeClass
	public void start()
	{
		System.out.println("Logger start");
	}
	
	@AfterClass
	public void end()
	{
		System.out.println("Logger end");
	}

	@BeforeMethod
	public void setUp()
	{
		System.out.println("Setup");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("tear Down");
	}
}
