package com.example.springboottest.mapper.protest;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.Bus;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Bus)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-03 20:46:23
 */
@Mapper
public interface BusMapper extends BaseMapper<Bus> {
}

