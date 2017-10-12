package com.jarjune.service.impl;

import com.jarjune.service.IndexService;
import com.jarjune.utils.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class IndexServiceImpl implements IndexService {

    @Autowired
    MapUtil mapUtil;
    public Map getMap() {
        Map map = new MapUtil().getMap();
        map.put("jarjune1", "test1");
        return map;
    }
}
