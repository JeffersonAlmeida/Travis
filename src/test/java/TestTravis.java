package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import doublef.com.travis.Travis;

public class TestTravis {

	@Test
	public void testMethod() {
		assertEquals(10, new Travis().method());
	}

}
