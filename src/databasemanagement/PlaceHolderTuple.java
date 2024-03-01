package databasemanagement;

import java.util.Vector;

public class PlaceHolderTuple {
    private Vector<PlaceHolderField> tuple;

    public PlaceHolderTuple(Vector<PlaceHolderField> placeHolders) {
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

    public void addPlaceholder(PlaceHolderField placeholder) {
        this.tuple.add(placeholder);
    }

    public void deletePlaceholder(PlaceHolderField placeholder) {
        for (int i = 0; i < tuple.size(); i++) {
            if (tuple.get(i).equals(placeholder)) {
                tuple.removeElementAt(i);
                break;
            }
        }
    }


}
