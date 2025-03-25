package com.karthi.hotel_booking.service;

import com.karthi.hotel_booking.model.User;

import java.util.List;

import javax.management.relation.RoleNotFoundException;


public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}