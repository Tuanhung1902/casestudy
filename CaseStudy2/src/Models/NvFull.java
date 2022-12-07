package Models;

public class NvFull extends Admin {
    private String name;
    private int age;
    private String gender;
    private boolean trangthai;
    private double heso;

    public NvFull() {
    }

    public NvFull(String username, String password, String name, int age, String gender, boolean trangthai, double heso) {
        super(username, password);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.trangthai = trangthai;
        this.heso = heso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    public double tinhLuong(){
        return heso*200000;
    }
}