package tin.ngolamquang.sqlitedemo.Model;

import java.io.Serializable;

public class Student implements Serializable {
    private String idStudent;
    private String name;
    private double gba;

    private Class _class;

    public Student(String idStudent, String name, double dtb, Class _class) {
        this.idStudent = idStudent;
        this.name = name;
        this.gba = dtb;
        this._class = _class;
    }

    public Student() {
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGba() {
        return gba;
    }

    public void setGba(double gba) {
        this.gba = gba;
    }

    public Class get_class() {
        return _class;
    }

    public void set_class(Class _class) {
        this._class = _class;
    }
}
