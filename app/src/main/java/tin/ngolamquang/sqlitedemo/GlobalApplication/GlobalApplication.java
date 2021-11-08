package tin.ngolamquang.sqlitedemo.GlobalApplication;

import android.app.Application;

import java.util.List;

import tin.ngolamquang.sqlitedemo.Model.Class;
import tin.ngolamquang.sqlitedemo.Model.Student;
import tin.ngolamquang.sqlitedemo.Service.ClassService;
import tin.ngolamquang.sqlitedemo.Service.StudentService;
import tin.ngolamquang.sqlitedemo.Util.DBUtil;
import tin.ngolamquang.sqlitedemo.Util.FakeData;

public class GlobalApplication extends Application {

    private ClassService classService;
    private StudentService studentService;

    @Override
    public void onCreate() {
        super.onCreate();

        init();

        classService.createDbClass();

        studentService.createStudent();

        createFakeData();
    }

    public void createFakeData(){
        List<Class> classes = classService.getListClass();
        List<Student> students = studentService.getListStudent();

        if(classes.size() == 0 && students.size() == 0){
            FakeData fakeData = new FakeData();
            fakeData.addDataClass(getApplicationContext());

            fakeData.addDataStudent(getApplicationContext());
        }else{
           return;
        }
    }


    public void init(){
        studentService = new StudentService(DBUtil.getDBManager(getApplicationContext()));
        classService = new ClassService(DBUtil.getDBManager(getApplicationContext()));
    }
}
