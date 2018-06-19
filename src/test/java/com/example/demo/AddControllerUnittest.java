package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

public class AddControllerUnittest {

	@Mock
	private AddOperation addOperation;
	
	@Test
	public void test() {

		AddController controller = new AddController();
		controller.setOperation(addOperation);
		String actualResult = controller.add(1,1);
		assertEquals("2",actualResult);
		
	}

}
