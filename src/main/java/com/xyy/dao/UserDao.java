package com.xyy.dao;

import com.xyy.baen.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select(value = "select * from user")
    List<User> findAll();

    @Select(value = "select * from user where id=#{id}")
    User findById(int id);

}
