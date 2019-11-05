package com.example.mvpdemo.Root;

import com.example.mvpdemo.Activity.LoginModule;
import com.example.mvpdemo.Activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {

    void inject(MainActivity target);

}