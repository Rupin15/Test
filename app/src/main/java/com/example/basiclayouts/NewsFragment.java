package com.example.basiclayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {
    private  int roundNo;
        RecyclerView recyclerView;
        List<News> newslist;
        NewsAdapter adapter;
    public NewsFragment(int roundNo) {
        this.roundNo = roundNo;
    }

        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_news, container, false);
        initializedata();
        recyclerViewNews(view);
        return view;
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

        private void recyclerViewNews(View view) {
        recyclerView=(RecyclerView)view.findViewById(R.id.RV_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new NewsAdapter(newslist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    }