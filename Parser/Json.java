package com.example.aula7.tareasasincronas.Parser;

import com.example.aula7.tareasasincronas.Models.Post;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AULA 7 on 12/04/2018.
 */

public class Json {
    public  static List<Post> getDataHson(String s) throws JSONException {
        JSONArray jsonArray = new JSONArray(s);
        List<Post> postList = new ArrayList<>();

        for (int i=0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);

            Post post = new Post();
            post.setId(item.getInt("id"));
            post.setTitle(item.getString("title"));
            post.setBody(item.getString("body"));

            postList.add(post);
        }

        return  postList;
    }
}
