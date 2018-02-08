package com.cnenvs.zhonghan.common.route;

import com.cnenvs.zhonghan.index.IndexController;
import com.jfinal.config.Routes;

public class FrontRoutes extends Routes{

    public void config() {
        add("/", IndexController.class, "/view/index");
    }
}
