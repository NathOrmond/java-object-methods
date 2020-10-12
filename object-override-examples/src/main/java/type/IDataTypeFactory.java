package main.java.type;

public interface IDataTypeFactory {

	public AbstractDataTypeBean createBadEquals(String dependency);
	public AbstractDataTypeBean createNotNullSafeEquals(String dependency);
	public AbstractDataTypeBean createNotTypeSafeEquals(String dependency);
	public AbstractDataTypeBean createNotSymmetricEquals(String dependency);
	public AbstractDataTypeBean createNotTransitiveEquals(String dependency);
	public AbstractDataTypeBean createGoodEquals(String dependency);

}
