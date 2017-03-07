package com.zhttesting.www.mynewstwo.injector.components;

import android.content.Context;

import com.zhttesting.www.mynewstwo.injector.module.ApplicationModule;
import com.zhttesting.www.mynewstwo.module.home.MainActivity;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by zhtao on 2017/3/6.
 */
@Singleton
@Component(modules= ApplicationModule.class)
public interface ApplicationComponent {
    Context context();
    void inject(MainActivity mainActivity);
}
