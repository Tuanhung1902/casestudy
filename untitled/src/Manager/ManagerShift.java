
package Manager;

import Model.Employee;
import Model.Shift;
import ReadAndWrite.ReadAndWriteEmployee;
import ReadAndWrite.ReadAndWriteShift;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerShift {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Shift> SaveShift= (ArrayList<Shift>) ReadAndWriteShift.read();



ManagerEmployee managerEmployee = new ManagerEmployee();
    public void craterShift() {
        System.out.println("Nhập mã ca làm việc");
        String ID = scanner.nextLine();
        System.out.println("Nhập ngày làm việc");
        String day = scanner.nextLine();
        System.out.println("Nhập ca làm việc");
        String session = scanner.nextLine();
        Shift shift = new Shift(ID, day, session);
        SaveShift.add(shift);
        System.out.println("Tạo lịch làm việc thành công");
        ReadAndWriteShift.write(SaveShift);
    }

    public int chechibyShift(String ID) {
        for(int i = 0; i < SaveShift.size(); ++i) {
            if (ID.equals(((Shift)SaveShift.get(i)).getID())) {
                return i;
            }
        }

        return -1;
    }

    public void delete() {
        System.out.println("Nhập id ca làm việc muốn xóa");
        String ID = scanner.nextLine();
        if (this.chechibyShift(ID) == -1) {
            System.out.println("Ca làm việc muốn xóa không tồn tại");
        } else {
            int index = this.chechibyShift(ID);
            SaveShift.remove(index);
            System.out.println("Xóa thành công");
            ReadAndWriteShift.write(SaveShift);
        }

    }

    public void editShift() {
        System.out.println("Nhập id ca làm việc muốn sửa");
        String ID = scanner.nextLine();
        if (this.chechibyShift(ID) == -1) {
            System.out.println("Ca làm việc muốn sửa không tồn tại");
        } else {
            int index = this.chechibyShift(ID);
            System.out.println("Lịch làm việc muốn sửa");
            System.out.println("1.Sửa ngày làm việc");
            System.out.println("2.Sửa ca làm việc");
            System.out.println("3.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập ngày làm việc muốn sửa");
                    String day = scanner.nextLine();
                    ((Shift)SaveShift.get(index)).setDays(day);
                    System.out.println("Sửa thành công");
                    ReadAndWriteShift.write(SaveShift);
                    break;
                case 2:
                    System.out.println("Nhập ca làm việc muốn sửa");
                    String session = scanner.nextLine();
                    ((Shift)SaveShift.get(index)).setSession(session);
                    System.out.println("Sửa thành công");
                    ReadAndWriteShift.write(SaveShift);
                    break;
                case 3:
                    return;
            }
        }

    }

    public void showShift() {
        for(int i = 0; i < SaveShift.size(); ++i) {
            System.out.println(((Shift)SaveShift.get(i)).toString());
        }

    }

    public int check(int choice) {
        for(int i = 0; i < SaveShift.size(); ++i) {
            if (choice - 1 == i) {
                return i;
            }
        }

        return -1;
    }

    public void RegisterShift() {
        this.showShift();
        System.out.println(" Đăng ký ca làm việc");
        int choie = Integer.parseInt(scanner.nextLine());
        if (this.check(choie) == -1) {
            System.out.println("Ca làm việc muốn đăng ký không tồn tại");
        } else {
            int index = this.check(choie);
            ManagerEmployee ManagerEMployee;
            ((Employee)ManagerEmployee.SaveEmployee.get(ManagerEmployee.IDEmployee)).getSaveShift().add((Shift)SaveShift.get(index));
            System.out.println("Đăng ký ca làm việc thành công");
            ReadAndWriteShift.write(SaveShift);
        }

    }

    public void showca() {
        for(int i = 0; i < (managerEmployee.SaveEmployee.get(managerEmployee.IDEmployee)).getSaveShift().size(); ++i) {
            System.out.println(((Shift)(managerEmployee.SaveEmployee.get(managerEmployee.IDEmployee)).getSaveShift().get(i)).toString());
        }

    }

    static {
        scanner = new Scanner(System.in);
        SaveShift = new ArrayList();
    }
}
