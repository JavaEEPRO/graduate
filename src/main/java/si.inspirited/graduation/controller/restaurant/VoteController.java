package si.inspirited.graduation.controller.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.RestaurantSvc;

@Controller
public class VoteController {

    private final RestaurantSvc service;

    @Autowired
    public VoteController(RestaurantSvc service) {
        this.service = service;
    }

    public String addVote() {return "";}

    public String undoVote() {return "";}

}
