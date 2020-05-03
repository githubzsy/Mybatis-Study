package com.kuang.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private long id;
    private String name;
    private Date createTime;
}
