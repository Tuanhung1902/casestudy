

package Main;

import Manager.ManagerEmployee;
import Manager.ManagerShift;
import java.util.Scanner;

public class MainEmployee {
    static Scanner scanner = new Scanner(System.in);
    static ManagerEmployee managerEMployee3 = new ManagerEmployee();
    static ManagerShift managerShift3 = new ManagerShift();


    public void mainEmployye() {
        while(true) {
            System.out.println("1.Đổi mật khẩu");
            System.out.println("2.Đăng ký ca làm việc");
            System.out.println("3.Xem lịch làm việc của tôi");
            System.out.println("4.Đăng xuất");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerEMployee3.fixpass();
                    break;
                case 2:
                    managerShift3.RegisterShift();
                    break;
                case 3:
                    managerShift3.showca();
                case 4:
            }
        }
    }

    static {
        scanner = new Scanner(System.in);
        managerEMployee3 = new ManagerEmployee();
        managerShift3 = new ManagerShift();
    }
}
