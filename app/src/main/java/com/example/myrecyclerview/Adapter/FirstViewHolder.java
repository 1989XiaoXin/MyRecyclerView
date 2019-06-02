package com.example.myrecyclerview.Adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myrecyclerview.DataModel;
import com.example.myrecyclerview.R;

public class FirstViewHolder extends TypeAbstractViewHolder {
    public ImageView avatar;
    public TextView name;

    public FirstViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.img_item);
        name = itemView.findViewById(R.id.tv_name);
    }
    @Override
    public void bindHolder(DataModel dataModel){
        avatar.setBackgroundResource(dataModel.avatarColor);
        name.setText(dataModel.name);
    }
}
