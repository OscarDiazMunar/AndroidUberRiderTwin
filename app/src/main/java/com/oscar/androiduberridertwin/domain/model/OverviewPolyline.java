package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by oscar on 11/16/2017.
 */
public class OverviewPolyline implements Serializable {
    @SerializedName("points")
    private String points;

    /**
     * Gets points.
     *
     * @return the points
     */
    public String getPoints ()
    {
        return points;
    }

    /**
     * Sets points.
     *
     * @param points the points
     */
    public void setPoints (String points)
    {
        this.points = points;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [points = "+points+"]";
    }
}
