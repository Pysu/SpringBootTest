package com.example.springboottest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottest.entity.Plane;
import com.example.springboottest.mapper.PlaneMapper;
import com.example.springboottest.service.PlaneService;
import com.example.springboottest.strategy.VehicleStrategy;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * (Plane)表服务实现类
 *
 * @author makejava
 * @since 2023-07-03 20:47:58
 */
@Service("planeService")
public class PlaneServiceImpl extends ServiceImpl<PlaneMapper, Plane> implements PlaneService {

    @Override
    public Integer getMode() {
        return 2;
    }

    @Override
    public String go() {
        return "go by plane!";
    }

    @Override
    public List<Plane> getALlPlane() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.list();
    }
}
