package com.sm.cn.service.base.impl;

import com.github.pagehelper.PageInfo;
import com.sm.cn.mapper.base.BaseMapper;
import com.sm.cn.service.base.BaseService;
import com.sm.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    @Autowired
    private BaseMapper<T, ID> baseMapper;

    @Override
    public long countByExample(Object example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(Object example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T record) {
        return baseMapper.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public PageVo<T> select() {
        return getPageVo(baseMapper.selectByExample(null));
    }

    @Override
    public PageVo<T> selectByExample(Object example) {
        return getPageVo(baseMapper.selectByExample(example));
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(T record, Object example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(T record, Object example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return baseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return baseMapper.updateByPrimaryKey(record);
    }

    @Override
    @Transactional
    public int batchInsert(List<T> list) {
        list.forEach(item -> baseMapper.insert(item));
        return 1;
    }

    @Override
    @Transactional
    public int batchUpdate(List<T> list) {
        list.forEach(item -> baseMapper.updateByPrimaryKey(item));
        return 1;
    }

    @Override
    @Transactional
    public int batchDeleteByPrimaryKey(List<ID> ids) {
        ids.forEach(item -> baseMapper.deleteByPrimaryKey(item));
        return 1;
    }

    @Override
    public PageVo<T> getPageVo(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setList(list);
        pageVo.setTotal(total);
        return pageVo;
    }
}
