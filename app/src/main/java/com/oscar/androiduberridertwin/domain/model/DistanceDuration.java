package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by oscar on 1/25/2018.
 */
public class DistanceDuration implements Serializable {
    @SerializedName("text")
    private String text;

    @SerializedName("value")
    private int value;

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText ()
    {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText (String text)
    {
        this.text = text;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue ()
    {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue (int value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", value = "+value+"]";
    }
}
