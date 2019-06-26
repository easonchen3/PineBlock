package com.pineblock.common.service.impl;

import com.pineblock.common.service.BaseService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:19
 * @Version 1.0
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    @Getter
    private Mapper<T> mapper;

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public void save(T entity) {
        mapper.insert(entity);
    }

    @Override
    public void delete(Object key) {
        mapper.deleteByPrimaryKey(key);
    }

    @Override
    public void batchDelete(List<Long> ids, String property, Class<T> clazz) {
        Example example = new Example(clazz);
        example.createCriteria().andIn(property,ids);
        this.mapper.deleteByExample(example);
    }

    @Override
    public void updateAll(T entity) {
        mapper.updateByPrimaryKey(entity);
    }

    @Override
    public void updateNotNull(T entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
}
