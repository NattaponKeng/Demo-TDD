package com.example.demo;

public class MyFizzBuzz {

	public String getOutput(int output) {
		
//		IFizzBuzz[] rules = {
//				new BuzzRule(),
//				new FizzRule(),
//				new JavaRule()		};
		
		if (output%3 == 0)
		{
			return "Fizz";
			
		}
		if (output%5 == 0)
		{
			return "Buzz";
			
		}
		if (output%15 == 0)
		{
			return "Fizz";
			
		}
		return output + "" ;
	}
	

}
