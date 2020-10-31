package main.java.type.equals.symmetric;

import main.java.type.AbstractDataTypeBean;

public class NotNullSafeEquals extends AbstractDataTypeBean {

	public NotNullSafeEquals(String data) {
		super(data);
	}
	
	@Override
	public boolean equals(Object obj) {
		NotNullSafeEquals compareTo = (NotNullSafeEquals) obj;
		return compareTo.getData().equals(this.getData());
	}

}
