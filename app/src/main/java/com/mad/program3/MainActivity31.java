package com.mad.program3;
import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;

import android.os.Bundle;
import android.widget.TextView;

import com.mad.program1.R;

public class MainActivity31 extends AppCompatActivity {

    TextView t1,t2,t3,t4;

    String name,reg,dept,sem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main31);

        t1= (TextView) findViewById(R.id.textView1);
        t2= (TextView) findViewById(R.id.textView2);
        t3= (TextView) findViewById(R.id.textView3);
        t4= (TextView) findViewById(R.id.textView4);

        Intent i = getIntent();

        name=i.getStringExtra("name_key"); reg=i.getStringExtra("reg_key"); dept=i.getStringExtra("dept_key");sem=i.getStringExtra("sem_key");

        t1.setText(name);
        t2.setText(reg);
        t3.setText(dept);
        t4.setText(sem);

    }
}