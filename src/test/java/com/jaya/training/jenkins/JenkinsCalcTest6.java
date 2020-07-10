package com.jaya.training.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalcTest6 {

	@Test
	public void addTest(){
		JenkinsCalculator6 myCalc = new JenkinsCalculator6();
		assertEquals(10,myCalc.addNumbers(5,5));
		}

	@Test
	public void suntractTest(){
		JenkinsCalculator6 myCalc = new JenkinsCalculator6();
		assertEquals(5,myCalc.suntractNumbers(10,5));
		}

}
