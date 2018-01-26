package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by oscar on 1/24/2018.
 */
public class Notification {
    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    /**
     * Instantiates a new Notification.
     *
     * @param title the title
     * @param body  the body
     */
    public Notification(String title, String body) {
        this.title = title;
        this.body = body;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
