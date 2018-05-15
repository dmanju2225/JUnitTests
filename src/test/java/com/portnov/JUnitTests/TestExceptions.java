package com.portnov.JUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestExceptions
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test(expected=ArithmeticException.class)//expected is provided by jnuit
	public void test()
	{
		int i=1/0;//eventhough exception is there test will pass because of test parameters
	}
}
