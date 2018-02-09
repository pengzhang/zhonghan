package com.tmtget.zhonghan.common.route;

import com.jfinal.config.Routes;
import com.tmtget.zhonghan.admin.AdminController;
import com.tmtget.zhonghan.admin.user.AdminUserController;

public class AdminRoutes extends Routes{

    public void config() {
        add("/admin", AdminController.class, "/view/admin");
        add("/admin/user", AdminUserController.class, "/view/admin/user");
    }
}
