package com.drobus;

public interface UserDAO {
    
    public User get(long id);
    
    public void create(User user);
    
    public void update(User user); 
    
    public void delete(User user);
    
}
