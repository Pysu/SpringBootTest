package com.example.springboottest.common;

import lombok.Data;

@Data
public class CommonPageVo {
    private Integer currentPage = 1;

    private Integer pageSize = 10;
}
