package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by oscar on 1/24/2018.
 */
public class SenderFCM {
    @SerializedName("notification")
    private Notification notification;

    @SerializedName("to")
    private String to;

    /**
     * Instantiates a new Sender fcm.
     *
     * @param dataFCM the data fcm
     * @param to      the to
     */
    public SenderFCM(Notification dataFCM, String to) {
        this.notification = dataFCM;
        this.to = to;
    }

    /**
     * Gets notification.
     *
     * @return the notification
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * Sets notification.
     *
     * @param notification the notification
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * Gets to.
     *
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to the to
     */
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "SenderFCM{" +
                "notification=" + notification +
                ", to='" + to + '\'' +
                '}';
    }
}
