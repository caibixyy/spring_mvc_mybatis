package com.xyy.service;

import com.xyy.baen.User;

import java.util.List;
public interface UserService {
   List<User> findAll();

   User findById(int id);
}
