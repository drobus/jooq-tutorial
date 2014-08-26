package com.drobus;

import static com.drobus.jooq.public_.Tables.USERS;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserDAOJooqImpl implements UserDAO{

    @Autowired
    private DSLContext dsl;

    public User get(int id) {
        Result<Record> result = dsl.select()
            .from(USERS)
            .where(USERS.ID.eq(id))
            .fetch();
        
        if (result == null || result.isEmpty()) {
            return null;
        }
        
        return toUser(result.get(0));
    }


    public void create(User user) {
        dsl.insertInto(USERS)
        .set(USERS.ID, user.getId())
        .set(USERS.NAME, user.getName())
        .set(USERS.FAMILY_NAME, user.getFamilyName())
        .execute();
    }

    public void update(User user) {
        dsl.update(USERS)
        .set(USERS.NAME, user.getName())
        .set(USERS.FAMILY_NAME, user.getFamilyName())
        .where(USERS.ID.eq(user.getId()))
        .execute();
    }

    public void delete(User user) {
        dsl.delete(USERS).where(USERS.ID.eq(user.getId())).execute();
    }
    
    
    private User toUser(Record record) {
        User user = new User();
        user.setId(record.getValue(USERS.ID));
        user.setName(record.getValue(USERS.NAME));
        user.setFamilyName(record.getValue(USERS.FAMILY_NAME));
        return user;
    }


}
