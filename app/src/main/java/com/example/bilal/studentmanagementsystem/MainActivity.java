package com.example.bilal.studentmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    EditText txt;
    Spinner spin;
    TextView txtvu;
    Button btn;
    String name,address;
    long phone;
    String collegename="";
    String categories[]={"Select College","DIT","Graphic Era","HNB"};
    ArrayList<Student> al = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvu=(TextView)findViewById(R.id.record);
        spin=(Spinner)findViewById(R.id.college1);
        btn=(Button)findViewById(R.id.add);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories);

        spin.setAdapter(arrayAdapter);
        spin.setOnItemSelectedListener(this);

        spin.setPrompt(categories[0]);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                txt=(EditText)findViewById(R.id.name1);
                name=txt.getText().toString();
                txt=(EditText)findViewById(R.id.phone1);
                phone=Long.parseLong(txt.getText().toString());
                txt=(EditText)findViewById(R.id.address1);
                address=txt.getText().toString();

                al.add(new Student(name, address, collegename, phone));
            }
        });
        btn=(Button)findViewById(R.id.display);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < al.size(); i++)
                {
                    txtvu.setText(txtvu.getText() +
                            "Student Name is: " + al.get(i).name + "\n");
                    txtvu.setText(txtvu.getText() +
                            "Student College is: " + al.get(i).college + "\n");
                    txtvu.setText(txtvu.getText() +
                            "Student Phone Number is: " + al.get(i).phone + "\n");
                    txtvu.setText(txtvu.getText() +
                            "Student Address is: " + al.get(i).address + "\n");
                    txtvu.setText(txtvu.getText() + "****************\n\n");
                }
            }
        });
    }
  /*  @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }*/

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        if(i==0)
            collegename="";
        else
            collegename=categories[i];

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}