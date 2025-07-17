package jcoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import package_1.mul;

public class multest {
	@Test
	public void testmul() {
		mul m=new mul();
		assertEquals(6,m.mul(2, 3));
	}

}
