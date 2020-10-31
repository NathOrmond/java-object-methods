package main.java.type.equals.symmetric;

import java.util.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.type.AbstractDataTypeBean;
import main.java.type.equals.symmetric.NotTypeSafeEquals;

public class NotTypeSafeEqualsTest {

	private AbstractDataTypeBean type, y, z, notEqual;
	private String dependencyOne = "This is a test Dependency";
	private String dependencyTwo = "This is another test Dependency";

	@Before
	public void instantiateTestClasses() {
		type = new NotTypeSafeEquals(dependencyOne);
		y = new NotTypeSafeEquals(dependencyOne);
		z = new NotTypeSafeEquals(dependencyOne);
		notEqual = new NotTypeSafeEquals(dependencyTwo);
	}

	@Test
	public void isTypeSafe() {
		Assert.assertEquals(type.equals(new Stack()), false);
	}
	
}
