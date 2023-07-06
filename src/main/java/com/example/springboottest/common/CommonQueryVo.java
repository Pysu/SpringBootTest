package com.example.springboottest.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "通用请求实体类")
public class CommonQueryVo {
    /**
     * ID
     */
    private String id;
}
