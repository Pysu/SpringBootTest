package com.example.springboottest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottest.entity.Bus;
import com.example.springboottest.mapper.BusMapper;
import com.example.springboottest.service.BusService;
import com.example.springboottest.strategy.VehicleStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Bus)表服务实现类
 *
 * @author makejava
 * @since 2023-07-03 20:46:31
 */
@Service("busService")
public class BusServiceImpl extends ServiceImpl<BusMapper, Bus> implements BusService {

    @Override
    public Integer getMode() {
        return 1;
    }

    @Override
    public String go() {
        return "go by Bus!";
    }

    @Override
    public List<Bus> getALlBus() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.list();
    }
}
