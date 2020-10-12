package main.java.type;

import main.java.type.equals.BadEquals;
import main.java.type.equals.GoodEquals;
import main.java.type.equals.NotNullSafeEquals;
import main.java.type.equals.NotSymmetricEquals;
import main.java.type.equals.NotTransitiveEquals;
import main.java.type.equals.NotTypeSafeEquals;

public class DataTypeFactory implements IDataTypeFactory{
	
	public AbstractDataTypeBean createBadEquals(String dependency) {
		return new BadEquals(dependency);
	}

	public AbstractDataTypeBean createNotNullSafeEquals(String dependency) {
		return new NotNullSafeEquals(dependency);
	}
	
	public AbstractDataTypeBean createNotTypeSafeEquals(String dependency) { 
		return new NotTypeSafeEquals(dependency);
	}

	public AbstractDataTypeBean createNotSymmetricEquals(String dependency) {
		return new NotSymmetricEquals(dependency);
	}

	public AbstractDataTypeBean createNotTransitiveEquals(String dependency) {
		return new NotTransitiveEquals(dependency);
	}

	public AbstractDataTypeBean createGoodEquals(String dependency) {
		return new GoodEquals(dependency);
	}

}
