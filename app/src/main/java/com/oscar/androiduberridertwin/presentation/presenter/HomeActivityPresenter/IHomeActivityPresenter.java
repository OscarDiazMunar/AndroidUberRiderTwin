package com.oscar.androiduberridertwin.presentation.presenter.HomeActivityPresenter;

import com.google.android.gms.maps.model.LatLng;
import com.oscar.androiduberridertwin.domain.model.SenderFCM;

/**
 * Created by oscar on 12/5/2017.
 */
public interface IHomeActivityPresenter {
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
     * Send message notification.
     *
     * @param senderFCM the sender fcm
     */
    void sendMessageNotification(SenderFCM senderFCM);
    void systemDriverPresence();
}
