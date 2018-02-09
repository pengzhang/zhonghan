package com.tmtget.zhonghan.admin.user;

import com.tmtget.zhonghan.common.controller.BaseController;

public class AdminUserController extends BaseController {

    static AdminUserService service = new AdminUserService();

    public void index(){
        render("index.html");
    }

    public void list(){
        int page = getParaToInt("page", 1);
        int size = getParaToInt("limit", 10);
        renderPageForLayUI(service.paginate(page, size));
    }

}
