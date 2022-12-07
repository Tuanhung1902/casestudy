package Manager;

import Models.Admin;
import Models.NvFull;
import Models.NvPart;

import java.util.ArrayList;
import java.util.Scanner;

public class qLyNvFull {
    Scanner scanner = new Scanner(System.in);
    ArrayList<NvFull> nvFulls = new ArrayList<>();

    public void show() {
        for (int i = 0; i < nvFulls.size(); i++) {
            System.out.println(nvFulls.get(i).toString());

        }
    }

    public NvFull taoNvFull() {
        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập hệ số");
        double heso = Double.parseDouble(scanner.nextLine());
        NvFull nvFull = new NvFull(username, password, name, age, gender,true, heso);
        return nvFull;
    }

    public void add(NvFull nvFull) {
        nvFulls.add(nvFull);
    }

    public int findIndexByUsername(String username) {
        for (int i = 0; i < nvFulls.size(); i++) {
            if (username.equals(nvFulls.get(i).getUsername())) {
                return i;
            }
        }
        return -1;
    }

    public void delete(String username) {
        int index = findIndexByUsername(username);
        if (index != -1) {
            nvFulls.remove(index);
        }
    }
    public Admin taoNhanVien(boolean NvFull) {
        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        if (NvFull) {
            System.out.println("Nhập hệ số nhân viên");
            double heSo = Double.parseDouble(scanner.nextLine());
            return new NvFull(username,password,name,age,gender,true,heSo);
        } else {
            System.out.println("Nhập số buổi nhân viên");
            int soBuoi = Integer.parseInt(scanner.nextLine());
            return new NvPart(username,password,name,age,gender,true,soBuoi);
        }
    }



    public void edit(String username) {
        int index = findIndexByUsername(username);
        System.out.println("Chọn nhân viên muốn sửa");
        System.out.println("1. Nhân viên FullTime");
        System.out.println("2. Nhân viên PartTime");
        int choice = Integer.parseInt(scanner.nextLine());
        while (choice < 1 || choice > 2) {
            System.out.println("Nhập lại");
            choice = Integer.parseInt(scanner.nextLine());
        }
            if (choice == 1) {
                System.out.println("1. Sửa password");
                System.out.println("2. Sửa hệ số lương");
                System.out.println("3. Sửa trạng thái");
                int choice1 = Integer.parseInt(scanner.nextLine());
                while (choice1 < 1 || choice1 > 2){
                    System.out.println("Nhập lại");
                    choice1 = Integer.parseInt(scanner.nextLine());
                }
                switch (choice1) {
                    case 1:
                        System.out.println("Nhập password mới");
                        String newPassWord = scanner.nextLine();
                        nvFulls.get(index).setPassword(newPassWord);
                        break;
                    case 2:
                        System.out.println("Nhập hệ số lương mới");
                        double newHeSo = Double.parseDouble(scanner.nextLine());
                        nvFulls.get(index).setHeso(newHeSo);
                        break;
                    case 3:
                        System.out.println("Sửa trạng thái");
                        System.out.println("1. Đang làm việc");
                        System.out.println("2. Đã nghỉ việc");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        if(choice2 == 1){
                            nvFulls.get(index).setTrangthai(true);
                        }else if (choice2 ==2){
                            nvFulls.get(index).setTrangthai(false);
                        }else {
                            System.out.println("Nhập lại");
                        }
                        break;
                }
            }


    }
    public void tinhLuong(){
        for (int i = 0; i < nvFulls.size(); i++) {
            System.out.println(nvFulls.get(i).getName() + "có lương:" + nvFulls.get(i).tinhLuong());

        }
    }


}
