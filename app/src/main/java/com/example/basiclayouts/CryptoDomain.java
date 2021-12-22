package com.example.basiclayouts;

import android.widget.ImageView;

public class CryptoDomain {

    private String cryptoName, cryptoOwned,cryptoWorth,cryptoNetWorth;
    private ImageView cryptoImage;

    public CryptoDomain(String cryptoName, String cryptoOwned, String cryptoWorth, String cryptoNetWorth) {
        this.cryptoName = cryptoName;
        this.cryptoOwned = cryptoOwned;
        this.cryptoWorth = cryptoWorth;
        this.cryptoNetWorth = cryptoNetWorth;

    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getCryptoOwned() {
        return cryptoOwned;
    }

    public void setCryptoOwned(String cryptoOwned) {
        this.cryptoOwned = cryptoOwned;
    }

    public String getCryptoWorth() {
        return cryptoWorth;
    }

    public void setCryptoWorth(String cryptoWorth) {
        this.cryptoWorth = cryptoWorth;
    }

    public String getCryptoNetWorth() {
        return cryptoNetWorth;
    }

    public void setCryptoNetWorth(String cryptoNetWorth) {
        this.cryptoNetWorth = cryptoNetWorth;
    }

    public ImageView getCryptoImage() {
        return cryptoImage;
    }

    public void setCryptoImage(ImageView cryptoImage) {
        this.cryptoImage = cryptoImage;
    }
}
