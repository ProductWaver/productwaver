package com.ProductProo.dao;

import com.ProductProo.entities.Res_users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by amino on 22/11/2017
 */
public interface Res_usersRepository extends JpaRepository<Res_users,Long>{
      Res_users findByLogin(String username);
}