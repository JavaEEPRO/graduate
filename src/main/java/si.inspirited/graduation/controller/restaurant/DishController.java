package si.inspirited.graduation.controller.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.RestaurantSvc;

@Controller
public class DishController {

    //service
    private final RestaurantSvc service;

    //views
    private static final String VIEWS_DISHES_CREATE_OR_UPDATE_FORM = "createOrUpdateDishForm";

    //constructor initializes service
    @Autowired
    public DishController(RestaurantSvc service) {
        this.service = service;
    }

    public String initCreationForm() {return VIEWS_DISHES_CREATE_OR_UPDATE_FORM;}
    public String processCreationForm() {return "redirect:";}            //[redirect must be reviewed here]

    public String initUpdateForm() {return VIEWS_DISHES_CREATE_OR_UPDATE_FORM;}
    public String processUpdateForm() {return "redirect:";}            //[redirect must be reviewed here]

    public String remove() {return "";}

    public String show() {return "";} //returns all dishes of restaurant
}
