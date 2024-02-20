package databasemanagement;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Tuple implements Serializable {

    private final Map<String, Object> tuple;
    private String name = "";

    public Tuple(String name, Integer object) {
        tuple = new HashMap<String, Object>();
        this.name = name;
        tuple.put(name, object);
    }

    public Tuple(String name, String object) {
        this.name = name;
        tuple = new HashMap<String, Object>();
        tuple.put(name, object);
    }

    public Tuple(String name, Double object) {
        this.name = name;
        tuple = new HashMap<String, Object>();
        tuple.put(name, object);
    }

    public String getName() {
        return name;
    }

    public Object getObject() {
        return tuple.get(name);
    }
}