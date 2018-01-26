package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by oscar on 1/24/2018.
 */
public class ResponseFCM {
    @SerializedName("failure")
    private int failure;

    @SerializedName("results")
    private List<Result> results;

    @SerializedName("success")
    private int success;

    @SerializedName("multicast_id")
    private long multicastId;

    @SerializedName("canonical_ids")
    private int canonicalIds;

    /**
     * Gets failure.
     *
     * @return the failure
     */
    public int getFailure ()
    {
        return failure;
    }

    /**
     * Sets failure.
     *
     * @param failure the failure
     */
    public void setFailure (int failure)
    {
        this.failure = failure;
    }

    /**
     * Gets results.
     *
     * @return the results
     */
    public List<Result> getResults ()
    {
        return results;
    }

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults (List<Result> results)
    {
        this.results = results;
    }

    /**
     * Gets success.
     *
     * @return the success
     */
    public int getSuccess ()
    {
        return success;
    }

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess (int success)
    {
        this.success = success;
    }

    /**
     * Gets multicast id.
     *
     * @return the multicast id
     */
    public long getMulticastId()
    {
        return multicastId;
    }

    /**
     * Sets multicast id.
     *
     * @param multicastId the multicast id
     */
    public void setMulticastId(long multicastId)
    {
        this.multicastId = multicastId;
    }

    /**
     * Gets canonical ids.
     *
     * @return the canonical ids
     */
    public int getCanonicalIds()
    {
        return canonicalIds;
    }

    /**
     * Sets canonical ids.
     *
     * @param canonicalIds the canonical ids
     */
    public void setCanonicalIds(int canonicalIds)
    {
        this.canonicalIds = canonicalIds;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [failure = "+failure+", results = "+results+", success = "+success+", multicastId = "+ multicastId +", canonicalIds = "+ canonicalIds +"]";
    }
}
