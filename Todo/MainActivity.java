package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String tasks[] = {"Task1", "Android Lab", "Mini Project", "Series Test 2","task 2"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.lstViewTasks);
        ArrayAdapter adaptor = new ArrayAdapter<String>(this,R.layout.activity_to_do_list,tasks);
        list.setAdapter(adaptor);
    }
}