package com.drobus;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ArticleDAOJooqImplIT {
    
    @Autowired
    ArticleDAO articleDAO;
    
    @Test
    public void get(){
        Article art = articleDAO.get(1);
        assertNotNull(art);
        assertEquals(art.getName(), "ARTICLE1");
        assertEquals(art.getText(), "ARTICLE1 TEXT");
    }
    
    @Test
    public void create(){
        Article art = new Article();
        art.setId(4);
        art.setName("ARTICLE4");
        art.setText("ARTICLE4 TEXT");
        
        articleDAO.update(art);
        
        art = articleDAO.get(4);
        
        assertNotNull(art);
        assertEquals(art.getName(), "ARTICLE4");
        assertEquals(art.getText(), "ARTICLE4 TEXT");
    }
    
    @Test
    public void update(){
        Article art = new Article();
        art.setId(2);
        art.setName("ARTICLE2 UP");
        art.setText("ARTICLE2 TEXT UP");
        
        articleDAO.update(art);
        
        art = articleDAO.get(2);
        
        assertNotNull(art);
        assertEquals(art.getName(), "ARTICLE2 UP");
        assertEquals(art.getText(), "ARTICLE2 TEXT UP");
    }
    
    @Test
    public void delete(){
        Article art = new Article();
        art.setId(3);
        
        articleDAO.delete(art);
        
        art = articleDAO.get(3);
        
        assertNull(art);
    }
    

}
