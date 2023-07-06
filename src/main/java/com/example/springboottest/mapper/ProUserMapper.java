package com.example.springboottest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.ProUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProUserMapper extends BaseMapper<ProUser> {
}
