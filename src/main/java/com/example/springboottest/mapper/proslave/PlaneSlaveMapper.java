package com.example.springboottest.mapper.proslave;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.PlaneSlave;
import org.apache.ibatis.annotations.Mapper;

/**
 * (PlaneSlave)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-19 20:17:14
 */
@Mapper
public interface PlaneSlaveMapper extends BaseMapper<PlaneSlave> {
}

