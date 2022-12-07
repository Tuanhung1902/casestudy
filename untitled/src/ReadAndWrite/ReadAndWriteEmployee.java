package ReadAndWrite;

import Model.Admin;
import Model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    static File file = new File("D:\\CaseStudy22222\\untitled\\Employee.txt");

    public static void write(ArrayList<Employee> SaveEmployee) {


        try {

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(SaveEmployee);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Employee> read(){
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return(ArrayList<Employee>) objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();

        }
    }
}

