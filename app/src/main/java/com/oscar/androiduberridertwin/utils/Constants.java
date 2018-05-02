package com.oscar.androiduberridertwin.utils;

/**
 * Created by oscar on 11/16/2017.
 */
public class Constants {
    /**
     * The interface Url services.
     */
    public interface UrlServices{
        /**
         * The constant BASE_URL_API.
         */
        String BASE_URL_API = "https://maps.googleapis.com/";
        /**
         * The constant FCM_URL_API.
         */
        String FCM_URL_API = "https://fcm.googleapis.com/";
    }

    /**
     * The interface Db tables.
     */
    public interface DBTables{
        /**
         * The constant driver_table.
         */
        String driver_table = "Drivers";
        /**
         * The constant user_driver_table.
         */
        String user_driver_table = "DriversInformation";
        /**
         * The constant user_rider_table.
         */
        String user_rider_table = "RidersInformation";
        /**
         * The constant pickup_request_table.
         */
        String pickup_request_table = "PickupRequest";
        /**
         * The constant tokens_table.
         */
        String tokens_table = "Tokens";
    }

    /**
     * The interface Fares.
     */
    public interface Fares{
        /**
         * The constant base_fare.
         */
        double base_fare = 2.55;
        /**
         * The constant time_rate.
         */
        double time_rate = 0.35;
        /**
         * The constant distance_rate.
         */
        double distance_rate = 1.75;
    }
}
