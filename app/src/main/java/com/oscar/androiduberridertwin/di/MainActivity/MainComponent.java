package com.oscar.androiduberridertwin.di.MainActivity;

import com.oscar.androiduberridertwin.presentation.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by oscar on 11/21/2017.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    /**
     * Inject.
     *
     * @param mainActivity the main activity
     */
    void inject(MainActivity mainActivity);
}
