package com.example.katacalculator;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class Table extends AppCompatActivity {

    LinearLayout j_1,j_2,j_3,j_4,j_5;
    int j_1_cl=-1,j_2_cl=-1,j_3_cl=-1,j_4_cl=-1,j_5_cl=-1;
    double j_1_r,j_2_r,j_3_r,j_4_r,j_5_r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Intent intent = getIntent();
        final int from_le = intent.getIntExtra("from_le",0);
        double step = intent.getDoubleExtra("step",0.5);
        final int to_le = intent.getIntExtra("to_le",10);


        TextView result = (TextView) findViewById(R.id.result_view);

        if (Build.VERSION.SDK_INT>=26)
        {
            result.setAutoSizeTextTypeUniformWithConfiguration(10,50,1,1);
        }



        View.OnClickListener j_1_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j_1_cl==-1)
                {
                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_1_cl = v.getId();
                } else{
                    Button batonchik = (Button) j_1.getChildAt(j_1_cl);
                    batonchik.setBackground(getDrawable(R.drawable.autobutton));

                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_1_cl = v.getId();
                }
                Button our = (Button) findViewById(v.getId());
                 j_1_r = Double.parseDouble(our.getText().toString());
            }
        };



        View.OnClickListener j_2_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j_2_cl==-1)
                {
                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_2_cl = v.getId();
                } else{

                    Button batonchik = (Button) j_2.getChildAt(j_2_cl);
                    batonchik.setBackground(getDrawable(R.drawable.autobutton));

                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_2_cl = v.getId();
                }
                Button our = (Button) findViewById(v.getId());
                j_2_r = Double.parseDouble(our.getText().toString());
            }
        };
        View.OnClickListener j_3_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j_3_cl==-1)
                {
                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_3_cl = v.getId();
                } else{

                    Button batonchik = (Button) j_3.getChildAt(j_3_cl);
                    batonchik.setBackground(getDrawable(R.drawable.autobutton));

                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_3_cl = v.getId();
                }
                Button our = (Button) findViewById(v.getId());
                j_3_r = Double.parseDouble(our.getText().toString());
            }
        };
        View.OnClickListener j_4_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j_4_cl==-1)
                {
                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_4_cl = v.getId();
                } else{

                    Button batonchik = (Button) j_4.getChildAt(j_4_cl);
                    batonchik.setBackground(getDrawable(R.drawable.autobutton));

                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_4_cl = v.getId();
                }
                Button our = (Button) findViewById(v.getId());
                j_4_r = Double.parseDouble(our.getText().toString());
            }
        };
        View.OnClickListener j_5_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j_5_cl==-1)
                {
                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_5_cl = v.getId();
                } else{

                    Button batonchik = (Button) j_5.getChildAt(j_5_cl);
                    batonchik.setBackground(getDrawable(R.drawable.autobutton));

                    v.setBackground(getDrawable(R.drawable.selectedbutton));
                    j_5_cl = v.getId();
                }
                Button our = (Button) findViewById(v.getId());
                j_5_r = Double.parseDouble(our.getText().toString());
            }
        };







        View.OnClickListener main_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.count_button:

                        double[] results = {j_1_r,j_2_r,j_3_r,j_4_r,j_5_r};
                        double min = to_le+1;
                        double max = from_le-1;
                        for(int i=0;i<results.length;i++)
                        {
                            if (results[i]<min)
                            {
                                min = results[i];
                            }
                            if (results[i]>max)
                            {
                                max = results[i];
                            }
                        }
                        double sum = j_1_r+j_2_r+j_3_r+j_4_r+j_5_r-min-max;

                        TextView res = (TextView) findViewById(R.id.result_view);
                        res.setText(String.valueOf(sum));
                        break;

                    case R.id.break_button:
                        TextView resu = (TextView) findViewById(R.id.result_view);
                        resu.setText("Результат");

                        Button bat_1 = (Button) j_1.getChildAt(j_1_cl);
                        Button bat_2 = (Button) j_2.getChildAt(j_2_cl);
                        Button bat_3 = (Button) j_3.getChildAt(j_3_cl);
                        Button bat_4 = (Button) j_4.getChildAt(j_4_cl);
                        Button bat_5 = (Button) j_5.getChildAt(j_5_cl);

                        bat_1.setBackground(getDrawable(R.drawable.autobutton));
                        bat_2.setBackground(getDrawable(R.drawable.autobutton));
                        bat_3.setBackground(getDrawable(R.drawable.autobutton));
                        bat_4.setBackground(getDrawable(R.drawable.autobutton));
                        bat_5.setBackground(getDrawable(R.drawable.autobutton));
                        break;
                }
            }
        };


        Button count = (Button) findViewById(R.id.count_button);
        Button breaker = (Button) findViewById(R.id.break_button);


        count.setOnClickListener(main_listener);
        breaker.setOnClickListener(main_listener);

        j_1 = (LinearLayout) findViewById(R.id.judge_1);
        j_2 = (LinearLayout) findViewById(R.id.judge_2);
        j_3 = (LinearLayout) findViewById(R.id.judge_3);
        j_4 = (LinearLayout) findViewById(R.id.judge_4);
        j_5 = (LinearLayout) findViewById(R.id.judge_5);

        j_1.removeAllViews();
        j_2.removeAllViews();
        j_3.removeAllViews();
        j_4.removeAllViews();
        j_5.removeAllViews();
        int counter = (int)((to_le-from_le)/step)+1;
        LinearLayout[] layoutArray = {j_1,j_2,j_3,j_4,j_5};
        for (int j=0;j<layoutArray.length;j++) {
            for (int i = 0; i < counter; i++) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                params.weight = 10;
                params.height = LinearLayout.LayoutParams.MATCH_PARENT;


                Button baton = new Button(Table.this);
                baton.setLayoutParams(params);
                if (Build.VERSION.SDK_INT>=26) {
                    baton.setAutoSizeTextTypeUniformWithConfiguration(5, 50, 1, 1);
                }
                baton.setBackground(getDrawable(R.drawable.autobutton));
                baton.setText(String.valueOf(to_le - (i * step)));
                baton.setId(i);
                switch (j)
                {
                    case 0:
                        baton.setOnClickListener(j_1_listener);
                        break;
                    case 1:
                        baton.setOnClickListener(j_2_listener);
                        break;
                    case 2:
                        baton.setOnClickListener(j_3_listener);
                        break;
                    case 3:
                        baton.setOnClickListener(j_4_listener);
                        break;
                    case 4:
                        baton.setOnClickListener(j_5_listener);
                        break;
                }
                layoutArray[j].addView(baton);
            }

        }
    }
}
