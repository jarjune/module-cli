package com.jarjune.utils;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MapUtil {
    public Map getMap() {
        Map map = new HashMap();
        map.put("jarjune", "test");
        return map;
    }
}
