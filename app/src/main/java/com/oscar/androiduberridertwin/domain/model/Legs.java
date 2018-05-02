package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by oscar on 1/25/2018.
 */
public class Legs implements Serializable {
    @SerializedName("distance")
    private DistanceDuration distance;

    @SerializedName("duration")
    private DistanceDuration duration;

    @SerializedName("end_address")
    private String endAddress;

    @SerializedName("start_address")
    private String startAddress;



    /**
     * Gets distance.
     *
     * @return the distance
     */
    public DistanceDuration getDistance() {
        return distance;
    }

    /**
     * Sets distance.
     *
     * @param distance the distance
     */
    public void setDistance(DistanceDuration distance) {
        this.distance = distance;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public DistanceDuration getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(DistanceDuration duration) {
        this.duration = duration;
    }

    /**
     * Gets end address.
     *
     * @return the end address
     */
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * Sets end address.
     *
     * @param endAddress the end address
     */
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }
}
