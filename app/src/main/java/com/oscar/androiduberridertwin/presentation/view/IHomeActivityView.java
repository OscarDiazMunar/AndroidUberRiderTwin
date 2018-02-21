package com.oscar.androiduberridertwin.presentation.view;

import com.google.android.gms.maps.model.LatLng;
import com.oscar.androiduberridertwin.presentation.presenter.Presenter;

/**
 * Created by oscar on 12/5/2017.
 */
public interface IHomeActivityView extends Presenter.PView {
    /**
     * Show toast.
     *
     * @param message the message
     */
    void showToast(String message);

    /**
     * Load all available driver.
     *
     * @param location the location
     */
    void loadAllAvailableDriver(LatLng location);

}
