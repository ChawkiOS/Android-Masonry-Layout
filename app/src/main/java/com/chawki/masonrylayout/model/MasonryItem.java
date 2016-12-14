package com.chawki.masonrylayout.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Chawki on 12/14/2016.
 */

public class MasonryItem {

    private String id;
    private String title;
    private String content;
    private String image;
    @SerializedName("pubdate")
    private String pubDate;

    public MasonryItem() {
    }

    public MasonryItem(String id, String title, String content, String image, String pubDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
        this.pubDate = pubDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
