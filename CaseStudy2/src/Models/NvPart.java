package Models;

public class NvPart extends Admin{
    private String name;
    private int age;
    private String gender;
    private boolean trangthai;
    private double sobuoi;

    public NvPart(String username, String password, boolean role) {
        super(username, password);
    }

    public NvPart(String username, String password,String name, int age, String gender, boolean trangthai, double sobuoi) {
        super(username, password);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.trangthai = trangthai;
        this.sobuoi = sobuoi;
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

    public double getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(double sobuoi) {
        this.sobuoi = sobuoi;
    }
    public double tinhLuong(){
        return sobuoi*500000;
    }

    @Override
    public String toString() {
        return "NvPart{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", trangthai=" + trangthai +
                ", sobuoi=" + sobuoi +
                '}';
    }
}
