package com.oscar.androiduberridertwin.utils;

import android.util.Patterns;

/**
 * Created by oscar on 11/10/2017.
 */
public final class Validator {

    /**
     * Is valid email boolean.
     *
     * @param email the email
     * @return the boolean
     */
    public static boolean isValidEmail(String email)
    {
        return !Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
