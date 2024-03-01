package databasemanagement;

/**
 * A class representing a placeholder in a database table.
 */
public class PlaceHolderField {
    private final String name;
    private final DataType type;

    /**
     * Constructor for the PlaceHolder class.
     *
     * @param name The name of the placeholder.
     * @param type The data type of the placeholder.
     */
    public PlaceHolderField(String name, String type) {
        this.name = name;
        this.type = detectDataType(type);
    }

    /**
     * Detects the data type of placeholder based on its name.
     *
     * @param name The name of the placeholder.
     * @return The detected data type of the placeholder.
     */
    private static DataType detectDataType(String name) {
        if (name.equals("java.lang.String")) {
            return DataType.STRING;
        } else if (name.equals("java.lang.Integer")) {
            return DataType.INTEGER;
        } else if (name.equals("java.lang.double")) {
            return DataType.DOUBLE;
        } else {
            throw new IllegalArgumentException("Cannot detect data type for " + name);
        }
    }

    /**
     * Gets the name of the placeholder.
     *
     * @return The name of the placeholder.
     */
    public String getName() {
        return name;
    }

    /**
     * Checks if this placeholder has the same data type and name as the given Field object.
     *
     * @param field The Field object to compare with.
     * @return True if this placeholder has the same data type and name as the given Field object, false otherwise.
     */
    public boolean hasSameDataTypeAndName(Field field) {
        return (type == field.getDataType()) && (name.equals(field.getName()));
    }

    @Override
    public String toString() {
        return "PlaceHolder{" + "name='" + name + '\'' + ", type=" + type + '}';
    }
}