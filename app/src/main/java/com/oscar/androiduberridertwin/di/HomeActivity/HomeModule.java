package com.oscar.androiduberridertwin.di.HomeActivity;

import com.oscar.androiduberridertwin.data.rest.FCMClient;
import com.oscar.androiduberridertwin.domain.usecase.SendFCMNotification;
import com.oscar.androiduberridertwin.presentation.presenter.HomeActivityPresenter.HomeActivityPresenter;
import com.oscar.androiduberridertwin.presentation.ui.HomeActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by oscar on 1/24/2018.
 */
@Module
public class HomeModule {
    /**
     * Provide send fcm notification send fcm notification.
     *
     * @return the send fcm notification
     */
    @Provides
    public SendFCMNotification provideSendFCMNotification(){
        return new SendFCMNotification(FCMClient.getInstance());
    }

    /**
     * Provides home activity home activity.
     *
     * @return the home activity
     */
    @Provides
    public HomeActivity providesHomeActivity(){
        return new HomeActivity();
    }

    /**
     * Provides home activity presenter home activity presenter.
     *
     * @param homeActivity        the home activity
     * @param sendFCMNotification the send fcm notification
     * @return the home activity presenter
     */
    @Provides
    public HomeActivityPresenter providesHomeActivityPresenter(HomeActivity homeActivity, SendFCMNotification sendFCMNotification){
        return new HomeActivityPresenter(homeActivity, sendFCMNotification);
    }
}
