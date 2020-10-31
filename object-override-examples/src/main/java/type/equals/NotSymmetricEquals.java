package main.java.type.equals;

import main.java.type.AbstractDataTypeBean;

public class NotSymmetricEquals extends AbstractDataTypeBean{

	
	public NotSymmetricEquals(String data) {
		super(data);
	}
	
	@Override
	public boolean equals(Object obj) {
		return notSymmetricEqualsAttempt(obj);
//		return symmetricEquals(obj);
	}
	
	
	private boolean notSymmetricEqualsAttempt(Object obj) { 
		if(obj instanceof NotSymmetricEquals) { 
			return super.getData().equalsIgnoreCase(((NotSymmetricEquals) obj).getData());
		}
		
		// BROKEN - violates symmetry with one way interoperability
		if(obj instanceof String) { 
			return super.getData().equalsIgnoreCase((String) obj);
		}
		return false;
	}
	
	private boolean symmetricEquals(Object obj) { 
		return obj instanceof NotSymmetricEquals && 
							  ((NotSymmetricEquals) obj).getData().equalsIgnoreCase(getData());
	}


}
