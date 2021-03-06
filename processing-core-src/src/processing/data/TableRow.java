package processing.data;


public interface TableRow {
  public String getString(int column);
  public String getString(String columnName);
  public int getInt(int column);
  public int getInt(String columnName);
  public long getLong(int column);
  public long getLong(String columnName);
  public float getFloat(int column);
  public float getFloat(String columnName);
  public double getDouble(int column);
  public double getDouble(String columnName);
}
