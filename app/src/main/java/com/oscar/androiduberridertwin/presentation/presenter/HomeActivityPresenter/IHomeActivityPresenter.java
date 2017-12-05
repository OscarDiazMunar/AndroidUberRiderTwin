package com.oscar.androiduberridertwin.presentation.presenter.HomeActivityPresenter;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by oscar on 12/5/2017.
 */
public interface IHomeActivityPresenter {
    /**
     * Gets direction.
     *
     * @param destination     the destination
     * @param currentPosition the current position
     */
    void getDirection(String destination, LatLng currentPosition);
}
