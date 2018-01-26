package com.oscar.androiduberridertwin.di.HomeActivity;

import com.oscar.androiduberridertwin.presentation.ui.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by oscar on 1/24/2018.
 */
@Singleton
@Component(modules = HomeModule.class)
public interface HomeComponent {
    /**
     * Inject.
     *
     * @param homeActivity the home activity
     */
    void inject(HomeActivity homeActivity);
}
