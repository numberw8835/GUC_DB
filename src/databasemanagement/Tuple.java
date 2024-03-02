package databasemanagement;

import java.util.Vector;

public class Tuple {
    private Vector<Field> tuple;

    public Tuple(Vector<Field> tuple) {
        this.tuple = new Vector<>(tuple);
    }

    public Tuple() {
        this.tuple = new Vector<>();
    }

    public void addField(Field field) {
        tuple.addLast(field);
    }

    public void deleteField(Field field) {
        tuple.removeLast();
    }

    @Override
    public String toString() {
        String result = "";
        int i = 0;
        for (Field field : tuple) {
            result += field.toString();
            if (i < tuple.size() - 1) {
                result += ", ";
            }
            i++;
        }
        return result;
    }
}
