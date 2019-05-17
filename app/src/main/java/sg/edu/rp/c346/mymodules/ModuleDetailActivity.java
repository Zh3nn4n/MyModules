package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer= findViewById(R.id.textVIew1);


        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        String year = intentReceived.getStringExtra("year");
        String semester = intentReceived.getStringExtra("semester");
        String credit = intentReceived.getStringExtra("module Credit");
        String venue = intentReceived.getStringExtra("venue");
        tvAnswer.setText(code + "\n"
        +name + "\n" + year + "\n" + semester + "\n" + credit + "\n" + venue);
    }
}
