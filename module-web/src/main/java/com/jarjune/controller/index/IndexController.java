package com.jarjune.controller.index;

import com.jarjune.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/index")
    @ResponseBody
    public Map index() {
        return indexService.getMap();
    }
}
