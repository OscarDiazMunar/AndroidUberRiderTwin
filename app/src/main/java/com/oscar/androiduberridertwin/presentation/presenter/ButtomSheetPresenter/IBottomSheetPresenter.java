package com.oscar.androiduberridertwin.presentation.presenter.ButtomSheetPresenter;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by oscar on 2/27/2018.
 */
public interface IBottomSheetPresenter {
    /**
     * On create.
     */
    void onCreate();

    /**
     * Gets direction.
     *
     * @param destination     the destination
     * @param currentPosition the current position
     */
    void getDirection(String destination, LatLng currentPosition);

    /**
     * Sets on tap map.
     */
    void setOnTapMap(boolean isTaped);
}
