package databasemanagement;

import java.util.Vector;

public class Tuple {
    private Vector<PlaceHolder> tuple;

    public Tuple(Vector<PlaceHolder> placeHolders) {
        this.tuple = new Vector<>(placeHolders);
    }

    public boolean isInTuple(Field f) {
        for (int i = 0; i < tuple.size(); i++) {
            if (tuple.get(i).hasSameDataTypeAndName(f)) {
                return true;
            }
        }
        return false;
    }

    public void addPlaceholder(PlaceHolder placeholder) {
        this.tuple.add(placeholder);
    }

    public void deletePlaceholder(PlaceHolder placeholder) {
        for (int i = 0; i < tuple.size(); i++) {
            if (tuple.get(i).equals(placeholder)) {
                tuple.removeElementAt(i);
                break;
            }
        }
    }


}
