package tin.ngolamquang.sqlitedemo.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import tin.ngolamquang.sqlitedemo.DBManger.DBManager;
import tin.ngolamquang.sqlitedemo.Model.Class;
import tin.ngolamquang.sqlitedemo.Model.Student;
import tin.ngolamquang.sqlitedemo.R;
import tin.ngolamquang.sqlitedemo.Service.ClassService;
import tin.ngolamquang.sqlitedemo.Service.StudentService;
import tin.ngolamquang.sqlitedemo.Util.DBUtil;
import tin.ngolamquang.sqlitedemo.Util.FakeData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}