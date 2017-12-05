package com.oscar.androiduberridertwin.di.MainActivity;

import android.content.Context;

import com.oscar.androiduberridertwin.presentation.presenter.MainActivityPresenter.MainActivityPresenter;
import com.oscar.androiduberridertwin.presentation.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by oscar on 11/21/2017.
 */
@Module
public class MainModule {

    private final Context context;

    /**
     * Instantiates a new Main module.
     *
     * @param context the context
     */
    public MainModule(Context context) {
        this.context = context;
    }

    /**
     * Get context context.
     *
     * @return the context
     */
    @Provides
    public Context getContext(){
        return context;
    }

    /**
     * Provides main activity main activity.
     *
     * @return the main activity
     */
    @Provides
    public MainActivity providesMainActivity(){
        return new MainActivity();
    }

    /**
     * Provides main activity presenter main activity presenter.
     *
     * @param mainActivity the main activity
     * @param context      the context
     * @return the main activity presenter
     */
    @Provides
    public MainActivityPresenter providesMainActivityPresenter(MainActivity mainActivity, Context context){
        return new MainActivityPresenter(mainActivity, context);
    }
}
