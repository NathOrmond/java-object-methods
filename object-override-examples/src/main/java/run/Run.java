package main.java.run;

import main.java.type.AbstractDataTypeBean;
import main.java.type.DataTypeFactory;

public class Run {

	private static DataTypeFactory factory = null;
	
	public static void main(String[] args) {
		new EqualsTests(getType(), getType(), getType(), getNotEquals());
	}
	
	public static AbstractDataTypeBean getType() {
		if(factory == null) {
			factory = new DataTypeFactory();
		} 
		String dependency = "This is an example of data";
		// createBadEquals createNotNullSafeEquals createNotTypeSafeEquals createNotSymmetricEquals createNotTransitiveEquals createGoodEquals
		return factory.createBadEquals(dependency);
	}
	
	public static AbstractDataTypeBean getNotEquals() {
		if(factory == null) {
			factory = new DataTypeFactory();
		} 
		return factory.createGoodEquals("Different dependency injection...");
	}
	
	
	
}
