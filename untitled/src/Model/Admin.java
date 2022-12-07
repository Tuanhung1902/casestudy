
package Model;

import java.io.Serializable;

public class Admin implements Serializable {
    private String account;
    private String Pass;

    public Admin(String account, String pass) {
        this.account = account;
        this.Pass = pass;
    }

    public Admin() {
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return this.Pass;
    }

    public void setPass(String pass) {
        this.Pass = pass;
    }

    public String toString() {
        return "account='" + this.account + "', Pass='" + this.Pass + "'}";
    }
}
