package main.java.type;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.type.equals.BadEquals;
import main.java.type.equals.GoodEquals;
import main.java.type.equals.NotNullSafeEquals;
import main.java.type.equals.NotSymmetricEquals;
import main.java.type.equals.NotTransitiveEquals;
import main.java.type.equals.NotTypeSafeEquals;

public class DataTypeFactoryTest {
	
	private DataTypeFactory factory;
	private String dependency = "This is a test dependency";
	
	@Before
	public void instantiateFactory() { 
		this.factory = new DataTypeFactory();
	}
	
	@Test
	public void createBadEqualsTest() {
		Assert.assertTrue(factory.createBadEquals(dependency) instanceof BadEquals);
	}

	@Test
	public void createNotNullSafeEqualsTest() {
		Assert.assertTrue(factory.createNotNullSafeEquals(dependency) instanceof NotNullSafeEquals);
	}
	
	@Test
	public void createNotTypeSafeEqualsTest() { 
		Assert.assertTrue(factory.createNotTypeSafeEquals(dependency) instanceof NotTypeSafeEquals);
	}

	@Test
	public void createNotSymmetricEqualsTest() {
		Assert.assertTrue(factory.createNotSymmetricEquals(dependency) instanceof NotSymmetricEquals);
	}

	@Test
	public void createNotTransitiveEqualsTest() {
		Assert.assertTrue(factory.createNotTransitiveEquals(dependency) instanceof NotTransitiveEquals);
	}

	@Test
	public void createGoodEqualsTest() {
		Assert.assertTrue(factory.createGoodEquals(dependency) instanceof GoodEquals);
	}
}
