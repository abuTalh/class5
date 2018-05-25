package com.example.lenovo.class6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void press(View View)
        {
            Toast.makeText(MainActivity.this,text"button has been pressed!",Toast.LENGTH_LONG).show();
        }
    }
}
