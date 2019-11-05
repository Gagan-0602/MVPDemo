package com.example.mvpdemo.Model;

import com.example.mvpdemo.Activity.LoginActivityMVP;
import com.example.mvpdemo.Respo.LoginRepository;

public class LoginModel implements LoginActivityMVP.Model {


    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String lastName) {


        repository.saveUser(new User(name, lastName));


    }

    @Override
    public User getUser() {

        return repository.getUser();
    }
}