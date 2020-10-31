package main.java.type.equals.good;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.type.AbstractDataTypeBean;
import main.java.type.equals.good.GoodEquals;

public class GoodEqualsTest {

	private AbstractDataTypeBean type, y, z, notEqual;
	private String dependencyOne = "This is a test Dependency";
	private String dependencyTwo = "This is another test Dependency";

	@Before
	public void instantiateTestClasses() {
		type = new GoodEquals(dependencyOne);
		y = new GoodEquals(dependencyOne);
		z = new GoodEquals(dependencyOne);
		notEqual = new GoodEquals(dependencyTwo);
	}

	@Test
	public void isReflexive() {
		Assert.assertEquals(this.type.equals(this.type), true);
	}

	@Test
	public void isSymmetric() {
		Assert.assertEquals(type.equals(this.y), true);
		Assert.assertEquals(type.equals(notEqual), false);
	}

	@Test
	public void isTransitive() {
		Assert.assertEquals(type.equals(y), true);
		Assert.assertEquals(y.equals(z), true);
		Assert.assertEquals(type.equals(z), true);
	}

	@Test
	public void isConsistent() {
		Assert.assertEquals(type.equals(notEqual), false);
	}

	@Test
	public void isNullSafe() {
		Assert.assertEquals(type.equals(null), false);
	}

	@Test
	public void isTypeSafe() {
		Assert.assertEquals(type.equals(new Stack()), false);
	}
}
