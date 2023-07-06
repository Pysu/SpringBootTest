package com.example.springboottest.vo;

import com.example.springboottest.common.CommonPageVo;
import lombok.Data;

@Data
public class ProUserQueryVo extends CommonPageVo {
    private String name;

    private Integer age;
}
