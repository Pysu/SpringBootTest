package com.example.springboottest.mapper.protest;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.Plane;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Plane)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-03 20:47:58
 */
@Mapper
public interface PlaneMapper extends BaseMapper<Plane> {
}

