package cn.itcast.weatherapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import cn.itcast.weatherapp.db.City;

/*import org.litepal.LitePal;*/

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*LitePal.initialize(this);*/
        setContentView(R.layout.activity_main);

        Button creatDB_btn = findViewById(R.id.creatDB_btn);
        creatDB_btn.setOnClickListener(this);
        Button addData_btn = findViewById(R.id.addData_btn);
        addData_btn.setOnClickListener(this);
        Button updateData_btn = findViewById(R.id.updateData_btn);
        updateData_btn.setOnClickListener(this);
        Button deleteData_btn = findViewById(R.id.deleteData_btn);
        deleteData_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.creatDB_btn:
                MainActivity.getDatabase();
                break;
            case R.id.addData_btn:
                City addData_btn = new City();
            case R.id.updateData_btn:
                City updateData_btn = new City();

            case R.id.deleteData_btn:
                /*LitePal.delete(Album.class,1);*/
            default:
                break;
        }
    }

    private static void getDatabase() {
    }
}
