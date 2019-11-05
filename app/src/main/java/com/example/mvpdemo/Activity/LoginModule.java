package com.example.mvpdemo.Activity;

import com.example.mvpdemo.Model.LoginModel;
import com.example.mvpdemo.Respo.LoginRepository;
import com.example.mvpdemo.Respo.UserRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new UserRepository();
    }
}