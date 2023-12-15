package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.Button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText f=(EditText) findViewById(R.id.fetch);
                TextView result=(TextView) findViewById(R.id.put);
                TextView result1=(TextView) findViewById(R.id.Second);
                TextView Add=(TextView) findViewById(R.id.Addition);
                TextView Subs=(TextView) findViewById(R.id.Subb);
                TextView Mul=(TextView) findViewById(R.id.multip);


                int range =Integer.parseInt(f.getText().toString());
                Random r=new Random();
                int rand_no=r.nextInt(range - 0)+ 0;
                result.setText(rand_no+" ");
                int range1 =Integer.parseInt(f.getText().toString());
                Random r1=new Random();
                int rand_no1=r1.nextInt(range - 0)+ 0;
                result1.setText(rand_no1+" ");
                String Ad=String.valueOf(rand_no + rand_no1);
                ((TextView)Add).setText(String.valueOf(Ad));
                String su=String.valueOf(rand_no - rand_no1);
                ((TextView)Subs).setText(String.valueOf(su));
                String Muli=String.valueOf(rand_no * rand_no1);
                ((TextView)Mul).setText(String.valueOf(Muli));



            }
        });
    }
}