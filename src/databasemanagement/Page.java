package databasemanagement;

import java.io.Serializable;
import java.util.Vector;

public class Page implements Serializable {
    Vector<Tuple> records;

    public Page() {
        records = new Vector<Tuple>();
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
