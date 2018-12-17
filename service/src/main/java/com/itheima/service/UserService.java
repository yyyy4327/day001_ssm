package com.itheima.service;

import com.itheima.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> findAll();
}
