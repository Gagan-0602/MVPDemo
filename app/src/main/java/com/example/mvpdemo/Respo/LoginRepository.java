package com.example.mvpdemo.Respo;

import com.example.mvpdemo.Model.User;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}