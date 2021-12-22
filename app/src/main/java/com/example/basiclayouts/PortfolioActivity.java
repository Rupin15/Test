package com.example.basiclayouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class PortfolioActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter_stock,adapter_crypto;
    private RecyclerView recyclerViewStockList,recyclerViewCurrencyList;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        recyclerViewStock();
         recyclerViewCurrency();
    }

    private void recyclerViewStock() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerViewStockList=findViewById(R.id.RV_stock);
        recyclerViewStockList.setLayoutManager(linearLayoutManager);
        ArrayList<StocksDomain> stocksDomainArrayList=new ArrayList<>();
        stocksDomainArrayList.add(new StocksDomain("Tata","10","100 ","1000"));
        stocksDomainArrayList.add(new StocksDomain("Birla","10","100 ","1000" ));
        stocksDomainArrayList.add(new StocksDomain("ABCD","10","100 ","1000" ));
        stocksDomainArrayList.add(new StocksDomain("Rupin","10","100 ","1000" ));
        stocksDomainArrayList.add(new StocksDomain("ABCD","10","100 ","1000" ));
        adapter_stock=new StocksAdapter(stocksDomainArrayList);
        recyclerViewStockList.setAdapter(adapter_stock);
    }

    private void recyclerViewCurrency() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCurrencyList=findViewById(R.id.RV_wallet);
        recyclerViewCurrencyList.setLayoutManager(linearLayoutManager);
        ArrayList<CryptoDomain> cryptoDomainArrayList=new ArrayList<>();
        cryptoDomainArrayList.add(new CryptoDomain("Bitcoin","10","100 ","1000"));
        cryptoDomainArrayList.add(new CryptoDomain("DogeCoin","10","100 ","1000" ));
        cryptoDomainArrayList.add(new CryptoDomain("Ether","10","100 ","1000" ));
        adapter_crypto=new CryptoAdapter(cryptoDomainArrayList);
        recyclerViewCurrencyList.setAdapter(adapter_crypto);

    }
}