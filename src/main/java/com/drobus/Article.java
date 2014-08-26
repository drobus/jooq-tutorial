package com.drobus;

import java.util.List;

public class Article {
    
    private long id;
    private String name;
    private String text;
    List<ArticleComment> comments;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    
}
