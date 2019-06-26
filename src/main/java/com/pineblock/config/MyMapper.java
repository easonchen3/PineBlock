package com.pineblock.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:12
 * @Version 1.0
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
