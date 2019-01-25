package com.kaisar.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {
    private Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,div,mul,add,sub,dot,eq,clear;
    TextView in;
    TextView out;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0=(Button)findViewById(R.id.bt0);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);
        div=(Button)findViewById(R.id.div);
        mul=(Button)findViewById(R.id.mul);
        sub=(Button)findViewById(R.id.sub);
        add=(Button)findViewById(R.id.add);
        dot=(Button)findViewById(R.id.dot);
        eq=(Button)findViewById(R.id.eq);
        clear=(Button)findViewById(R.id.clear);
        out=(TextView)findViewById(R.id.text1);
        in=(TextView) findViewById(R.id.text2);
        clearScreen();
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             clearScreen();
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String expression = in.getText().toString();
                Expression e= new Expression(expression);
                String result=String.valueOf(e.calculate());
                out.setText(result);
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression(".");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("* ");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
            }
        });

    }
    void writeExpression(String value){
        String expression = in.getText().toString();
        expression = expression + value;

        in.setText(expression);
    }
    public void clearScreen()
    {
        in.setText("");
        out.setText("0");
    }

}
