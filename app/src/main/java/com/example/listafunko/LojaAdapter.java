package com.example.listafunko;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LojaAdapter extends RecyclerView.Adapter<LojaViewHolder> {

    private Context context;
    private ArrayList<loja> itens;

    public LojaAdapter(Context context, ArrayList<loja> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public LojaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.loja_linha, parent, false);
        LojaViewHolder viewHolder = new LojaViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LojaViewHolder lojaViewHolder, int position) {
        loja loja = itens.get(position);
        lojaViewHolder.nome.setText(loja.getNome());
        lojaViewHolder.aplicativo.setText(loja.getAplicativo());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
