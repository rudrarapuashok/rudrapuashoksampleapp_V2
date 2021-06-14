package com.nsgi.ashoklibrary;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text = "hello Ashok";
        t1 = (TextView)findViewById(R.id.t1);
        t1.setText(text);
        Log.e("ashok","message"+ text);
    }
}
