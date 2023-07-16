package com.example.springboottest.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboottest.common.CommonQueryVo;
import com.example.springboottest.common.RestResult;
import com.example.springboottest.entity.ProUser;
import com.example.springboottest.service.ProUserService;
import com.example.springboottest.vo.ProUserQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (ProUser)表控制层
 *
 * @author makejava
 * @since 2023-06-27 22:18:10
 */
@RestController
@RequestMapping("proUser")
@Api(tags = "用户信息管理")
public class ProUserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ProUserService proUserService;

    @PostMapping("/getUserList")
    @ApiOperation(value = "列表查询", notes = "用户信息-列表查询")
    public RestResult<IPage<ProUser>> getUserList(@RequestBody ProUserQueryVo proUserQueryVo) {
        return RestResult.success(proUserService.pageList(proUserQueryVo));
    }

    @PostMapping("/addUser")
    @ApiOperation(value = "用户新增", notes = "用户信息-用户新增")
    public RestResult<String> addUser(@RequestBody ProUser proUser) {
        proUserService.save(proUser);
        logger.info("用户新增成功！");
        return RestResult.success();
    }

    @PostMapping("/updateUser")
    @ApiOperation(value = "用户更新", notes = "用户信息-用户更新")
    public RestResult<String> updateUser(@RequestBody ProUser proUser) {
        proUserService.updateById(proUser);
        return RestResult.success();
    }

    @PostMapping("/deleteUser")
    @ApiOperation(value = "删除用户", notes = "用户信息-用户删除")
    public RestResult<String> deleteUser(@RequestBody CommonQueryVo queryVo) {
        proUserService.removeById(queryVo.getId());
        return RestResult.success();
    }
}

