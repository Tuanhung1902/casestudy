

package Model;

import java.io.Serializable;

public class Shift implements Serializable {
    private String ID;
    private String days;
    private String session;

    public Shift(String ID, String days, String session) {
        this.ID = ID;
        this.days = days;
        this.session = session;
    }

    public Shift() {
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDays() {
        return this.days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getSession() {
        return this.session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String toString() {
        return "Shift{ID=" + this.ID + ", days='" + this.days + "', session='" + this.session + "'}";
    }
}
