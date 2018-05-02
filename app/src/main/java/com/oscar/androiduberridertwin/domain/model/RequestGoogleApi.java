package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by oscar on 11/16/2017.
 */
public class RequestGoogleApi implements Serializable{
    @SerializedName("routes")
    private List<Routes> routes;

    @SerializedName("status")
    private String status;

    /**
     * Gets routes.
     *
     * @return the routes
     */
    public List<Routes> getRoutes() {
        return routes;
    }

    /**
     * Sets routes.
     *
     * @param routes the routes
     */
    public void setRoutes(List<Routes> routes) {
        this.routes = routes;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RequestGoogleApi{" +
                "routes=" + routes +
                ", status='" + status + '\'' +
                '}';
    }
}
