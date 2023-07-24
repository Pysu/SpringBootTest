package com.example.springboottest.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.springboottest.entity.Bus;
import com.example.springboottest.entity.Plane;
import com.example.springboottest.entity.Train;
import com.example.springboottest.service.BusService;
import com.example.springboottest.service.FutureService;
import com.example.springboottest.service.PlaneService;
import com.example.springboottest.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service("futureService")
public class FutureServiceImpl implements FutureService {
    private static ExecutorService executorService = Executors.newFixedThreadPool(3);
    @Autowired
    private BusService busService;
    @Autowired
    private PlaneService planeService;
    @Autowired
    private TrainService trainService;

    @DS("protest")
    @Override
    public List<Object> getVehicleAsync() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        CompletableFuture<List<Bus>> busFuture = CompletableFuture.supplyAsync(() -> busService.getALlBus(), executorService);
        CompletableFuture<List<Plane>> planeFuture = CompletableFuture.supplyAsync(() -> planeService.getALlPlane(), executorService);
        CompletableFuture<List<Train>> trainFuture = CompletableFuture.supplyAsync(() -> trainService.getALlTrain(), executorService);
        CompletableFuture<List<Object>> result = CompletableFuture.allOf(busFuture, planeFuture, trainFuture).thenApply(fn -> {
            List<Object> list = new ArrayList<>();
            list.add(busFuture.join());
            list.add(planeFuture.join());
            list.add(trainFuture.join());
            return list;
        });
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeSeconds());
        return result.join();
    }

    @Override
    public List<Object> getVehicleSync() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<Object> result = new ArrayList<>();
        result.add(busService.getALlBus());
        result.add(planeService.getALlPlane());
        result.add(trainService.getALlTrain());
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeSeconds());
        return result;
    }
}
