package com.oscar.androiduberridertwin.utils;

import android.content.Context;

/**
 * Created by oscar on 2/27/2018.
 */

public class Methods {
    public static double getPrice(double kilometer, int minutes){
        return (Constants.Fares.base_fare + (Constants.Fares.time_rate * minutes) + (Constants.Fares.distance_rate * kilometer));
    }
}
