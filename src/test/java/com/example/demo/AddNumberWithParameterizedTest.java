package com.example.demo;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Arrays;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddNumberWithParameterizedTest {

	public AddNumberWithParameterizedTest(int operand1, int operand2, double expectedResult) {
		Operand1 = operand1;
		Operand2 = operand2;
		this.expectedResult = expectedResult;
	}

	private int Operand1;
	private int Operand2;
	private double expectedResult;
	
	@Parameters
	public static Collection<Object[]> myData()
	{
		return Arrays.asList(new Object[][] {
			{1,1,2.0},
			{2,2,4.0},
		});
		
	}
	
	@Test
	public void add() {
		AddOperation addOperation = new AddOperation();
		double actualResult = addOperation.calculate(this.Operand1,this.Operand2);
		assertEquals(expectedResult, actualResult , 0.000);
	}

}
