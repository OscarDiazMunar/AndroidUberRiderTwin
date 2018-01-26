package com.oscar.androiduberridertwin.domain.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by oscar on 1/24/2018.
 */
public class Token {
    @SerializedName("token")
    private String token;

    /**
     * Instantiates a new Token.
     */
    public Token() {
    }

    /**
     * Instantiates a new Token.
     *
     * @param token the token
     */
    public Token(String token) {
        this.token = token;
    }

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
        this.token = token;
    }
}
