package com.example.springboottest.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboottest.entity.ProUser;
import com.example.springboottest.vo.ProUserQueryVo;

/**
 * (ProUser)表服务接口
 *
 * @author makejava
 * @since 2023-06-27 22:18:12
 */
public interface ProUserService extends IService<ProUser> {
    /**
     * 获取分页数据
     * @return
     */
    IPage<ProUser> pageList(ProUserQueryVo proUserQueryVo);
}
