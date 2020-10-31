package main.java.type.equals.transitive;

public class NotTransitiveEqualsSubClass extends NotTransitiveEquals {

	private final int someOtherField;

	public NotTransitiveEqualsSubClass(String data, int someOtherField) {
		super(data);
		this.someOtherField = someOtherField;
	}

	public int getSomeOtherField() {
		return someOtherField;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof NotTransitiveEqualsSubClass)) {
			return false;
		}
		
		return super.equals(obj) && 
				     ((NotTransitiveEqualsSubClass) obj).getSomeOtherField() == getSomeOtherField();
	}

}
