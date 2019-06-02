package com.example.myrecyclerview.Adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.myrecyclerview.Adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class StaggeredAdapter extends MyAdapter {

    private List<Integer> mHeights;

    public StaggeredAdapter(Context context, List<String> datas) {
        super(context , datas);

        mHeights = new ArrayList<Integer>();
        for(int i=0;i<mDatas.size();i++){
            mHeights.add((int)(100+Math.random()*300));
        }
    }


    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int position) {
        ViewGroup.LayoutParams lp = viewHolder.textView.getLayoutParams();
        lp.height = mHeights.get(position);
        viewHolder.itemView.setLayoutParams(lp);
        viewHolder.textView.setText(mDatas.get(position));

//        setUpItemEvent(viewHolder);
//
    }


}
