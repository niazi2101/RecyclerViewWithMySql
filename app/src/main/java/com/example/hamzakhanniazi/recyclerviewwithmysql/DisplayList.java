package com.example.hamzakhanniazi.recyclerviewwithmysql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.atomic.AtomicReference;

public class DisplayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_list);

        BackgroundTask backgroundTask= new BackgroundTask();
        backgroundTask.execute();
    }
}
