package com.vlup.vlnidhibank;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssertExample {

	//Assertion =validating actual result with expected result
	//Assertions
	
	
	@Test
	public void test1()
	{
		System.out.println("Testing some assertions methods ");
		float actual=12;
		Float expected=12.0f;
		
		//Overloaded
		Assertions.assertEquals(expected,actual);
		
		int []actualIntArray= {1,2,3,4,5};
		int []expectedArray= {1,2,3,4,5};
		
		Assertions.assertArrayEquals(expectedArray, actualIntArray);
		
	}
}
