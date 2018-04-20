package si.inspirited.graduation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import si.inspirited.graduation.service.UserSvc;

@Controller
public class UserController {

    private final UserSvc service;

    @Autowired
    public UserController(UserSvc service) {
        this.service = service;
    }
}
