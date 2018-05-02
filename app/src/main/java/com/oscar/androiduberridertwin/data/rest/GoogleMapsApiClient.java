package com.oscar.androiduberridertwin.data.rest;


import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.oscar.androiduberridertwin.data.respository.Repository;
import com.oscar.androiduberridertwin.domain.model.RequestGoogleApi;
import com.oscar.androiduberridertwin.utils.Constants;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by oscar on 11/16/2017.
 */
public class GoogleMapsApiClient implements Repository{
    private static GoogleMapsApiClient instance;
    private GoogleMapsApi services;

    /**
     * Instantiates a new Google maps api client.
     */
    @Inject
    public GoogleMapsApiClient() {
        final Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.UrlServices.BASE_URL_API)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        services = retrofit.create(GoogleMapsApi.class);
    }

    /**
     * Get instance google maps api client.
     *
     * @return the google maps api client
     */
    public static GoogleMapsApiClient getInstance(){
        if (instance == null){
            instance = new GoogleMapsApiClient();
        }
        return instance;
    }


    @Override
    public Observable<RequestGoogleApi> getRequestApi(String destination, LatLng currentPosition) {
        String origin = Double.toString(currentPosition.latitude) + "," + Double.toString(currentPosition.longitude);
        Log.e("ORIGIN", origin);
        Log.e("DESTINY", destination);

        return services.getPath("driving", "less_driving", origin, destination, "");
    }
}
