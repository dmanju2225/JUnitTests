package com.portnov.JUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test(timeout=5000)//u will get error test timedout after 5000 milliseconds, timeout is provided by 
	public void test()
	{
		while(true);
	}

}
