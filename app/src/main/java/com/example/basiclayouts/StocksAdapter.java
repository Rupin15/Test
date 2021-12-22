package com.example.basiclayouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StocksAdapter extends RecyclerView.Adapter<StocksAdapter.ViewHolder>{
 ArrayList<StocksDomain> stocksDomains;

    public StocksAdapter(ArrayList<StocksDomain> stocksDomains) {
        this.stocksDomains = stocksDomains;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflater= LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_item_view,parent,false);
        return new ViewHolder(inflater);
    }

    @Override
    public void onBindViewHolder(StocksAdapter.ViewHolder holder, int position) {
        holder.stockName.setText(stocksDomains.get(position).getStockName());
        holder.stockNetWorth.setText(stocksDomains.get(position).getStockNetWorth());
        holder.stockOwned.setText(stocksDomains.get(position).getStockOwned());
        holder.stockWorth.setText(stocksDomains.get(position).getStockWorth());
//        int temp=position;
//        switch (temp){
//            case 0: holder.CV_stockItem.setBackgroundResource(R.drawable.itemview_stock);
//                    break;
//            case 1: holder.CV_stockItem.setBackgroundResource(R.drawable.itemview_stock1);
//                break;
//            case 2: holder.CV_stockItem.setBackgroundResource(R.drawable.itemview_stock2);
//                break;
//            case 3: holder.CV_stockItem.setBackgroundResource(R.drawable.itemview_stock3);
//                break;
//            case 4: holder.CV_stockItem.setBackgroundResource(R.drawable.itemview_stock4);
//                break;
//
//        }


    }

    @Override
    public int getItemCount() {
        return stocksDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView stockName, stockOwned,stockWorth,stockNetWorth;
        ConstraintLayout CV_stockItem;
        public ViewHolder(View itemView) {
            super(itemView);
            stockName=itemView.findViewById(R.id.TV_stock_name);
            stockOwned=itemView.findViewById(R.id.TV_holding);
            stockNetWorth= itemView.findViewById(R.id.TV_total);
            stockWorth=itemView.findViewById(R.id.TV_Rs);
            CV_stockItem=itemView.findViewById(R.id.CV_stockItem);
        }}
}
