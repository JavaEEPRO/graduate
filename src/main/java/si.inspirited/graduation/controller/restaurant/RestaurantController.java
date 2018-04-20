package si.inspirited.graduation.controller.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.RestaurantSvc;

@Controller
public class RestaurantController {

    //service
    private final RestaurantSvc service;

    //views
    private static final String VIEWS_RESTAURANT_CREATE_OR_UPDATE_FORM = "createOrUpdaterestaurantForm";
    private static final String VIEWS_RESTAURANT_SEARCH_FORM = "findRestaurantForm";
    private static final String VIEWS_RESTAURANT_DETAILS = "restaurantDetails";
    private static final String VIEWS_RESTAURANTS_LIST = "restaurantsList";

    //constructor initializes service
    @Autowired
    public RestaurantController(RestaurantSvc service) {
        this.service = service;
    }

    public String initCreationForm() {return VIEWS_RESTAURANT_CREATE_OR_UPDATE_FORM;}
    public String processCreationForm() {return "redirect:";}            //[redirect must be reviewed here]

    public String initFindForm() {return VIEWS_RESTAURANT_SEARCH_FORM;}   // returns list of restaurants with their dishes and votes
    public String processFindForm() {return VIEWS_RESTAURANTS_LIST;}

    public String showRestaurant() {return VIEWS_RESTAURANT_DETAILS;}

    public String initUpdateForm() {return VIEWS_RESTAURANT_CREATE_OR_UPDATE_FORM;}
    public String processUpdateForm() {return "redirect:" + VIEWS_RESTAURANT_DETAILS;}            //[redirect must be reviewed here]

    public String removeRestaurant() {return VIEWS_RESTAURANTS_LIST;}    //returns modified list of restaurants after removing restaurant

}
