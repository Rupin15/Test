package com.example.basiclayouts;

import android.widget.ImageView;

public class StocksDomain {
   private String stockName, stockOwned,stockWorth,stockNetWorth;
   private ImageView stockImage;

   public StocksDomain(String stockName, String stockOwned, String stockWorth, String stockNetWorth) {
      this.stockName = stockName;
      this.stockOwned = stockOwned;
      this.stockWorth = stockWorth;
      this.stockNetWorth = stockNetWorth;

   }

   public String getStockName() {
      return stockName;
   }

   public void setStockName(String stockName) {
      this.stockName = stockName;
   }

   public String getStockOwned() {
      return stockOwned;
   }

   public void setStockOwned(String stockOwned) {
      this.stockOwned = stockOwned;
   }

   public String getStockWorth() {
      return stockWorth;
   }

   public void setStockWorth(String stockWorth) {
      this.stockWorth = stockWorth;
   }

   public String getStockNetWorth() {
      return stockNetWorth;
   }

   public void setStockNetWorth(String stockNetWorth) {
      this.stockNetWorth = stockNetWorth;
   }

   public ImageView getStockImage() {
      return stockImage;
   }

   public void setStockImage(ImageView stockImage) {
      this.stockImage = stockImage;
   }
}
