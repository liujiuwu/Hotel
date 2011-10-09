package config;

import java.util.ArrayList;
import java.util.List;

import models.Hotel;

public class ApplicationConfig {
    private static List<Hotel> hotels = new ArrayList<Hotel>();

    /**
     * @return the hotels
     */
    public static final List<Hotel> getHotels() {
        return hotels;
    }

}
