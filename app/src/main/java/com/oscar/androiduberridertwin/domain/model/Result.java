package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by oscar on 1/24/2018.
 */
public class Result {
    @SerializedName("message_id")
    private String messageId;

    /**
     * Gets message id.
     *
     * @return the message id
     */
    public String getMessageId ()
    {
        return messageId;
    }

    /**
     * Sets message id.
     *
     * @param messageId the message id
     */
    public void setMessageId (String messageId)
    {
        this.messageId = messageId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message_id = "+messageId+"]";
    }
}
