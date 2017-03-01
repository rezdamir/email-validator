package com.assignment3.email_validator.email_validator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class emailValidatorTester {
	
	emailValidator ev;
	
	@Before
	public void setUp() throws Exception {
		ev = new emailValidator();
	}

	@Test
	public void testAtSign() {
		String email = "1234@abc.com";
		assertEquals("1234@abc.com should return true", 1, ev.validateAtSign(email) );
	}
	@Test
	public void testDotSign() {
		String email = "a.b@c.d";
		assertEquals("a.b@c.d should return true",1, ev.validateDotSign(email) );
	}
	
	@Test
	public void testStage1() {
		String email = "amir@test.com";
		assertEquals("Stage 1 tests passed", 2, ev.validateStage1(email) );
	}

}

