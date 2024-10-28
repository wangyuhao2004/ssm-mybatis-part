package com.wang.mapper;

import com.wang.pojo.Category;

import java.util.List;

/**
 * descriptions:
 *
 * @Author: 王玉豪
 * @Date: 2024/10/27 17:41
 */

public interface CategoryMapper {

    /**
     * 根据商品类别的名字查询商品
     * @param typename 商品类别
     * @return 商品信息
     */
    Category findProductsByTypename(String typename);
}
