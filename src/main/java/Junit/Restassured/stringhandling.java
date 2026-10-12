package Junit.Restassured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class stringhandling {
	
	@Test
	public void m1() {
		System.out.println("hai");
	}
	@BeforeTest
	public void m2() {
	System.out.println("I am before test");	
	}
	
	@BeforeMethod
	public void m3() {
	System.out.println("I am before method");	
	}
	@AfterTest
	public void m4() {
	System.out.println("I am after method");	
	}

}
