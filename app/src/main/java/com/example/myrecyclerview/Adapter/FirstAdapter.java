package com.example.myrecyclerview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.myrecyclerview.DataModel;
import com.example.myrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class FirstAdapter extends RecyclerView.Adapter {
    private LayoutInflater mInflater ;
    private List<DataModel> mList = new ArrayList<>();

    public FirstAdapter(Context context){
        mInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i){
            case DataModel.TYPE_ONE:
                return new FirstViewHolder(mInflater.inflate(R.layout.item_new_one,
                        viewGroup,false));
            case DataModel.TYPE_TWO:
                return new SecondViewHolder(mInflater.inflate(R.layout.item_new_two,
                        viewGroup,false));
            case DataModel.TYPE_THREE:
                return new ThirdViewHolder(mInflater.inflate(R.layout.item_new_three,
                        viewGroup,false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((TypeAbstractViewHolder)viewHolder).bindHolder(mList.get(i));

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void addList(List<DataModel> list){
        mList.addAll(list);
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).type;
    }
}
