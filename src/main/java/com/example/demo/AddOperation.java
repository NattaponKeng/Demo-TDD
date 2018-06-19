package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AddOperation {

	public double calculate(int Operand1, int Operand2) {
		
		return Operand1+Operand2;
	}

}
