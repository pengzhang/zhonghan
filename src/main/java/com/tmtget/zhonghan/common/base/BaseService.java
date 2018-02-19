package com.tmtget.zhonghan.common.base;

import com.jfinal.plugin.activerecord.Page;

import java.util.List;

/**
 * 服务层基础类
 * @param <T>
 * @author zhangpeng
 */
public  interface BaseService<T>{

    /**
     * 获取对象
     * @param id
     * @return
     */
    public T findById(long id);

    /**
     * 获取对象过滤逻辑删除
     * @param id
     * @return
     */
    public T findByIdFilterRemove(long id);

    /**
     * 获取全部
     * @return
     */
    public List<T> findAll();

    /**
     * 获取全部过滤逻辑删除
     * @return
     */
    public List<T> findAllFilterRemove();

    /**
     * 分页获取
     * @param page
     * @param size
     * @return
     */
    public Page<T> paginate(int page, int size);

    /**
     * 分页获取过滤逻辑删除
     * @param page
     * @param size
     * @return
     */
    public Page<T> paginnateFilterRemove(int page, int size);

    /**
     * 物理删除
     * @param id
     */
    public void deleteById(long id);

    /**
     * 批量物理删除
     * @param ids
     */
    public void deleteByList(Long[] ids);

    /**
     * 逻辑删除
     * @param id
     */
    public void removeById(long id);

    /**
     * 批量逻辑删除
     * @param ids
     */
    public void removeByList(Long[] ids);

    /**
     * 恢复
     * @param id
     */
    public void resumeById(long id);

    /**
     * 批量恢复
     * @param ids
     */
    public void resumeByList(Long[] ids);

    /**
     * 保存对象
     * @param t
     */
    public void save(T t);

    /**
     * 更新对象
     * @param t
     */
    public void update(T t);

    /**
     * 简单搜索
     * @param keyword
     * @return
     */
    public Page<T> search(int page, int size, String keyword);

}
