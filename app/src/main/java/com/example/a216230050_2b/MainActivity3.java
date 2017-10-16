package com.example.a216230050_2b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity3 extends AppCompatActivity implements View.OnClickListener   {
    LinearLayout lli1, lli2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lli1 = (LinearLayout)findViewById(R.id.l11);
        lli2 = (LinearLayout)findViewById(R.id.l22);

        Button b1 = (Button)findViewById(R.id.button16);
        b1.setOnClickListener(this);

        lli2.setVisibility(View.GONE);

        final TextView tv = (TextView)findViewById(R.id.t10);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv.setText("age: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button16:
                lli1.setVisibility(v.GONE);
                lli2.setVisibility(v.VISIBLE);
                break;
        }
    }


    public void NextScreen1 (View v){
        Toast toast= Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT);
        toast.show();

        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
    public void NextScreen2 (View v){
        Toast toast= Toast.makeText(getApplicationContext(), "ID/ PW", Toast.LENGTH_SHORT);
        toast.show();

        Intent i = new Intent( this, MainActivity2.class);
        startActivity(i);
    }

    public void Oncheck1 (View v){
        TextView t1 = (TextView)findViewById(R.id.textView21);
        RadioButton r1 = (RadioButton)findViewById(R.id.radioButton1);
        if (r1.isChecked()){
            t1.setText("Checked!");
        }
    }

    public void Oncheck2 (View v){
        TextView t1 = (TextView)findViewById(R.id.textView22);
        RadioButton r1 = (RadioButton)findViewById(R.id.radioButton2);
        if (r1.isChecked()){
            t1.setText("Checked!");
        }
    }

    public void Oncheck3 (View v){
        TextView t1 = (TextView)findViewById(R.id.textView23);
        RadioButton r1 = (RadioButton)findViewById(R.id.radioButton3);
        if (r1.isChecked()){
            t1.setText("Checked!");
        }
    }

}

