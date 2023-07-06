package com.example.springboottest.controller;

import com.example.springboottest.common.RestResult;
import com.example.springboottest.strategy.VehicleStrategyFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ProUser)表控制层
 *
 * @author makejava
 * @since 2023-06-27 22:18:10
 */
@RestController
@RequestMapping("strategy")
@Api(tags = "策略模式测试")
public class VehicleStategyController {
    @Autowired
    private VehicleStrategyFactory vehicleStrategyFactory;

    @PostMapping("/getStrategyByName")
    @ApiOperation(value = "通过名称获取交通工具", notes = "通过名称获取交通工具")
    public RestResult<String> getStrategyByName(String name) {
        return RestResult.success(vehicleStrategyFactory.getVehicleByName(name).go());
    }

    @PostMapping("/getStrategyByMode")
    @ApiOperation(value = "通过类型获取交通工具", notes = "通过类型获取交通工具")
    public RestResult<String> getStrategyByMode(Integer mode) {
        return RestResult.success(vehicleStrategyFactory.getVehicleByMode(mode).go());
    }

}

