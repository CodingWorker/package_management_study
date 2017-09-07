package com;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven{
	@Test
	public void testSayHello(){
		HelloMaven hm=new HelloMaven();
		String result=hm.sayHello();

//		Assert.assertEquals(result,"Hello maven");
	}
}