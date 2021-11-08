package tin.ngolamquang.sqlitedemo.Service;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import tin.ngolamquang.sqlitedemo.DBManger.DBManager;
import tin.ngolamquang.sqlitedemo.Model.Class;
import tin.ngolamquang.sqlitedemo.Model.Student;
import tin.ngolamquang.sqlitedemo.Util.DBUtil;

public class ClassService {
    private DBManager dbManager;

    public ClassService(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public boolean createDbClass(){
        try{
            dbManager.createOrEditData(DBUtil.CREATE_TABLE_CLASS);

            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public List<Class> getListClass(){
        List<Class> classes = new ArrayList<>();

        Cursor cursor = dbManager.getDataFromData("SELECT * FROM class", null);

        while (cursor.moveToNext()){
            Class newClass = new Class();

            newClass.setIdClass(String.valueOf(cursor.getInt(0)));
            newClass.setName(cursor.getString(1));

            classes.add(newClass);
        }

        return classes;

    }


}
