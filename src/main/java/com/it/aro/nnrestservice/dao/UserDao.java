package com.it.aro.nnrestservice.dao;

import com.it.aro.nnrestservice.entity.UserEntity;

import java.util.List;

public interface UserDao {

    List<UserEntity> getAllUsers();

    UserEntity getUserById(Long id);

    UserEntity addUser(UserEntity userEntity);

}
