package com.oscar.androiduberridertwin.data.rest;

import com.oscar.androiduberridertwin.domain.model.ResponseFCM;
import com.oscar.androiduberridertwin.domain.model.SenderFCM;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by oscar on 1/24/2018.
 */
public interface IFCMService {
    /**
     * Send message observable.
     *
     * @param body the body
     * @return the observable
     */
    @Headers({"Content-Type:application/json",
            "Authorization:key=AAAAEFC3RFc:APA91bE-8RnbJydHymhNX8O2WK3T_6QUxVAivZAtPTtRj7-ucdUqeQ504Gm7g5kAtWZerESqvQXtnIr28ovU9GtwWZeYQpMAGkqE4D1gPMrLUa0o543x_nCJTx2ovNJHbrac0SIlt2b2"})
    @POST("fcm/send")
    Observable<ResponseFCM> sendMessage(@Body SenderFCM body);
}
