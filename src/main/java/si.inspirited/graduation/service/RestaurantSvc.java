package si.inspirited.graduation.service;

import si.inspirited.graduation.domain.Restaurant;

public interface RestaurantSvc {

    Restaurant create(Restaurant restaurant);

    boolean delete(int id);

    Restaurant get(int id);

    boolean update(Restaurant restaurant);
}
