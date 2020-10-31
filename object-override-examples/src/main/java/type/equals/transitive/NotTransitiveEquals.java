package main.java.type.equals.transitive;

import main.java.type.AbstractDataTypeBean;

public class NotTransitiveEquals extends AbstractDataTypeBean{

	public NotTransitiveEquals(String data) {
		super(data);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof NotTransitiveEquals)) { 
			return false;
		}
		
		NotTransitiveEquals compareTo = (NotTransitiveEquals) obj;
		return compareTo.getData().equals(getData());
	}
	


}
