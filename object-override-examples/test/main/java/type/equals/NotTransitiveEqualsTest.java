package main.java.type.equals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.type.AbstractDataTypeBean;

public class NotTransitiveEqualsTest {
	private AbstractDataTypeBean type, y, z, notEqual;
	private String dependencyOne = "This is a test Dependency";
	private String dependencyTwo = "This is another test Dependency";

	@Before
	public void instantiateTestClasses() {
		type = new NotTransitiveEquals(dependencyOne);
		y = new NotTransitiveEquals(dependencyOne);
		z = new NotTransitiveEquals(dependencyOne);
		notEqual = new NotTransitiveEquals(dependencyTwo);
	}

	
	@Test
	public void isTransitive() {
		Assert.assertEquals(type.equals(y), true);
		Assert.assertEquals(y.equals(z), true);
		Assert.assertEquals(type.equals(z), true);
	}


}
