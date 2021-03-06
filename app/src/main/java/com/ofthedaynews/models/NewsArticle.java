/**
 * Author: Mohammed Basel Nasrini
 * Last edited: 2020-05-21
 */
package com.ofthedaynews.models;

import java.text.ParseException;

public class NewsArticle {
    private String title, source, author, description, url, imageURL, content;
    private String publishedAt;

    public NewsArticle(String title, String source, String author, String description, String url, String imageURL, String publishedAt, String content) throws ParseException {
        this.title = title;
        this.source = source;
        this.author = author;
        this.description = description;
        this.url = url;
        this.imageURL = imageURL;
        this.publishedAt = publishedAt;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public String getSource() {
        return source;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String url){
        this.imageURL = url;
    }

    public String getContent() {
        return content;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
}
