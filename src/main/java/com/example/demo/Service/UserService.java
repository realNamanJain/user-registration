package com.example.demo.Service;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"namanjain.work@gmail.com","naman jain"));
        store.add(new User(UUID.randomUUID().toString(),"goluSingh@gmail.com","Golu Singh"));
        store.add(new User(UUID.randomUUID().toString(),"luckyBoyk@gmail.com","Lucky Patel"));
        store.add(new User(UUID.randomUUID().toString(),"xtyz@gmail.com","xyz"));
    }

    public List<User> getService(){
        return this.store;
    }
}
