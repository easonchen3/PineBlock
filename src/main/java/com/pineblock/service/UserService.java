package com.pineblock.service;

import com.pineblock.common.service.BaseService;
import com.pineblock.entity.User;

import java.util.List;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:17
 * @Version 1.0
 */

public interface UserService extends BaseService<User>{

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 根据Name查询用户数据
     *
     * @param username
     * @return
     */
    User findByName(String username);

    /**
     * 更新
     *
     * @param user
     */
    void update(User user);

    /**
     * 删除
     *
     * @param ids
     */
    void delete(List<Long> ids);

}
