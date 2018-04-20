package si.inspirited.graduation.controller.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.RestaurantSvc;

@Controller
public class VoteController {

    //service
    private final RestaurantSvc service;

    //constructor initializes service
    @Autowired
    public VoteController(RestaurantSvc service) {
        this.service = service;
    }

    public String add() {return "redirect:";}   //[redirect must be reviewed here]

    public String undo() {return "redirect:";}  //[redirect must be reviewed here]

}
