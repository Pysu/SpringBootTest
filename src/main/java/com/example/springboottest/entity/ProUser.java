package com.example.springboottest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (ProUser)实体类
 *
 * @author makejava
 * @since 2023-06-27 22:18:12
 */
@TableName("pro_user")
@Data
public class ProUser {
    /**
     * 主键ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别（0-女，1-男）
     */
    private Integer gender;
    /**
     * 出生年月日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;
}

