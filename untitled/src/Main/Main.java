

package Main;

import Manager.ManagerAdmin;
import Manager.ManagerEmployee;
import Model.Employee;
import Model.Shift;
import ReadAndWrite.ReadAndWriteEmployee;
import ReadAndWrite.ReadAndWriteShift;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ManagerAdmin managerAdmin = new ManagerAdmin();
    static ManagerEmployee managerEMployee = new ManagerEmployee();

    public static void main(String[] args) {

        ReadAndWriteEmployee.read();
        ReadAndWriteShift.read();
        while(true) {
            System.out.println("Menu");
            System.out.println("1.Đăng nhập Admin");
            System.out.println("2.Đăng nhập nhân viên");
            System.out.println("3.Thoat");
            int choie = Integer.parseInt(scanner.nextLine());
            switch (choie) {
                case 1:
                    managerAdmin.CreateAdmin();
                    managerAdmin.loginAdmin();
                    break;
                case 2:
                    managerEMployee.looginEmployye();
                    break;
                case 3:
                    return;
            }
        }
    }

    static {
        scanner = new Scanner(System.in);
        managerAdmin = new ManagerAdmin();
        managerEMployee = new ManagerEmployee();
    }
}
