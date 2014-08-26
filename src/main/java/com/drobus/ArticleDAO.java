package com.drobus;

public interface ArticleDAO {
    
    Article get(int id);
    
    void create(Article article);
    
    void update(Article article);
    
    void delete(Article article);
}
