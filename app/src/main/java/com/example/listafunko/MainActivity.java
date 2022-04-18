package com.example.listafunko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private LojaAdapter adapter;
    private ArrayList<loja> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        itens = new ArrayList<loja>();
        itens.add(new loja("Gazelle","R$160,00"));
        itens.add(new loja("The Crow","R$593,00"));
        itens.add(new loja("E.T THE EXTRA-TERRESTRIAL","R$1.200,00"));
        itens.add(new loja("Mr.Bean","R$200,00"));
        itens.add(new loja("Doctor Who","R$180,00"));
        adapter = new LojaAdapter(MainActivity.this, itens);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }
}