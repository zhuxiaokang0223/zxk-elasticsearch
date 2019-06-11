package com.zxk.elasticsearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: zhuxiaokang
 * @CreateDate: 2019/1/22 10:54
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        List<Map<String, Object>> roleRows = new ArrayList<Map<String, Object>>();
        Map<String, Object> t1 = new HashMap<String, Object>();
        t1.put("roleId","1");
        t1.put("roleName","知道老师");
        Map<String, Object> t2 = new HashMap<String, Object>();
        t2.put("roleId","2");
        t2.put("roleName","带队老师");
        roleRows.add(t1);
        roleRows.add(t2);
    }
}
