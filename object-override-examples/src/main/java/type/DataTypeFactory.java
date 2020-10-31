package main.java.type;

import main.java.type.equals.bad.BadEquals;
import main.java.type.equals.good.GoodEquals;
import main.java.type.equals.symmetric.NotNullSafeEquals;
import main.java.type.equals.symmetric.NotSymmetricEquals;
import main.java.type.equals.symmetric.NotTypeSafeEquals;
import main.java.type.equals.transitive.NotTransitiveEquals;

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
