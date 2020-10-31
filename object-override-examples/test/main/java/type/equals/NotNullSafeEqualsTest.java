package main.java.type.equals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.type.AbstractDataTypeBean;

public class NotNullSafeEqualsTest {

	private AbstractDataTypeBean type, y, z, notEqual;
	private String dependencyOne = "This is a test Dependency";
	private String dependencyTwo = "This is another test Dependency";

	@Before
	public void instantiateTestClasses() {
		type = new NotNullSafeEquals(dependencyOne);
		y = new NotNullSafeEquals(dependencyOne);
		z = new NotNullSafeEquals(dependencyOne);
		notEqual = new NotNullSafeEquals(dependencyTwo);
	}

	@Test
	public void isNullSafe() {
		Assert.assertEquals(type.equals(null), false);
	}

}
