package com.example.springboottest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * (Train)实体类
 *
 * @author makejava
 * @since 2023-07-03 20:48:23
 */
@Data
public class Train {
    /**
     * ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 票价
     */
    private Float price;
    /**
     * 乘车起点
     */
    private String startPoint;
    /**
     * 乘车终点
     */
    private String endPoint;
    /**
     * 用户ID
     */
    private String userId;
}

