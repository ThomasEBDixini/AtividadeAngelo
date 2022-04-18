package com.example.listafunko;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class LojaViewHolder extends RecyclerView.ViewHolder {

    TextView nome, aplicativo;

    public LojaViewHolder(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.nome);
        aplicativo = itemView.findViewById(R.id.aplicativo);
    }
}
