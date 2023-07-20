package com.example.springboottest.mapper.proslave;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.TrainSlave;
import org.apache.ibatis.annotations.Mapper;

/**
 * (TrainSlave)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-19 20:17:15
 */
@Mapper
public interface TrainSlaveMapper extends BaseMapper<TrainSlave> {
}

