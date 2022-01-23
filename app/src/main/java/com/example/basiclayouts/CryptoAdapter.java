package com.example.basiclayouts;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoAdapter.ViewHolder> {
    ArrayList<CryptoDomain> CryptoDomains;

    public CryptoAdapter(ArrayList<CryptoDomain> CryptoDomains) {
        this.CryptoDomains = CryptoDomains;
    }

    @Override
    public CryptoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflater= LayoutInflater.from(parent.getContext()).inflate(R.layout.crypto_layout,parent,false);
        return new CryptoAdapter.ViewHolder(inflater);
    }

    @Override
    public void onBindViewHolder(CryptoAdapter.ViewHolder holder, int position) {
        holder.cryptoName.setText(CryptoDomains.get(position).getCryptoName());
        holder.cryptoNetWorth.setText(CryptoDomains.get(position).getCryptoNetWorth());
        holder.cryptoOwned.setText(CryptoDomains.get(position).getCryptoOwned());
        holder.cryptoWorth.setText(CryptoDomains.get(position).getCryptoWorth());
//        int temp=position;
//        switch (temp){
//            case 0: holder.CV_cryptoName.setBackgroundResource(R.drawable.itemview_stock);
//                break;
//            case 1: holder.CV_cryptoName.setBackgroundResource(R.drawable.itemview_stock1);
//                break;
//            case 2: holder.CV_cryptoName.setBackgroundResource(R.drawable.itemview_stock2);
//                break;
//            case 3: holder.CV_cryptoName.setBackgroundResource(R.drawable.itemview_stock3);
//                break;
//            case 4: holder.CV_cryptoName.setBackgroundResource(R.drawable.itemview_stock4);
//                break;
//
//        }

        AnimationDrawable animationDrawable=(AnimationDrawable) holder.constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    @Override
    public int getItemCount() {
        return CryptoDomains.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder{
        TextView cryptoName, cryptoOwned,cryptoWorth,cryptoNetWorth;
         ConstraintLayout constraintLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            cryptoName=itemView.findViewById(R.id.TV_crypto_name);
            cryptoOwned=itemView.findViewById(R.id.TV_crypto_number);
            cryptoWorth=itemView.findViewById(R.id.TV_crypto_worth_number);
            cryptoNetWorth=itemView.findViewById(R.id.TV_crypto_worth_number2);
            constraintLayout=itemView.findViewById(R.id.CV_cryptoItem);
        }
    }
}
