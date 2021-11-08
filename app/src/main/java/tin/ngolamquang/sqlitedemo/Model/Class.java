package tin.ngolamquang.sqlitedemo.Model;

import java.util.List;

public class Class {
    private String idClass;
    private String name;
    private List<Student> students;


    public Class(String idClass, String name, List<Student> students) {
        this.idClass = idClass;
        this.name = name;
        this.students = students;
    }

    public Class() {
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
