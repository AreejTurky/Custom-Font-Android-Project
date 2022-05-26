package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



        //Here you can set up the layoutparameters from your tableview and the rowview.
        //Maybe you don't have to modify nothing from the parameters of your tableview so
        //you can dismiss it.

        TableLayout.LayoutParams tableParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT);
        TableRow.LayoutParams rowParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);

        //Here were we take the tablelayout from your xml
        TableLayout tableLayout = (TableLayout)inflater.inflate(R.id.main_table, null);

        //Like a told you before, maybe you don't need set the parameters of the tablelayout
        //so you can comment next line.
        tableLayout.setLayoutParams(tableParams);
        Context context=null;
        TableRow tableRow = new TableRow(context);
        tableRow.setLayoutParams(tableParams);

        //Here you have to create and modify the new textview.
        TextView textView = new TextView(context);
        textView.setLayoutParams(rowParams);

        tableRow.addView(textView);

        tableLayout.addView(tableRow);
    }
}