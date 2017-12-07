package com.ProductProo.metier;

import com.ProductProo.entities.Res_users;

import java.util.List;

/**
 * Created by amino on 24/11/2017
 */
public interface ResUsersMetier {

    public List<Res_users> ListUsers();
    public Res_users connection(String username,String password);
}
