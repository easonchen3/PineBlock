package com.pineblock.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:07
 * @Version 1.0
 */
@Data
@Table(name = "t_article")
public class Article {

    @Id
    private Long id;
    @NotNull
    private String title;
    private String conver;
    private String author;
    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @Column(name = "publish_time")
    private String publishTime;
}
