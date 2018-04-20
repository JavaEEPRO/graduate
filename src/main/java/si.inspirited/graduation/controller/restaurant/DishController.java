package si.inspirited.graduation.controller.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.RestaurantSvc;

@Controller
public class DishController {

    private final RestaurantSvc service;

    @Autowired
    public DishController(RestaurantSvc service) {
        this.service = service;
    }

    public String addNewDish() {return "";}

    public String removeDish() {return "";}

    public String updateDish() {return "";}

    public String allDishes() {return "";} //returns all dishes of restaurant
}
