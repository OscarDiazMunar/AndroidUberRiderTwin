package com.oscar.androiduberridertwin.presentation.presenter.MainActivityPresenter;


/**
 * Created by oscar on 11/10/2017.
 */
public interface IMainActivityPresenter {
    /**
     * On create.
     */
    void onCreate();

    /**
     * Show register dialog.
     */
    void showRegisterDialog();

    /**
     * Show login dialog.
     */
    void showLoginDialog();

    /**
     * Show forgot dialog.
     */
    void showForgotDialog();
}
