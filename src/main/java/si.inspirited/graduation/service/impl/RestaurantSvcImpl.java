package si.inspirited.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.inspirited.graduation.domain.Restaurant;
import si.inspirited.graduation.repository.RestaurantRepository;
import si.inspirited.graduation.service.RestaurantSvc;

@Service
public class RestaurantSvcImpl implements RestaurantSvc {

    private final RestaurantRepository repository;

    @Autowired
    public RestaurantSvcImpl(RestaurantRepository repository) {
        this.repository = repository;
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Restaurant get(int id) {
        return null;
    }

    @Override
    public boolean update(Restaurant restaurant) {
        return false;
    }
}
