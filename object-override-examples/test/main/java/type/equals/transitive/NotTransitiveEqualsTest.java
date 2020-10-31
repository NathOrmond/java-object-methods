package main.java.type.equals.transitive;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.type.AbstractDataTypeBean;
import main.java.type.equals.transitive.NotTransitiveEquals;

public class NotTransitiveEqualsTest {
	private AbstractDataTypeBean type, y, z, notEqual;
	private NotTransitiveEqualsSubClass subClassedType;
	private String dependencyOne = "This is a test Dependency";
	private String dependencyTwo = "This is another test Dependency";

	@Before
	public void instantiateTestClasses() {
		type = new NotTransitiveEquals(dependencyOne);
		subClassedType = new NotTransitiveEqualsSubClass(dependencyOne, 2);
		y = new NotTransitiveEquals(dependencyOne);
		z = new NotTransitiveEquals(dependencyOne);
		notEqual = new NotTransitiveEquals(dependencyTwo);
	}

	
	@Test
	public void isTransitive() {
		Assert.assertEquals(type.equals(y), true);
		Assert.assertEquals(type.equals(subClassedType), true);
		Assert.assertEquals(y.equals(z), true);
		Assert.assertEquals(type.equals(z), true);
	}
	
	@Test
	public void isSymmetric() {
		Assert.assertEquals(type.equals(this.y), true);
		Assert.assertEquals(type.equals(notEqual), false);
	}


}
