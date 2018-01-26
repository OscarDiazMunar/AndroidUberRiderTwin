package com.oscar.androiduberridertwin.data.respository;

import com.oscar.androiduberridertwin.domain.model.ResponseFCM;
import com.oscar.androiduberridertwin.domain.model.SenderFCM;

import io.reactivex.Observable;

/**
 * Created by oscar on 1/24/2018.
 */
public interface RepositoryFCMNotification {
    /**
     * Send fcm notification driver observable.
     *
     * @param senderFCM the sender fcm
     * @return the observable
     */
    Observable<ResponseFCM> sendFCMNotificationDriver(SenderFCM senderFCM);
}
