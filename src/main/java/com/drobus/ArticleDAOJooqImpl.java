package com.drobus;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleDAOJooqImpl implements ArticleDAO {

    @Autowired
    private DSLContext dsl;
    
    
    public Article get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void create(Article article) {
        // TODO Auto-generated method stub
        
    }

    public void update(Article article) {
        // TODO Auto-generated method stub
        
    }

    public void delete(Article article) {
        // TODO Auto-generated method stub
        
    }

}
