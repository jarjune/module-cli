package com.jarjune.service;

import com.jarjune.utils.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IndexService {

    @Autowired
    MapUtil mapUtil;
    public Map getMap() {
        Map map = mapUtil.getMap();
        map.put("jarjune1", "test1");
        return map;
    }
}
