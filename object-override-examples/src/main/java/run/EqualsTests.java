package main.java.run;

public class EqualsTests {
AbstractDataTypeBean type, y, z, notEqual;
	
	public EqualsTests(AbstractDataTypeBean type, AbstractDataTypeBean y, AbstractDataTypeBean z, AbstractDataTypeBean notEqual ) {
		this.type = type;
		this.y = y;
		this.z = z;
		this.notEqual = notEqual;
	}
	
	public void runEqualsTest() { 
		printResults(isReflexive(), isSymmetric(), isTransitive(), isConsistent(), isNullSafe(), isTypeSafe());
	}
	
	public boolean isReflexive() {
		return this.type.equals(this.type);
	}
	
	public boolean isSymmetric() {
		return type.equals(this.y) && !type.equals(notEqual);
	}
	
	public boolean isTransitive() {
		return (type.equals(y) && y.equals(z) && type.equals(z));
	}
	
	public boolean isConsistent() { 
		return type.equals(notEqual);
	}
	
	public boolean isNullSafe() {
		return !type.equals(null);
	}
	
	public boolean isTypeSafe() {
		return !type.equals(new Stack());
	}
	
	void printResults(boolean reflexive, boolean symmetric, boolean transitive, boolean consistent, boolean isNullSafe, boolean isTypeSafe) { 
		System.out.println(String.format("Reflexive?  : [%b]", reflexive));
		System.out.println(String.format("Symmetric?  : [%b]", symmetric));
		System.out.println(String.format("Transitive? : [%b]", transitive));
		System.out.println(String.format("Consisent?  : [%b]", consistent));
		System.out.println(String.format("Null Safe?  : [%b]", isNullSafe));
		System.out.println(String.format("Type Safe?  : [%b]", isTypeSafe));
	}
}
