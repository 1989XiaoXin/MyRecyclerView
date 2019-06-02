package com.example.myrecyclerview.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.myrecyclerview.DataModel;

public abstract class  TypeAbstractViewHolder extends RecyclerView.ViewHolder {
    public TypeAbstractViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public abstract void bindHolder(DataModel dataModel);
}
