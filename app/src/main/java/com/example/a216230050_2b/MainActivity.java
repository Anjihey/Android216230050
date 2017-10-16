package com.example.a216230050_2b;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_move_page1;
    Button btn_move_page2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
        move();
    }

    private void setup()
    {
        btn_move_page1 = (Button) findViewById(R.id.button13);
        btn_move_page1.setOnClickListener(myListener);
        btn_move_page1.setSelected(true);

        btn_move_page2 = (Button) findViewById(R.id.button13);
        btn_move_page2.setOnClickListener(myListener);
        btn_move_page2.setSelected(false);

    }

    View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            btn_move_page2.setSelected(false);
            switch (v.getId()) {
                case R.id.button13:
                    btn_move_page2.setSelected(true);
                    move2();
                    break;
            }
        }
    };

    public void move(){
        page1 page1 = new page1();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.page, page1);
        fragmentTransaction.commit();
    }
    public void move2(){
        page2 page2 = new page2();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.page, page2);
        fragmentTransaction.commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "HYWU on Create");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "HYWU on Create");
    }

    public void NextScreen2 (View v){
        Toast toast= Toast.makeText(getApplicationContext(), "ID/ PW", Toast.LENGTH_SHORT);
        toast.show();

        Intent i = new Intent( getApplicationContext(), MainActivity2.class);
        startActivity(i);
    }
    public void NextScreen3 (View v){
        Intent i = new Intent( getApplicationContext(), MainActivity3.class);
        startActivity(i);
    }

    public void onClick(View v){
        EditText at = (EditText) findViewById(R.id.editText2);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(at.getText());
    }

}
