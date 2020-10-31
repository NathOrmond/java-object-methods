package main.java.type.equals.symmetric;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.type.AbstractDataTypeBean;
import main.java.type.equals.symmetric.NotSymmetricEquals;

public class NotSymmetricEqualsTest {

	private AbstractDataTypeBean type, y, z, notEqual;
	private String dependencyOne = "This is a test Dependency";
	private String caseInsensitiveDependencyOne = "this is another test dependency";
	private String dependencyTwo = "This is another test Dependency";
	

	@Before
	public void instantiateTestClasses() {
		type = new NotSymmetricEquals(dependencyOne);
		y = new NotSymmetricEquals(dependencyOne);
		z = new NotSymmetricEquals(dependencyOne);
		notEqual = new NotSymmetricEquals(dependencyTwo);
	}

	@Test
	public void isSymmetric() {
		Assert.assertEquals(type.equals(this.y), true);
		Assert.assertEquals(type.equals(caseInsensitiveDependencyOne), true); // We want it to fail here
		Assert.assertEquals(type.equals(notEqual), false);
	}
	
}
