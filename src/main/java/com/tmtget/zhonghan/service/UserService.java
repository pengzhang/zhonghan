package com.tmtget.zhonghan.service;

import com.jfinal.plugin.activerecord.Page;
import com.tmtget.zhonghan.common.base.BaseService;
import com.tmtget.zhonghan.common.model.User;

import java.util.List;

/**
 * 用户管理
 * @author zhangpeng
 */
public class UserService implements BaseService<User>{

    private static final User dao = new User().dao();

    public User findById(long id) {
        return null;
    }

    public User findByIdFilterRemove(long id) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }

    public List<User> findAllFilterRemove() {
        return null;
    }

    public Page<User> paginate(int page, int size) {
        return dao.paginate(page, size, "select * ", "from user order by createDate desc");
    }

    public Page<User> paginnateFilterRemove(int page, int size) {
        return null;
    }

    public void deleteById(long id) {

    }

    public Page<User> search(int page, int size, String keyword) {
        return dao.paginate(page, size, "select *", "from user where username like '%"+keyword+"%' order by createDate desc");
    }

    public void deleteByList(Long[] ids) {

    }

    public void removeById(long id) {

    }

    public void removeByList(Long[] ids) {

    }

    public void resumeById(long id) {

    }

    public void resumeByList(Long[] ids) {

    }

    public void save(User user) {

    }

    public void update(User user) {

    }
}
