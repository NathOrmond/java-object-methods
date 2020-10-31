package main.java.type.equals;

import main.java.type.AbstractDataTypeBean;

public class NotTypeSafeEquals extends AbstractDataTypeBean{

	public NotTypeSafeEquals(String data) {
		super(data);
	}
	
	@Override
	public boolean equals(Object obj) {
		NotTypeSafeEquals compareTo = (NotTypeSafeEquals) obj;
		return super.equals(compareTo);
	}

}
