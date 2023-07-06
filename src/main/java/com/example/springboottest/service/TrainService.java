package com.example.springboottest.service;

import com.example.springboottest.entity.Train;
import com.example.springboottest.strategy.VehicleStrategy;
import java.util.List;

/**
 * (Train)表服务接口
 *
 * @author makejava
 * @since 2023-07-03 20:48:23
 */
public interface TrainService extends VehicleStrategy<Train> {

    List<Train> getALlTrain();
}
