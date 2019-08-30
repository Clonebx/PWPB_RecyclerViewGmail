package com.example.pwpb_recyclerviewgmail;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Content> rvContent;
    private RecyclerViewAdapter rvAdapter;

    String[] name = {"Sam", "Pinterest","Google+","Twitter","GameMaker","Josh"
    };
    String[] title = {"weekend adventure",
            "17 iPods pins you might like",
            "Top Suggested Google+ pages for you",
            "Follow T-Mobile, Samsung Mobile U",
            "How Painting Works in Chicory",
            "Going Lunch"
            };
    String[] description = {"Let's go fishing with John and others. we will do...",
            "We found some pins that we think might be right up your street.",
            "Top Suggested Google+ pages for you",
            "Sin,some people you may know",
            "Discover how to paint with code in GameMaker how painting works in Chicory",
            "Don't forget our lunch at 3PM in Pizza Hut"
            };
    String[] clock = {"11:00am","11:10pm","06:44pm","08:04pm","02:34pm","01:04am"};
    int[] img = {R.drawable.sam,
            R.drawable.pinterest,
            R.drawable.google_plus,
            R.drawable.twitter,
            R.drawable.gamemaker,
            R.drawable.josh,};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);

        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        rvContent = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            Content Content = new Content(name[i], title[i], description[i], clock[i], img[i]);
            rvContent.add(Content);
        }

        rvAdapter = new RecyclerViewAdapter(rvContent);
        recyclerView.setAdapter(rvAdapter);

    }
}
