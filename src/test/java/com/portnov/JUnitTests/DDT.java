package com.portnov.JUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
@RunWith(JUnitParamsRunner.class)//special runner for data driven testing
public class DDT
{
	@Test
	@FileParameters(value="file:C:\\Users\\satya\\workspace\\JUnitTests\\address.csv",//path of file
	                mapper=CsvWithHeaderMapper.class)//u need to mention mapper to tell csv to ignore header
	public void test(String name,String street,String city)
	{
		System.out.println("name: "+name+" street: "+street+" city: "+city);
	}

}
