package com.portnov.JUnitTests;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Hamcrest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test()
	{
		int sum=2;
		assertThat("sum test",sum,equalTo(2));
		assertThat(sum,is(2));
		assertThat(sum,is(not(3)));
		assertThat(sum,greaterThan(0));
		assertThat(sum,is(greaterThan(1)));
		String str="white-box testing";
		assertThat(str,containsString("white"));
		assertThat(str,equalToIgnoringCase("white-box testing"));
		assertThat(str,not(equalToIgnoringCase("black-box testing")));
	}

}
