package ReadAndWrite;

import Model.Admin;
import Model.Shift;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteShift {
    static String url = "Shift.txt";
    public static void write(ArrayList<Shift> SaveShift) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(url);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(SaveShift);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Shift> read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(url);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Shift>) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }
}

