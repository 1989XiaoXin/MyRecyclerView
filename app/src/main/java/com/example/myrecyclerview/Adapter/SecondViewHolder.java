package com.example.myrecyclerview.Adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myrecyclerview.DataModel;
import com.example.myrecyclerview.R;

public class SecondViewHolder extends TypeAbstractViewHolder {
    public ImageView avatar;
    public TextView name;
    public TextView content;

    public SecondViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.img_item);
        name = itemView.findViewById(R.id.tv_name);
        content = itemView.findViewById(R.id.tv_content);
    }
    @Override
    public void bindHolder(DataModel dataModel){
        avatar.setBackgroundResource(dataModel.avatarColor);
        name.setText(dataModel.name);
        content.setText(dataModel.content);
    }
}
