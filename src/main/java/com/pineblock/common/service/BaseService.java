package com.pineblock.common.service;

import java.util.List;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:19
 * @Version 1.0
 */
public interface BaseService<T> {

    List<T> selectAll();

    T selectByKey(Object key);

    void save(T entity);

    void delete(Object key);

    void batchDelete(List<Long> ids, String property, Class<T> clazz);

    void updateAll(T entity);

    void updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
