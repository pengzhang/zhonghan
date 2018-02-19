package com.tmtget.zhonghan.admin.user;

import com.tmtget.zhonghan.common.base.BaseController;
import com.tmtget.zhonghan.service.UserService;

public class AdminUserController extends BaseController {

    static UserService service = new UserService();

    public void search() {
        int page = getParaToInt("page", 1);
        int size = getParaToInt("limit", 10);
        String keyword = getPara("keyword", "");
        renderPageForLayUI(service.search(page, size, keyword));
    }

    public void get() {
        long id = getParaToInt("id");
        renderJson(service.findById(id));
    }

    public void list(){

    }

    public void paginate() {
        int page = getParaToInt("page", 1);
        int size = getParaToInt("limit", 10);
        renderPageForLayUI(service.paginate(page, size));
    }

    public void save() {

    }

    public void update() {

    }

    public void delete() {

    }

    public void remove() {

    }

    public void resume() {

    }

}
