package com.pineblock.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:03
 * @Version 1.0
 */
@Data
@Table(name = "t_user")
public class User {

    @Id
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String password;

}
