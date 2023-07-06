package com.example.springboottest.service;

import com.example.springboottest.entity.Plane;
import com.example.springboottest.strategy.VehicleStrategy;
import java.util.List;

/**
 * (Plane)表服务接口
 *
 * @author makejava
 * @since 2023-07-03 20:47:58
 */
public interface PlaneService extends VehicleStrategy<Plane> {

    List<Plane> getALlPlane();
}
