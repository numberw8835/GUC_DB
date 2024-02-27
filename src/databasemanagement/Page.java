package databasemanagement;

import java.util.Vector;

public class Page {
    private static int indexName = 0;
    private int maxSize;
    private Vector<Field> values;

    public Page(int maxSize) {
        this.maxSize = maxSize;
        this.values = new Vector<>();
        indexName++;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Vector<Field> getValues() {
        return values;
    }

    public void setValues(Vector<Field> values) {
        this.values = values;
    }

    public int getIndexName() {
        return indexName;
    }
}
