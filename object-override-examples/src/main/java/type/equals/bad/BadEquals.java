package main.java.type.equals.bad;

import main.java.type.AbstractDataTypeBean;

public class BadEquals extends AbstractDataTypeBean{

	public BadEquals(String data) {
		super(data);
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this == obj);
	}
}
