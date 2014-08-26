package com.drobus;

public interface UserDAO {
    
    public User get(int id);
    
    public void create(User user);
    
    public void update(User user); 
    
    public void delete(User user);
    
}
