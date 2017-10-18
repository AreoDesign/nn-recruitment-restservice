package com.it.aro.nnrestservice.controller;

import com.it.aro.nnrestservice.dao.UserDao;
import com.it.aro.nnrestservice.entity.UserEntity;
import com.it.aro.nnrestservice.entity.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/user/info/static/all")
    public List<UserEntity> showAllUsers() {
        return userDao.getAllUsers();
    }

    @GetMapping("/user/info/static/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userDao.getUserById(id);
    }

    @PostMapping("/user/static/add")
    public UserEntity addNewUser(@RequestParam String login,
                                 @RequestParam String name,
                                 @RequestParam UserType type,
                                 @RequestParam(required = false) String avatarUrl) {
        AtomicLong counter = new AtomicLong((long) userDao.getAllUsers().size());
        UserEntity userEntity = new UserEntity();
        userEntity.setId(counter.incrementAndGet());
        userEntity.setLogin(login);
        userEntity.setName(name);
        userEntity.setType(type);
        userEntity.setAvatarUrl(avatarUrl);
        userEntity.setCreatedAt(LocalDateTime.now());
        return userDao.addUser(userEntity);
    }

    @GetMapping("/user/info")
    public String goToGithubSite() {
        RestTemplate restTemplate = new RestTemplate();
        UserEntity userEntity = restTemplate.getForObject("https://api.github.com/users/octocat", UserEntity.class);
        return userEntity.toString();
    }

}
