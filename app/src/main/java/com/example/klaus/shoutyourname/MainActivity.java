/*
    Author : Rahul Nimavat

 */

package com.example.klaus.shoutyourname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mybutton;

    private TextView mytextview;

    private EditText mytext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mybutton = (Button) findViewById(R.id.button1);

        mytextview = (TextView) findViewById(R.id.textView);

        mytext = (EditText) findViewById(R.id.editText1);

        mybutton.setText(R.string.button);



        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myname;

                myname = mytext.getText().toString();

                mytextview.setVisibility(View.VISIBLE);

                mytextview.setText(myname);

            }
        });
    }
}
