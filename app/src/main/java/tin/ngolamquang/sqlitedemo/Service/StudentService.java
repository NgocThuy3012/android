package tin.ngolamquang.sqlitedemo.Service;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import tin.ngolamquang.sqlitedemo.DBManger.DBManager;
import tin.ngolamquang.sqlitedemo.Util.DBUtil;
import tin.ngolamquang.sqlitedemo.Model.Student;

public class StudentService {

    private DBManager dbManager;

    public StudentService(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public boolean createStudent(){
        try{
            dbManager.createOrEditData(DBUtil.CREATE_TABLE_STUDENT);

            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public List<Student> getListStudent(){
        List<Student> students = new ArrayList<>();
        Cursor cursor = dbManager.getDataFromData("SELECT * FROM student", null);

        while (cursor.moveToNext()){
            Student newStudent = new Student();
            newStudent.setIdStudent(String.valueOf(cursor.getInt(0)));
            newStudent.setName(cursor.getString(1));
            newStudent.setGba(cursor.getInt(2));

            students.add(newStudent);
        }

        return students;

    }

}
