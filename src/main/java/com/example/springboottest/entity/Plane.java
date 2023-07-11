package com.example.springboottest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * (Plane)实体类
 *
 * @author makejava
 * @since 2023-07-03 20:47:58
 */
@Data
public class Plane {
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
