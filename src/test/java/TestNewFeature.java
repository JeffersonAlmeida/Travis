package test.java;

import static org.junit.Assert.*;
import org.junit.Test;
import doublef.com.travis.NewFeature;

public class TestNewFeature {
	@Test
	public void testMethod2() {
		assertEquals(10, new NewFeature().method2());
	}
}
