package com.tmtget.zhonghan.common.controller;


import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

import java.util.HashMap;
import java.util.Map;

public class BaseController extends Controller {

    public void renderPageForLayUI(Page<?> page) {
        renderPageForLayUI(page, 0, "");
    }

    /**
     * 按照layUI格式分页获取数据
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



