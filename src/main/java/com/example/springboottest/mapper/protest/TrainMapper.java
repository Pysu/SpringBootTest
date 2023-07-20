package com.example.springboottest.mapper.protest;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.Train;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Train)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-03 20:48:23
 */
@Mapper
public interface TrainMapper extends BaseMapper<Train> {
}

