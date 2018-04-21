package si.inspirited.graduation.web.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.RestaurantSvc;

@Controller
public class RestaurantController {

    //service
    private final RestaurantSvc service;

    //views
    private static final String VIEWS_RESTAURANT_CREATE_OR_UPDATE_FORM = "createOrUpdateRestaurantForm";
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

    public String initUpdateForm() {return VIEWS_RESTAURANT_CREATE_OR_UPDATE_FORM;}
    public String processUpdateForm() {return "redirect:" + VIEWS_RESTAURANT_DETAILS;}            //[redirect must be reviewed here]

    public String initFindForm() {return VIEWS_RESTAURANT_SEARCH_FORM;}   // returns list of restaurants with their dishes and votes
    public String processFindForm() {return VIEWS_RESTAURANTS_LIST;}

    public String show() {return VIEWS_RESTAURANT_DETAILS;}

    public String remove() {return VIEWS_RESTAURANTS_LIST;}    //returns modified list of restaurants after removing the restaurant

}
