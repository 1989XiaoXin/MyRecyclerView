package com.example.myrecyclerview;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SisterApi {
    private static final String BASE_URL = "http://gank.io/api/data/福利/";

    public ArrayList<Sister> fetchSister(int count, int page) {
        String fetchUrl = BASE_URL + count + "/" + page;
        ArrayList<Sister> sisters = new ArrayList<>();
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().
                    url(fetchUrl).build();
            Response response = client.newCall(request).execute();
            String responseData = response.body().string();
            parseSister(responseData);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //Log.d(String.valueOf(123),""+sisters);
        return sisters;
    }

    public ArrayList<Sister> parseSister(String content) throws Exception {
        ArrayList<Sister> sisters = new ArrayList<>();
        Gson gson = new Gson();
        List<Sister> sisterList = gson.fromJson(content, new TypeToken<List<Sister>>(){}.getType());
        //Sister sister = gson.fromJson(content,Sister.class);
        for (Sister sister: sisterList){
            Log.d("123","id:"+sister.get_id());
            Log.d("123","id:"+sister.getUrl());
        }
        return sisters;
    }


}


