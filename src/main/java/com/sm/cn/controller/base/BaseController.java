package com.sm.cn.controller.base;

import com.github.pagehelper.PageHelper;
import com.sm.cn.common.http.AxiosResult;
import com.sm.cn.service.base.BaseService;
import com.sm.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


public class BaseController<T, ID> {

    @Autowired
    private BaseService<T, ID> baseService;

    @GetMapping
    public AxiosResult<PageVo<T>> select(@RequestParam(defaultValue = "1") int currentPage,
                                         @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return AxiosResult.success(baseService.select());
    }

    @GetMapping("{id}")
    public AxiosResult<T> selectByPrimaryId(@PathVariable ID id) {
        return AxiosResult.success(baseService.selectByPrimaryKey(id));
    }

    @PostMapping
    public AxiosResult<Void> insert(@RequestBody T record) {
        return toAxios(baseService.insert(record));
    }
    @PutMapping
    public AxiosResult<Void> updateByPrimaryKey(@RequestBody T record) {
        return toAxios(baseService.updateByPrimaryKey(record));
    }
    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteByPrimaryKey(@PathVariable ID id) {
        return toAxios(baseService.deleteByPrimaryKey(id));
    }
    private AxiosResult<Void> toAxios(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.error();
    }
}
