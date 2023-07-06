package com.example.springboottest.strategy;

import com.baomidou.mybatisplus.extension.service.IService;

public interface VehicleStrategy<T> extends IService<T> {

    Integer getMode();

    String go();
}
