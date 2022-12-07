package ReadAndWrite;

import Model.Admin;
import Model.Shift;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteShift {
    static File file = new File("D:\\CaseStudy22222\\untitled\\Shift.txt");

    public static void write(ArrayList<Shift> SaveShift) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(SaveShift);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Shift> read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Shift>) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }
}

