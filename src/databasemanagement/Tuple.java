package databasemanagement;

import java.io.Serializable;

public class Tuple implements Serializable {

    private String name = "";
    private final Object thing;

    public Tuple(String name, Integer object) {
        this.name = name;
        thing = object;
    }

    public Tuple(String name, String object) {
        this.name = name;
        thing = object;
    }

    public Tuple(String name, Double object) {
        this.name = name;
        thing = object;
    }

    public String getName() {
        return name;
    }

    public Object getObject() {
        return thing;
    }

    @Override
    public String toString() {
        return getName() + "=" + thing;
    }
}