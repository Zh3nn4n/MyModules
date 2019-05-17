package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView android;
    TextView ipad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.android);
        ipad = findViewById(R.id.ipad);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","Module Code: C346");
                intent.putExtra("name","Module Name: Android Programming");
                intent.putExtra("year","Academic Year: 2018");
                intent.putExtra("semester","Semester: 1");
                intent.putExtra("module Credit","Module Credit: 4");
                intent.putExtra("venue","Venue: W66M");
                startActivity(intent);
            }
        });

        ipad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","Module Code: 349");
                intent.putExtra("name","Module Name: Android Programming");
                intent.putExtra("year","Academic Year: 2019");
                intent.putExtra("semester","Semester: 11");
                intent.putExtra("module Credit","Module Credit: 100");
                intent.putExtra("venue","Venue: Home");
                startActivity(intent);
            }
        });
    }
}
