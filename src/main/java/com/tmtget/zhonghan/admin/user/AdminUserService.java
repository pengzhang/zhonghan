package com.tmtget.zhonghan.admin.user;

import com.jfinal.plugin.activerecord.Page;
import com.tmtget.zhonghan.common.model.User;

public class AdminUserService {

    private static final User dao = new User();

    public Page<User> paginate(int page, int size){
        return dao.paginate(page, size, "select * ", "from user order by createDate desc");
    }

}
