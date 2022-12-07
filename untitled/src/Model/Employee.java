

package Model;

import java.io.Serializable;
import java.util.List;

public class Employee extends Admin implements Serializable {
    private String name;
    private int age;
    private String gender;
    private String IDEmployee;
    public List<Shift> SaveShift;

    public Employee(String account, String pass, String name, int age, String gender, String IDEmployee, List<Shift> saveShift) {
        super(account, pass);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.IDEmployee = IDEmployee;
        this.SaveShift = saveShift;
    }

    public Employee() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDEmployee() {
        return this.IDEmployee;
    }

    public void setIDEmployee(String IDEmployee) {
        this.IDEmployee = IDEmployee;
    }

    public List<Shift> getSaveShift() {
        return this.SaveShift;
    }

    public void setSaveShift(List<Shift> saveShift) {
        this.SaveShift = saveShift;
    }

    public String toString() {
        String var10000 = super.toString();
        return "Employee{" + var10000 + "name='" + this.name + "', age=" + this.age + ", gender='" + this.gender + "', IDEmployee='" + this.IDEmployee + "', SaveShift=" + this.SaveShift + "}";
    }
}
