package com.drobus;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAOJooqImpl implements UserDAO{

    @Autowired
    private DSLContext dsl;

    public User get(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void create(User user) {
        // TODO Auto-generated method stub
        
    }

    public void update(User user) {
        // TODO Auto-generated method stub
        
    }

    public void delete(User user) {
        // TODO Auto-generated method stub
        
    }

}
