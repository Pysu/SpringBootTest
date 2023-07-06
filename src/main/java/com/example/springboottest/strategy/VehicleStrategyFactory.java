package com.example.springboottest.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class VehicleStrategyFactory {

    @Autowired
    private Map<String, VehicleStrategy> map;

    @Autowired
    private List<VehicleStrategy> list;

    public VehicleStrategy getVehicleByName(String name) {
        map.forEach((key, value) -> {
            System.out.println(key + "   " + value);
        });
        return map.get(name);
    }

    public VehicleStrategy getVehicleByMode(Integer type) {
        list.forEach(strategy -> System.out.println(strategy));
        return list.stream().filter(strategy -> strategy.getMode() == type).findFirst().get();
    }
}
