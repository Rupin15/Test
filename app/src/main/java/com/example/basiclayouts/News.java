package com.example.basiclayouts;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class News {

    private String newsImage;
    private String  headline,expandableText;
    private int roundNo;

    public News(String headline, int roundNo) {
        this.headline = headline;
        this.roundNo = roundNo;
    }


    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    public int getRoundNo() {
        return roundNo;
    }

    public void setRoundNo(int roundNo) {
        this.roundNo = roundNo;
    }

    public String getHeadline() {
        return headline;
    }

    public String getExpandableText() {
        return expandableText;
    }

    public void setExpandableText(String expandableText) {
        this.expandableText = expandableText;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}
