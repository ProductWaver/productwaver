package com.ProductProo.service;

import com.ProductProo.entities.Res_users;
import com.ProductProo.metier.ResUsersMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by amino on 24/11/2017
 */

@RestController
public class ResUserRestController {

    @Autowired
    private ResUsersMetier resUsersMetier;

    @RequestMapping(value = "/listUsers",method = RequestMethod.GET)
    public List<Res_users> ListUsers() {
        return resUsersMetier.ListUsers();
    }

    @RequestMapping(value = "/getUser/{username}/{password}",method = RequestMethod.GET)
    public Res_users connection(@PathVariable String username,@PathVariable String password) {
        return resUsersMetier.connection(username, password);
    }
}
