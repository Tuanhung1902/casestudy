

package Main;

import Manager.ManagerAdmin;
import Manager.ManagerEmployee;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static ManagerAdmin managerAdmin;
    static ManagerEmployee managerEMployee;

    public Main() {
    }

    public static void main(String[] args) {
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
