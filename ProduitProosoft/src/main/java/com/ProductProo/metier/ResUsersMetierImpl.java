package com.ProductProo.metier;

import com.ProductProo.dao.Res_usersRepository;
import com.ProductProo.entities.Res_users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by amino on 24/11/2017
 */

@Service
public class ResUsersMetierImpl implements ResUsersMetier {

    @Autowired
    private Res_usersRepository res_usersRepository;


    @Override
    public List<Res_users> ListUsers() {
        return res_usersRepository.findAll();
    }

    @Override
    public Res_users connection(String username, String password) {
        Res_users res_user = new Res_users();
        for(Res_users user : res_usersRepository.findAll()){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                res_user.setId(user.getId());
                res_user.setAction_id(user.getAction_id());
                res_user.setActive(user.isActive());
                res_user.setAlias_id(user.getAlias_id());
                res_user.setCompany_id(user.getCompany_id());
                res_user.setCreate_date(user.getCreate_date());
                res_user.setCreate_uid(user.getCreate_uid());
                res_user.setDefault_section_id(user.getDefault_section_id());
                res_user.setLogin(user.getUsername());
                res_user.setLogin_date(user.getLogin_date());
                res_user.setDisplay_groups_suggestions(user.isDisplay_groups_suggestions());
                res_user.setPartner_id(user.getPartner_id());
                res_user.setPassword(user.getPassword());
                res_user.setPassword_crypt(user.getPassword_crypt());
                res_user.setShare(user.isShare());
                res_user.setSignature(user.getSignature());
                res_user.setWrite_date(user.getWrite_date());
                res_user.setWrite_uid(user.getWrite_uid());
            }
        }
        System.out.print("------------------------------------"+res_user);
        return res_user;
    }


}
