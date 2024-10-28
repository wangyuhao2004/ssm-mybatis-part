package com.wang.pojo;

import lombok.Data;

import java.util.List;

/**
 * descriptions:
 *
 * @Author: 王玉豪
 * @Date: 2024/10/27 17:37
 */


@Data
public class Category {

    private Integer id;
    private String typename;
    private List<Product> productList;

}
