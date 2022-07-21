package com.neil.location.services;

import com.neil.location.entities.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Location getLocationbyId(int id);
    List<Location> getAllLocations();
}
