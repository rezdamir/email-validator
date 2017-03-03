package com.assignment3.email_validator.email_validator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
		assertEquals("1234@abc.com should return 1", 1, ev.validateAtSign(email) );
	}
	
	@Test
	public void testDotSign() {
		String email1 = "a.b@c.d";
		assertEquals("a.b@c.d should return 1",1, ev.validateDotSign(email1) );
		String email2 = "abc";
		assertEquals("The empty string returns 0", 0, ev.validateDotSign(email2));

	}
	
	@Test
	public void testStage1() {
		String email = "amir@test.com";
		assertEquals("Stage 1 tests passed", 2, ev.validateStage1(email) );
	}

	@Test 
	public void testDomainNames() {
		String email = "amir.abbasnejad@google.com";
		assertEquals("Valid domain name test passed", 1, ev.validateDomainName(email) );

	}
	
	@Test
	public void testEmailAddress() {
		String email = "amir@abbas.ca";
		assertEquals("Valid email address", 1, ev.validateEmailAddress(email));
	}
	
	@Test
	public void testStage2() {
		String email = "amir@google.com";
		assertEquals("Stage 2 tests passed", 4, ev.validateStage2(email));
	}
}
