 package org.keetech.ex10_1activityandintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

 public class MainActivity extends AppCompatActivity {
     Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton btnSecondActivity = findViewById(R.id.btn1);
        final RadioButton btnThirdActivity = findViewById(R.id.btn2);
        final Button btn3 = findViewById(R.id.btn3);


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnSecondActivity.isChecked()){
                    intent = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(intent);
                }else if(btnThirdActivity.isChecked()){
                    intent = new Intent(getApplicationContext(),Main3Activity.class);
                    startActivity(intent);

                }
            }
        });
    }
}
