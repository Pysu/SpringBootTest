package com.example.springboottest.service;

import java.util.List;

public interface FutureService {

    List<Object> getVehicleAsync();

    List<Object> getVehicleSync();
}
