package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz {

	MyFizzBuzz FizzBuzz = new MyFizzBuzz();
	
	@Test
	public void input_1() {
		
	
		String actualResult = FizzBuzz.getOutput(1);
		assertEquals("1",actualResult);
	}

	@Test
	public void input_2() {
		
		String actualResult = FizzBuzz.getOutput(2);
		assertEquals("2",actualResult);
	}
	
	@Test
	public void input_3() {
		
		String actualResult = FizzBuzz.getOutput(3);
		assertEquals("Fizz",actualResult);
	}
	@Test
	public void input_4() {
		
		String actualResult = FizzBuzz.getOutput(4);
		assertEquals("4",actualResult);
	}
	
	@Test
	public void input_5() {
		
	
		String actualResult = FizzBuzz.getOutput(5);
		assertEquals("Buzz",actualResult);
	}

	@Test
	public void input_6() {
		
		String actualResult = FizzBuzz.getOutput(6);
		assertEquals("Fizz",actualResult);
	}
	
	@Test
	public void input_7() {
		
		String actualResult = FizzBuzz.getOutput(7);
		assertEquals("7",actualResult);
	}
	@Test
	public void input_8() {
		
		String actualResult = FizzBuzz.getOutput(8);
		assertEquals("8",actualResult);
	}
	@Test
	public void input_9() {
		
		String actualResult = FizzBuzz.getOutput(9);
		assertEquals("Fizz",actualResult);
	}
	
	@Test
	public void input_10() {
		
		String actualResult = FizzBuzz.getOutput(10);
		assertEquals("Buzz",actualResult);
	}
	@Test
	public void input_11() {
		
		String actualResult = FizzBuzz.getOutput(11);
		assertEquals("11",actualResult);
	}
}
