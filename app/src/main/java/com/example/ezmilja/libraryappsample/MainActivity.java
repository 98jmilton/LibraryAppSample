package com.example.ezmilja.libraryappsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNameIs();
    }

    private void myNameIs(){
        button = (Button) findViewById(R.id.btn_test);
        textView = (TextView) findViewById(R.id.textView);

        textView.setAlpha(0f);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextSize( textView.getTextSize() + 1);
                textView.setAlpha(1f);
            }
        });

    }
}
