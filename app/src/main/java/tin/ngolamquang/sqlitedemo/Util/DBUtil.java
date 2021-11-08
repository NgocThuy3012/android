package tin.ngolamquang.sqlitedemo.Util;

import android.content.Context;

import tin.ngolamquang.sqlitedemo.DBManger.DBManager;

public class DBUtil {

    private static DBManager dbManager;

    public static DBManager getDBManager(Context context){
        if(dbManager == null){
            dbManager = new DBManager(context, NAME_DB,null, VERSION_DB);
        }

        return dbManager;
    }

    public static final int VERSION_DB = 1;

    public static final String NAME_DB = "studentmanager";

    public static final String CREATE_TABLE_CLASS = "CREATE TABLE IF NOT EXISTS class(idclass INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(50) NOT NULL)";

    public static final String CREATE_TABLE_STUDENT = "CREATE TABLE IF NOT EXISTS student(idstudent INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(50) NOT NULL, gba INTEGER, idClass INTEGER)";
}
