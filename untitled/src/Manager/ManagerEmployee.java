
package Manager;

import Main.MainEmployee;
import Model.Employee;
import Model.Shift;
import ReadAndWrite.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerEmployee {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> SaveEmployee = (ArrayList<Employee>) ReadAndWriteEmployee.read();
    static int IDEmployee;
    static MainEmployee mainEmployee9 = new MainEmployee();



    public void CreateEmployee() {
        System.out.println("Nhập tên đăng nhập");
        String Account = scanner.nextLine();
        System.out.println("Nhập mật khẩu");
        String pass = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String Name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân vieên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên");
        String Gender = scanner.nextLine();
        System.out.println("Nhập mã nhân viên");
        String IDEMployee = scanner.nextLine();
        ArrayList<Shift> saveShift = new ArrayList();
        Employee employee = new Employee(Account, pass, Name, age, Gender, IDEMployee, saveShift);
        SaveEmployee.add(employee);
        System.out.println("Tạo nhân viên thành công");
        ReadAndWriteEmployee.write(SaveEmployee);
    }

    public boolean checkAccount(String Account) {
        for (int i = 0; i < SaveEmployee.size(); ++i) {
            if (Account.equals(((Employee) SaveEmployee.get(i)).getAccount())) {
                IDEmployee = i;
                return true;
            }
        }

        return false;
    }

    public boolean checkPass(String pass) {
        for (int i = 0; i < SaveEmployee.size(); ++i) {
            if (pass.equals(((Employee) SaveEmployee.get(i)).getPass())) {
                return true;
            }
        }

        return false;
    }

    public int checkAccount1(String Account) {
        for (int i = 0; i < SaveEmployee.size(); ++i) {
            if (Account.equals(((Employee) SaveEmployee.get(i)).getAccount())) {
                return i;
            }
        }

        return -1;
    }

    public void looginEmployye() {
        System.out.println("Nhập tên tài khoản");
        String Account = scanner.nextLine();
        if (this.checkAccount(Account)) {
            System.out.println("Nhập mật khẩu");
            String pass = scanner.nextLine();
            if (this.checkPass(pass)) {
                System.out.println("Đăng nhập thành công");
                mainEmployee9.mainEmployye();
            } else {
                System.out.println("Đăng nhập thất bại");
            }
        } else {
            System.out.println("Tài khoản không tồn tại");
        }

    }

    public void deleteEmployye() {
        System.out.println("Nhập tên tài khoản muốn xóa");
        String Account = scanner.nextLine();
        if (this.checkAccount1(Account) == -1) {
            System.out.println("Tài khoản không tồn tại");
        } else {
            int index = this.checkAccount1(Account);
            SaveEmployee.remove(index);
            System.out.println("Xóa tài khoản thành công");
            ReadAndWriteEmployee.write(SaveEmployee);
        }

    }

    public void editEmployye() {
        System.out.println("Nhập tên tài khoản muốn sửa");
        String Account = scanner.nextLine();
        if (this.checkAccount1(Account) == -1) {
            System.out.println("Tài khoản không tồn tại");
        } else {
            int index = this.checkAccount1(Account);
            System.out.println("Thông tin muốn sửa");
            System.out.println("1.Sửa tên");
            System.out.println("2.Sửa tuổi");
            System.out.println("3.Sửa giới tính");
            System.out.println("4.Sửa mã nhân viên");
            System.out.println("5.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên muốn sửa");
                    String name = scanner.nextLine();
                    ((Employee) SaveEmployee.get(index)).setName(name);
                    System.out.println("Sửa thành công");
                    ReadAndWriteEmployee.write(SaveEmployee);
                    break;
                case 2:
                    System.out.println("Nhập tuổi muốn sửa");
                    int age = Integer.parseInt(scanner.nextLine());
                    ((Employee) SaveEmployee.get(index)).setAge(age);
                    System.out.println("Sửa thành công");
                    ReadAndWriteEmployee.write(SaveEmployee);
                    break;
                case 3:
                    System.out.println("Nhập giới tính muốn sửa");
                    String gender = scanner.nextLine();
                    ((Employee) SaveEmployee.get(index)).setGender(gender);
                    System.out.println("Sửa thành công");
                    ReadAndWriteEmployee.write(SaveEmployee);
                    break;
                case 4:
                    System.out.println("Nhập mã nhân viên muốn sửa");
                    String ID = scanner.nextLine();
                    ((Employee) SaveEmployee.get(index)).setIDEmployee(ID);
                    System.out.println("Sửa thành công");
                    ReadAndWriteEmployee.write(SaveEmployee);
                    break;
                case 5:
                    return;
            }
        }

    }

    public void show() {
        for (int i = 0; i < SaveEmployee.size(); ++i) {
            System.out.println(((Employee) SaveEmployee.get(i)).toString());
        }

    }

    public void fixpass() {
        System.out.println("Nhập tài khoản muốn đổi pass");
        String Account = scanner.nextLine();
        if (this.checkAccount1(Account) == -1) {
            System.out.println("Sai tên tài khoản");
        } else {
            int index = this.checkAccount1(Account);
            System.out.println("Nhập mật khẩu cũ");
            String pass = scanner.nextLine();
            if (!this.checkPass(pass)) {
                System.out.println("Mật khẩu cũ không đúng");
            } else {
                System.out.println("Nhập mật khẩu mới");
                String newpass = scanner.nextLine();
                ((Employee) SaveEmployee.get(index)).setPass(newpass);
                System.out.println("Đổi mật khẩu thành công");
                ReadAndWriteEmployee.write(SaveEmployee);
            }
        }

    }
}

