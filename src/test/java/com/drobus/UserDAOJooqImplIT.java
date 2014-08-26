package com.drobus;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class UserDAOJooqImplIT {
    
    @Autowired
    UserDAO userDAO;

    @Test
    public void get(){
        User user = userDAO.get(1);
        
        assertNotNull(user);
        assertEquals(user.getName(), "USER1");
        assertEquals(user.getFamilyName(), "FUSER1");
    }

    @Test
    public void create(){
        User user = new User();
        user.setId(4);
        user.setName("USER4");
        user.setFamilyName("FUSER4");
        
        userDAO.create(user);
        
        user = userDAO.get(4);
        
        assertNotNull(user);
        assertEquals(user.getName(), "USER4");
        assertEquals(user.getFamilyName(), "FUSER4");
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(2);
        user.setName("USER4_UP");
        user.setFamilyName("FUSER4_UP");
        
        userDAO.update(user);
        
        user = userDAO.get(2);
        
        assertNotNull(user);
        assertEquals(user.getName(), "USER4_UP");
        assertEquals(user.getFamilyName(), "FUSER4_UP");
        
    }

    @Test
    public void delete(){
        User user = new User();
        user.setId(3);
        
        userDAO.delete(user);
        
        user = userDAO.get(3);
        
        assertNull(user);
    }
}
