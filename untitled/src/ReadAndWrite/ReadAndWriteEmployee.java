package ReadAndWrite;

import Model.Admin;
import Model.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    static String url = "Employee.txt";
    public static void write(ArrayList<Employee> SaveEmployee) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(url);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(SaveEmployee);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Employee> read(){
        try{
            FileInputStream fileInputStream = new FileInputStream(url);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return(ArrayList<Employee>) objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();

        }
    }
}
