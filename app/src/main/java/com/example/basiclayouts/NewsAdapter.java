package com.example.basiclayouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
private List<News> newsList;

public NewsAdapter(List<News> newsList) {
        this.newsList = newsList;
        }

@Override
public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.news_itemview,parent,false);
        return new NewsViewHolder(view);
        }
        
    @Override
public void onBindViewHolder(NewsAdapter.NewsViewHolder holder, int position) {
        int roundNo=newsList.get(position).getRoundNo();
        String headline=newsList.get(position).getHeadline();
        holder.Headline.setText(headline);
        holder.RoundNo.setText(roundNo+"");
        holder.newsImage.setImageResource(R.drawable.crypto_selector_background);
        }

@Override
public int getItemCount() {
        return newsList.size();
        }

protected class NewsViewHolder extends RecyclerView.ViewHolder {
    private TextView Headline,RoundNo ;
    private ImageView newsImage;
    public NewsViewHolder(View itemView) {
        super(itemView);
        Headline=itemView.findViewById(R.id.idTVNewsHeading);
        RoundNo=itemView.findViewById(R.id.TV_number);
        newsImage=itemView.findViewById(R.id.idIVNews);
    }
}
}