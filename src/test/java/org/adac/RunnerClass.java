package org.adac;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mahesh\\eclipse-workspace\\Cucumber\\src\\test\\resources\\adaclogin.feature", glue={"org.stepdef"})
public class RunnerClass {
	private void method1() {
		System.out.println("mahesh modified");

	}
public void method3() {
System.out.println(" mahesh updated");
	
}
	
	


	

}
