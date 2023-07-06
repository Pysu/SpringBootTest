package com.example.springboottest.service;

import com.example.springboottest.entity.Bus;
import com.example.springboottest.strategy.VehicleStrategy;
import java.util.List;

/**
 * (Bus)表服务接口
 *
 * @author makejava
 * @since 2023-07-03 20:46:30
 */
public interface BusService extends VehicleStrategy<Bus> {

    List<Bus> getALlBus();
}
