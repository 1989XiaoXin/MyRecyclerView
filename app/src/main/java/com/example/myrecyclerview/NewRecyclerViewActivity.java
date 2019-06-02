package com.example.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myrecyclerview.Adapter.FirstAdapter;

import java.util.ArrayList;
import java.util.List;

public class NewRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private FirstAdapter mAdapter;
    int colors[] = {R.color.colorAccent,
            R.color.colorBlue,
            R.color.colorPrimary};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_recycler_view);
        mRecyclerView = findViewById(R.id.newRecyclerView);
        mAdapter = new FirstAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager manager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(manager);

        initData();
    }

    private void initData() {
        List<DataModel> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int type = (int) (Math.random() * 3 + 1);
            DataModel data = new DataModel();
            data.type = type;
            data.avatarColor = colors[type - 1];
            data.name = "the name is" + i;
            data.content = "the content is" + i;
            data.contentColor = colors[(type + 1) % 3];
            list.add(data);

        }
        mAdapter.addList(list);
        mAdapter.notifyDataSetChanged();

    }
}
