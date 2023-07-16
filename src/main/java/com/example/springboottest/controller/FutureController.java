package com.example.springboottest.controller;

import com.example.springboottest.common.RestResult;
import com.example.springboottest.service.FutureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/future")
@Api(tags = "多线程处理任务")
public class FutureController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private FutureService futureService;

    @PostMapping("/getVehicleAsync")
    @ApiOperation(value = "异步获取交通方式", notes = "异步获取交通方式")
    public RestResult<List<Object>> getVehicleAsync() {
        logger.info("getVehicleAsync begin ...");
        List<Object> vehicleAsync = futureService.getVehicleAsync();
        logger.info("getVehicleAsync end ...");
        return RestResult.success(vehicleAsync);
    }

    @PostMapping("/getVehicleSync")
    @ApiOperation(value = "同步获取交通方式", notes = "同步获取交通方式")
    public RestResult<List<Object>> getVehicleSync() {
        return RestResult.success(futureService.getVehicleSync());
    }
}
