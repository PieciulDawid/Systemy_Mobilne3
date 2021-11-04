package com.example.ps_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task2 extends AppCompatActivity {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task2(){
        id = UUID.randomUUID();
        date = new Date();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
    }
}