package com.example.springboottest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottest.entity.Train;
import com.example.springboottest.mapper.protest.TrainMapper;
import com.example.springboottest.service.TrainService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Train)表服务实现类
 *
 * @author makejava
 * @since 2023-07-03 20:48:23
 */
@Service("trainService")
public class TrainServiceImpl extends ServiceImpl<TrainMapper, Train> implements TrainService {

    @Override
    public Integer getMode() {
        return 3;
    }

    @Override
    public String go() {
        return "go by train!";
    }

    @Override
    public List<Train> getALlTrain() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.list();
    }
}
