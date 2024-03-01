package databasemanagement;

import java.util.Hashtable;
import java.util.Vector;

public class Table {
    private String tableName;
    private String primaryKey;
    private PlaceHolderTuple columns;
    private Hashtable<String, BPlusTree> clusterIndices;
    private Vector<Page> pages;

    public Table(String tableName, String primaryKey, PlaceHolderTuple columns) {
        this.tableName = tableName;
        this.primaryKey = primaryKey;
        this.columns = columns;
        this.clusterIndices = new Hashtable<>();
        this.pages = new Vector<>();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public PlaceHolderTuple getColumns() {
        return columns;
    }

    public void setColumns(PlaceHolderTuple columns) {
        this.columns = columns;
    }

    public Hashtable<String, BPlusTree> getClusterIndices() {
        return clusterIndices;
    }

    public void setClusterIndices(Hashtable<String, BPlusTree> clusterIndices) {
        this.clusterIndices = clusterIndices;
    }

    public Vector<Page> getPages() {
        return pages;
    }

    public void setPages(Vector<Page> pages) {
        this.pages = pages;
    }
}
