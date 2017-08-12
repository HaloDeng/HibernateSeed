package com.halo.seed.controller;

import com.halo.seed.entity.IndexEntity;
import com.halo.seed.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private IndexService indexService;

    @RequestMapping("/index.do")
    public String index(){
        return "index";
    }

    @RequestMapping("/one.do")
    public String queryOne(@RequestParam String id){
        IndexEntity entity = indexService.getOne(Integer.parseInt(id));
        return "index";
    }

    @RequestMapping("/add.do")
    public String addOne(){
        IndexEntity entity = new IndexEntity();
        entity.setCreateDate(new Date());
        entity.setIndexDesc("new index");
        indexService.addOne(entity);
        return "index";
    }
}
