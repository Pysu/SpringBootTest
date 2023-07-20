package com.example.springboottest.mapper.proslave;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.BusSlave;
import org.apache.ibatis.annotations.Mapper;

/**
 * (BusSlave)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-19 20:17:14
 */
@Mapper
public interface BusSlaveMapper extends BaseMapper<BusSlave> {
}

