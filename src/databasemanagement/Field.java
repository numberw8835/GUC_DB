package databasemanagement;

import java.io.Serializable;

/**
 * A class representing a field in a database table.
 */
public class Field implements Serializable {
    private String name;
    private Object thing;

    /**
     * Constructor for the Field class.
     *
     * @param name  The name of the field.
     * @param thing The value of the field.
     */
    public Field(String name, Object thing) {
        this.name = name;
        this.thing = thing;
    }

    /**
     * Getter for the name attribute.
     *
     * @return The name of the field.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name attribute.
     *
     * @param name The new value for the name attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the thing attribute.
     *
     * @return The value of the field.
     */
    public Object getThing() {
        return thing;
    }

    /**
     * Setter for the thing attribute.
     *
     * @param thing The new value for the thing attribute.
     */
    public void setThing(Object thing) {
        this.thing = thing;
    }


    public DataType getDataType() {
        if (thing instanceof String) {
            return DataType.STRING;
        } else if (thing instanceof Integer) {
            return DataType.INTEGER;
        } else if (thing instanceof Double) {
            return DataType.DOUBLE;
        } else {
            throw new IllegalArgumentException("Unknown data type: " + thing);
        }
    }

    /**
     * Returns a string representation of the field in the format "name=thing".
     *
     * @return A string representation of the field.
     */
    @Override
    public String toString() {
        return name + "=" + thing;
    }
}
