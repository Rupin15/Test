package com.example.basiclayouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {
    private  int roundNo;
    RecyclerView recyclerView;
    List<News> newslist;
    NewsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        roundNo=5;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Context context= NewsActivity.this;
        initializedata();
        recyclerView=findViewById(R.id.RV_act_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        adapter= new NewsAdapter(newslist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initializedata() {

        newslist=new ArrayList<>();
        if(roundNo==1){
            newslist.clear();
            newslist.add(new News("News 1",1));
        }
        else if(roundNo==2){
            newslist.clear();
            newslist.add(new News("News 1",1));
            newslist.add(new News("News 2",2));
        }
        else if(roundNo==3){
            newslist.clear();

            newslist.add(new News("News 3",3));
            newslist.add(new News("News 2",2));
            newslist.add(new News("News 1",1));

        }
        else if(roundNo==4){
            newslist.clear();
            newslist.add(new News("News 4",4));
            newslist.add(new News("News 3",3));
            newslist.add(new News("News 2",2));
            newslist.add(new News("News 1",1));

        }
        else if(roundNo==5){
            newslist.clear();
            newslist.add(new News("News 5",5));
            newslist.add(new News("News 4",4));
            newslist.add(new News("News 3",3));
            newslist.add(new News("News 2",2));
            newslist.add(new News("News 1",1));

        }




    }

    private void recyclerViewNews(Context context) {

    }
}