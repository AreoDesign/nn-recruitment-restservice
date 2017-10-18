package com.it.aro.nnrestservice.dao;

import com.it.aro.nnrestservice.entity.UserEntity;
import com.it.aro.nnrestservice.entity.UserType;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    private static List<UserEntity> allUsers = new ArrayList<>();

    static {
        allUsers.add(UserEntity.builder()
                .id(1L)
                .login("Arczi")
                .name("Arkadiusz")
                .type(UserType.ADMIN)
                .avatarUrl("http://www.myavatar.com")
                .createdAt(LocalDateTime.of(1985,1,4,19,0))
                .build());
        allUsers.add(UserEntity.builder()
                .id(2L)
                .login("Kati")
                .name("Katarzyna")
                .type(UserType.USER)
                .avatarUrl("http://www.someavatar.com")
                .createdAt(LocalDateTime.of(1999, 10, 5, 20, 0))
                .build());
        allUsers.add(UserEntity.builder()
                .id(3L)
                .login("Zibi")
                .name("Zbigniew")
                .type(UserType.SUPERUSER)
                .avatarUrl("http://www.elseavatar.com")
                .createdAt(LocalDateTime.of(1993, 5, 5, 10, 10))
                .build());
        allUsers.add(UserEntity.builder()
                .id(4L)
                .login("Johnny")
                .name("Jan")
                .type(UserType.MODERATOR)
                .avatarUrl("http://www.thebestavatarever.com")
                .createdAt(LocalDateTime.of(2010, 12, 24, 19, 0))
                .build());
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return allUsers;
    }

    @Override
    public UserEntity getUserById(Long id) {
        return allUsers.stream().filter((q) -> q
                .getId()
                .equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        allUsers.add(userEntity);
        return userEntity;
    }
}
