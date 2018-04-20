package si.inspirited.graduation.controller.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.RestaurantSvc;

@Controller
public class RestaurantController {

    private final RestaurantSvc service;

    @Autowired
    public RestaurantController(RestaurantSvc service) {
        this.service = service;
    }

    public String addNewRestaurant() {return "";}

    public String removeRestaurant() {return "";}

    public String getAllRestaurants() {return "";}
}
