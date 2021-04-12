package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationsExample {
	
	

	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("this is the before suite");
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("this is the after suite method");
	}
	
	@BeforeClass
	public void bfClass()
	{
		System.out.println("this is the before class");
	}
	@AfterClass
	public void afClass()
	{
		System.out.println("this is the after class method");
	}
	
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("this is the before method");
	}
	@BeforeTest
	public void bfTest()
	{
		System.out.println("this is the before Test method");
	}
	@AfterTest
	public void afTest()
	{
		System.out.println("this is the AFTER Test method");
	}
	@AfterMethod
	public void afMethod()
	{
		System.out.println("this is the after method");
	}
	@Parameters({"names","name1"})
	@Test
	public void bmethod1(String name,String names)
	{
		System.out.println("this is the first method");
		System.out.println(name+" "+names);
	}
	
	@Test(dataProvider="getData")
	public void signIn(String uName,String password,String mNumber)
	{
		System.out.println("This is sign in method");
		System.out.println(uName);
		System.out.println(password);
		System.out.println(mNumber);
	}
	
	@Parameters({"names","name1"})
	@Test(groups= {"regression"})
	public void zmethod2(String names,String name1)
	{
		System.out.println("this is the second method");
		Assert.assertTrue(false);
		System.out.println(names+" "+name1);
	}
	
	@Test
	public void method3()
	{
		System.out.println("this is the third method");
	}
	
	@Test(groups= {"regression"})
	public void amethod4()
	{
		System.out.println("this is the fourth method");
	}
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] obj=new Object[3][3];
		
		//1st set values
		obj[0][0]="firstUserName";
		obj[0][1]="firstPassword";
		obj[0][2]="987298379";
		
		//2nd set values
		obj[1][0]="secondUserName";
		obj[1][1]="secondPassword";
		obj[1][2]="12345";
		//3rd set values
		obj[2][0]="thirdUserName";
		obj[2][1]="thirdPassword";
		obj[2][2]="6554332";
		return obj;
		
	}

}
