

package Manager;

import Main.MainAdmin;
import Model.Admin;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAdmin {
    static Scanner scanner = new Scanner(System.in);
    static List<Admin> SaveAdmin = new ArrayList<>();
    static MainAdmin mainAdmin9 = new MainAdmin();



    public void CreateAdmin() {
        Admin admin = new Admin("tuanhung1902", "123456");
        SaveAdmin.add(admin);
    }

    public boolean checklogin(String Account, String pass) {
        for(int i = 0; i < SaveAdmin.size(); ++i) {
            if (Account.equals(((Admin)SaveAdmin.get(i)).getAccount()) && pass.equals(((Admin)SaveAdmin.get(i)).getPass())) {
                return true;
            }
        }

        return false;
    }

    public void loginAdmin() {
        System.out.println("Nhập tên tài khoản");
        String Account = scanner.nextLine();
        System.out.println("Nhập mật khẩu");
        String pass = scanner.nextLine();
        if (!this.checklogin(Account, pass)) {
            System.out.println("Đăng nhập thất bại");
        } else {
            System.out.println("Đăng nhập thành công");
            mainAdmin9.mainAdmin();
        }

    }

    static {
        scanner = new Scanner(System.in);
        SaveAdmin = new ArrayList();
        mainAdmin9 = new MainAdmin();
    }
}
