package com.sm.cn.service.base;

import com.sm.cn.vo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseService<T,ID> {
    /**
     * 计数
     * @param example
     * @return
     */
    long countByExample(Object example);

    /**
     * 删除操作，按条件删除
     * @param example
     * @return
     */
    int deleteByExample(Object example);

    /**
     * 删除操作
     * @param id
     * @return
     */
    int deleteByPrimaryKey(ID id);

    /**
     * 添加操作
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 添加操作（只会添加不为空的属性，不会覆盖默认值）
     * @param record
     * @return
     */
    int insertSelective(T record);

    /**
     * 查询操作，分页查询
     * @return
     */
    PageVo<T> select();

    /**
     * 查询操作，按条件分页查询
     * @param example
     * @return
     */
    PageVo<T> selectByExample(Object example);

    /**
     * 查询操作，按主键id查询
     * @param id
     * @return
     */
    T selectByPrimaryKey(ID id);

    /**
     * 更新操作（根据特定的限制条件更新所有设置了值的列）
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    /**
     * 更新操作（根据特定的限制条件进行更新除了text类型(数据库)的所有列）
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") T record, @Param("example") Object example);

    /**
     * 更新操作（通过ID更新所有设置了值的列）
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 更新操作（通过ID更新除了text类型(数据库)的所有列）
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);

    /**
     * 批量插入数据
     * @param list
     * @return
     */
    int batchInsert(List<T> list);

    /**
     * 批量更新数据
     * @param list
     * @return
     */
    int batchUpdate(List<T> list);

    /**
     * 批量通过主键id删除
     * @param ids
     * @return
     */
    int batchDeleteByPrimaryKey(List<ID> ids);

    /**
     * 封装分页数据
     * @param list
     * @return
     */
    PageVo<T> getPageVo(List<T> list);
}
