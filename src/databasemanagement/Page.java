package databasemanagement;

import java.io.*;
import java.util.Vector;

public class Page implements Serializable {
    private static int indexName = 0;
    private int maxSize;
    private Vector<Tuple> values;

    public Page(int maxSize) {
        this.maxSize = maxSize;
        this.values = new Vector<>();
        indexName++;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Vector<Tuple> getValues() {
        return values;
    }

    public void addValue(Tuple value) throws Exception {
        if (values.size() <= maxSize) {
            values.add(value);
            return;
        }
        throw new Exception("Cannot add more than " + maxSize + " values");
    }

    public int getIndexName() {
        return indexName;
    }

    // TODO: Implement savePage() method: should save page to disk.
    public void savePage() {
        try {
            FileOutputStream fos = new FileOutputStream(new File("page_" + getIndexName()));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            System.out.println("Page " + getIndexName() + " saved to " + fos.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: Implement loadPage(int indexName) method: should load page with same index from disk.

    // TODO: Implement deletePage() method: should delete page from disk.

    // TODO: Implement checkForData() method: should check for data from disk.

}
