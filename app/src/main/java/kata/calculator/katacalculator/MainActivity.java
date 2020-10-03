package com.example.katacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import kata.calculator.katacalculator.R;

public class MainActivity extends AppCompatActivity {

    Button go_to_table;
    EditText to_le;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to_le = (EditText) findViewById(R.id.edit_to);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.r_group);
                double step=-1.0;
                switch (radioGroup.getCheckedRadioButtonId())
                {
                    case R.id.r01:
                        step = 0.1;
                        break;
                    case R.id.r025:
                        step = 0.25;
                        break;
                    case R.id.r05:
                        step = 0.5;
                        break;
                    case R.id.r1:
                        step = 1.0;
                        break;
                    default:
                        Toast toast = Toast.makeText(MainActivity.this,"Вы не выбрали шаг",Toast.LENGTH_SHORT);
                        toast.show();
                        return;
                }

                EditText edit_to = (EditText) findViewById(R.id.edit_to);
                int to_le = edit_to.getText()==null?0:Integer.parseInt(edit_to.getText().toString());

                EditText edit_from = (EditText) findViewById(R.id.edit_from);
                int from_le = edit_from.getText()==null?0:Integer.parseInt(edit_from.getText().toString());

                if (from_le>=to_le)
                {
                    Toast toast = Toast.makeText(MainActivity.this,"Оцена <от> не может быть больше или равна оценки <до>",Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                Intent intent = new Intent(MainActivity.this, Table.class);
                intent.putExtra("from_le",from_le);
                intent.putExtra("to_le",to_le);
                intent.putExtra("step",step);
                startActivity(intent);

            }
        };
        go_to_table = (Button) findViewById(R.id.go_to_next);
        go_to_table.setOnClickListener(listener);
    }
}
