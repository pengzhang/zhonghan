package com.tmtget.zhonghan.common.base;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * 基础的Controller层
 * @author zhangpeng
 */
public abstract class BaseController extends Controller {

    public void index(){
        super.render("index.html");
    }

    public void create() {
        super.render("create.html");
    }

    public void modify() {
        super.render("modify.html");
    }

    public abstract void get();

    public abstract void list();

    public abstract void paginate();

    public abstract void save();

    public abstract void update();

    public abstract void delete();

    public abstract void remove();

    public abstract void resume();

    /**
     * 默认封装LayUI格式分页数据
     * @param page
     */

    public void renderPageForLayUI(Page<?> page) {
        renderPageForLayUI(page, 0, "");
    }

    /**
     * 按照封装LayUI格式分页数据
     * @param page
     * @param code
     * @param message
     */
    public void renderPageForLayUI(Page<?> page, int code, String message) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", code);
        result.put("msg", message);
        result.put("count", page.getTotalRow());
        result.put("data", page.getList());
        super.renderJson(result);
    }
}



