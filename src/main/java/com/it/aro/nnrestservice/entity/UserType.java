package com.it.aro.nnrestservice.entity;

/**
 * This class is for assigning limited account types which would be subsequently managed for granting proper access privileges
 * "User" field is here only for correct mapping from GitHub API. UserType shall be enum value
 */

public enum UserType {

    USER,
    SUPERUSER,
    MODERATOR,
    ADMIN,
    User

}
