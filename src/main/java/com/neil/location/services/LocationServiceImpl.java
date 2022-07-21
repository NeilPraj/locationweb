package com.neil.location.services;

import com.neil.location.entities.Location;
import com.neil.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository repository;

    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);

    }

    @Override
    public Location getLocationbyId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocations() {
        return repository.findAll();
    }
}
