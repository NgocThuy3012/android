package tin.ngolamquang.sqlitedemo.Util;

import android.content.Context;

public class FakeData {

    public void addDataClass(Context context){
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO class VALUES(null, \"Lớp 1\")");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO class VALUES(null, \"Lớp 2\")");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO class VALUES(null, \"Lớp 3\")");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO class VALUES(null, \"Lớp 4\")");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO class VALUES(null, \"Lớp 5\")");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO class VALUES(null, \"Lớp 6\")");
    }

    public void addDataStudent(Context context){
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO student VALUES(null, \"Nguyễn Văn A\",5, 1)");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO student VALUES(null, \"Nguyễn Văn B\",5, 2)");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO student VALUES(null, \"Nguyễn Văn C\",5, 3)");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO student VALUES(null, \"Nguyễn Văn D\",5, 4)");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO student VALUES(null, \"Nguyễn Văn E\",5, 5)");
        DBUtil.getDBManager(context).createOrEditData("INSERT INTO student VALUES(null, \"Nguyễn Văn F\",5, 6)");
    }
}
