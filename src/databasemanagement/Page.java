package databasemanagement;

import java.io.Serializable;
import java.util.Vector;

public class Page implements Serializable {
    private Vector<Tuple> records;

    public Page() {
        records = new Vector<Tuple>();
    }

    // TODO: Add a way to insert a tuple, i think?
    public void addTuple(Tuple t) {
        records.add(t);
    }

    @Override
    public String toString() {
        String out = "";
        int i = records.size();
        for (Tuple r : records) {
            out = out + r.getObject();
            i--;
            if (i != 0) {
                out = out + ",";
            }
        }
        return out;
    }
}
