package com.pineblock.service.impl;

import com.pineblock.common.service.impl.BaseServiceImpl;
import com.pineblock.dao.UserMapper;
import com.pineblock.entity.User;
import com.pineblock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:27
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findByName(String username) {
        if (!username.isEmpty()) {
            User user = new User();
            user.setUsername(username);
            return userMapper.select(user).get(0);
        } else {
            return new User();
        }
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(List<Long> ids) {

    }
}
