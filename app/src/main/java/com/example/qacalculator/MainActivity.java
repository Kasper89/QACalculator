package com.example.qacalculator;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Boolean is_res = false;
    Double first = 0.0;
    Double two = 0.0;
    String type ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        TextView tv = (TextView)findViewById(R.id.res_text);
        Button btnAC = (Button)findViewById(R.id.btclean);
        Button btn1 = (Button)findViewById(R.id.bt1);
        Button btn2 = (Button)findViewById(R.id.bt2);
        Button btn3 = (Button)findViewById(R.id.bt3);
        Button btnumnoz = (Button)findViewById(R.id.btumnoz);
        Button btn4 = (Button)findViewById(R.id.bt4);
        Button btn5 = (Button)findViewById(R.id.bt5);
        Button btn6 = (Button)findViewById(R.id.bt6);
        Button btndel = (Button)findViewById(R.id.btdel);
        Button btn7 = (Button)findViewById(R.id.bt7);
        Button btn8 = (Button)findViewById(R.id.bt8);
        Button btn9 = (Button)findViewById(R.id.bt9);
        Button btnsumm = (Button)findViewById(R.id.btsumm);
        Button btndot = (Button)findViewById(R.id.btdot);
        Button btn0 = (Button)findViewById(R.id.bt0);
        Button btnresult = (Button)findViewById(R.id.btresult);
        Button btnminus = (Button)findViewById(R.id.btminus);
        btnAC.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                tv.setText("");
            }
        });
        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn1.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn1.getText().toString();
                }
                tv.setText(st);
            }
        });
        btn2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn2.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn2.getText().toString();
                }
                tv.setText(st);
            }
        });
        btn3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn3.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn3.getText().toString();
                }
                tv.setText(st);
            }
        });
        btnumnoz.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (!tv.getText().toString().equals(""))
                {
                    first=Double.valueOf(tv.getText().toString());
                    st = tv.getText().toString()+"\n"+btnumnoz.getText().toString()+"\n";
                    tv.setText(st);
                    type = btnumnoz.getText().toString();
                }
            }
        });
        btn4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn4.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn4.getText().toString();
                }
                tv.setText(st);
            }
        });
        btn5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn5.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn5.getText().toString();
                }
                tv.setText(st);
            }
        });
        btn6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn6.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn6.getText().toString();
                }
                tv.setText(st);
            }
        });
        btndel.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (!tv.getText().toString().equals(""))
                {
                    first=Double.valueOf(tv.getText().toString());
                    st = tv.getText().toString()+"\n"+btndel.getText().toString()+"\n";
                    tv.setText(st);
                    type = btndel.getText().toString();
                }
            }
        });
        btn7.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                /*String st;
                if (is_res)
                {
                    st =btn7.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn7.getText().toString();
                }
                tv.setText(st);*/
            }
        });
        btn8.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn8.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn8.getText().toString();
                }
                tv.setText(st);
            }
        });
        btn9.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn9.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn9.getText().toString();
                }
                tv.setText(st);
            }
        });
        btnsumm.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (!tv.getText().toString().equals(""))
                {
                    first=Double.valueOf(tv.getText().toString());
                    st = tv.getText().toString()+"\n"+btnsumm.getText().toString()+"\n";
                    tv.setText(st);
                    type = btnsumm.getText().toString();
                }
            }
        });
        btndot.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btndot.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btndot.getText().toString();
                }
                tv.setText(st);
            }
        });
        btn0.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (is_res)
                {
                    st =btn0.getText().toString();
                    is_res = false;
                }
                else {
                    st =tv.getText().toString()+btn0.getText().toString();
                }
                tv.setText(st);
            }
        });
        btnresult.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st =tv.getText().toString().split("\n")[2];
                two=Double.valueOf(st);
                Double res=0.0;
                switch (type) {
                    case ("*"):
                        res = first*two;
                        break;
                    case ("/"):
                        res = first/two;
                        break;
                    case ("+"):
                        res = first+two;
                        break;
                    case ("-"):
                        res = first-two;
                        break;
                    default:
                        break;
                }
                if (res % 1 == 0) {
                    long ires = Math.round(res);
                    if (ires==777){
                        String mes = "Пасхалка)))";
                        String stres = tv.getText().toString()+"\n= "+ires+"\n"+mes;
                        //stres = stres+type;
                        tv.setText(stres);
                        is_res = true;
                        type = "";
                        new Thread(() -> to_error(mes)).start();
                    }
                    else {
                        String stres = tv.getText().toString()+"\n= "+ires;
                        //stres = stres+type;
                        tv.setText(stres);
                        is_res = true;
                        type = "";
                    }
                }
                else {
                    String stres = tv.getText().toString()+"\n= "+res;
                    //stres = stres+type;
                    tv.setText(stres);
                    is_res = true;
                    type = "";
                }
            }
        });
        btnminus.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                String st;
                if (!tv.getText().toString().equals(""))
                {
                    first=Double.valueOf(tv.getText().toString());
                    st = tv.getText().toString()+"\n"+btnminus.getText().toString()+"\n";
                    tv.setText(st);
                    type = btnminus.getText().toString();
                }
            }
        });
    }
    protected void to_error(String mess){
        try {
            String mes = "Пасхалка)))";
            Thread.sleep(5000);
            throw new Exception(mes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}