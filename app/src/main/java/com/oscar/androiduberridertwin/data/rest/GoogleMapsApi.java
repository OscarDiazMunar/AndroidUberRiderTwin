package com.oscar.androiduberridertwin.data.rest;

import com.oscar.androiduberridertwin.domain.model.RequestGoogleApi;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by oscar on 11/16/2017.
 */
public interface GoogleMapsApi {
    /**
     * Gets path.
     *
     * @param mode        the mode
     * @param transit     the transit
     * @param origin      the origin
     * @param destination the destination
     * @param key         the key
     * @return the path
     */
    @GET("maps/api/directions/json")
    Observable<RequestGoogleApi> getPath(@Query("mode") String mode,
                                         @Query("transit_routing_preference") String transit,
                                         @Query("origin") String origin,
                                         @Query("destination") String destination,
                                         @Query("key") String key);
}
