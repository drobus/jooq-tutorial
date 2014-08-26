package com.drobus;

public interface ArticleDAO {
    
    Article get(long id);
    
    void create(Article article);
    
    void update(Article article);
    
    void delete(Article article);
}
