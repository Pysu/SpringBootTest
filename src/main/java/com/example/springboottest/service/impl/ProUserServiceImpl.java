package com.example.springboottest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottest.entity.ProUser;
import com.example.springboottest.mapper.ProUserMapper;
import com.example.springboottest.service.ProUserService;
import com.example.springboottest.util.CommonDataUtil;
import com.example.springboottest.vo.ProUserQueryVo;
import org.springframework.stereotype.Service;

/**
 * (ProUser)表服务实现类
 *
 * @author makejava
 * @since 2023-06-27 22:18:12
 */
@Service("proUserService")
public class ProUserServiceImpl extends ServiceImpl<ProUserMapper, ProUser> implements ProUserService {
    @Override
    public IPage<ProUser> pageList(ProUserQueryVo proUserQueryVo) {
        QueryWrapper<ProUser> queryWrapper = new QueryWrapper<>();
        if (CommonDataUtil.strIsNotBlank(proUserQueryVo.getName())) {
            queryWrapper.like("name", proUserQueryVo.getName());
        }
        if (CommonDataUtil.objIsNotNull(proUserQueryVo.getAge())) {
            queryWrapper.eq("age", proUserQueryVo.getAge());
        }
        Page<ProUser> page = new Page<>(proUserQueryVo.getCurrentPage(), proUserQueryVo.getPageSize());
        Page<ProUser> result = this.page(page, queryWrapper);
        return result;
    }
}
