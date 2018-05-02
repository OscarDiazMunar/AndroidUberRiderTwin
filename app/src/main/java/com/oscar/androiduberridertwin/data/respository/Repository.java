package com.oscar.androiduberridertwin.data.respository;

import com.google.android.gms.maps.model.LatLng;
import com.oscar.androiduberridertwin.domain.model.RequestGoogleApi;

import io.reactivex.Observable;

/**
 * Created by oscar on 11/16/2017.
 */
public interface Repository {
    /**
     * Gets request api.
     *
     * @param destination     the destination
     * @param currentPosition the current position
     * @return the request api
     */
    Observable<RequestGoogleApi> getRequestApi(String destination, LatLng currentPosition);
}
