package databasemanagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class SystemControl {
    private Vector<Table> tables;

    public SystemControl() {
        // Check if there is a serialized file in dir
        File[] files = new File("tables").listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".bin")) {
                try {
                    tables = deserialize(file);
                } catch (IOException e) {
                    // Handle exception
                } catch (ClassNotFoundException e) {
                    tables = new Vector<Table>();
                }
            }
        }
    }

    public Vector<Table> getTables() {
        return tables;
    }

    private Vector<Table> deserialize(File file) throws IOException, ClassNotFoundException {
        // Create a new instance of ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // Read the object from the stream and cast it to Vector<Table>
        tables = (Vector<Table>) ois.readObject();

        // Close the stream
        ois.close();
        return tables;
    }

}
