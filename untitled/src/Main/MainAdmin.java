//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Main;

import Manager.ManagerEmployee;
import Manager.ManagerShift;
import java.util.Scanner;

public class MainAdmin {
    static Scanner scanner;
    static ManagerEmployee managerEMployee1;
    static ManagerShift managerShift;

    public MainAdmin() {
    }

    public void mainAdmin() {
        while(true) {
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Sửa nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Hiển thị nhân viên");
            System.out.println("5.Thêm ca làm việc");
            System.out.println("6.Sửa ca làm việc");
            System.out.println("7.Xóa ca làm việc");
            System.out.println("8.Đăng xuất");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerEMployee1.CreateEmployee();
                    break;
                case 2:
                    managerEMployee1.editEmployye();
                    break;
                case 3:
                    managerEMployee1.deleteEmployye();
                    break;
                case 4:
                    managerEMployee1.show();
                    break;
                case 5:
                    managerShift.craterShift();
                    break;
                case 6:
                    managerShift.editShift();
                    break;
                case 7:
                    managerShift.delete();
                    break;
                case 8:
                    return;
            }
        }
    }

    static {
        scanner = new Scanner(System.in);
        managerEMployee1 = new ManagerEmployee();
        managerShift = new ManagerShift();
    }
}
