package si.inspirited.graduation.domain;

import si.inspirited.graduation.domain.abstrct.NamedEntity;

public class Dish extends NamedEntity {

    private Restaurant restaurant;

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
