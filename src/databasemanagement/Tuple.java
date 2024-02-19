package databasemanagement;

import java.io.Serializable;

public class Tuple implements Serializable {

    String name;
    Object object;

    public Tuple(String name, Integer object) {
        this.name = name;
        this.object = object;
    }

    public Tuple(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public Tuple(String name, Double object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public Object getObject() {
        return object;
    }
}