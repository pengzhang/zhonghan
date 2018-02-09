package com.tmtget.zhonghan.common.route;

import com.tmtget.zhonghan.index.IndexController;
import com.jfinal.config.Routes;

public class FrontRoutes extends Routes{

    public void config() {
        add("/", IndexController.class, "/view/index");
    }
}
