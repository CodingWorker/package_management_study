package com.test.gradle.controller;

import com.test.gradle.entity.Index;
import com.test.gradle.service.IndexService;
import com.test.gradle.serviceimpl.IndexServiceImpl;

/**
 * Created by daiya on 2017/8/28.
 */
public class IndexController {
    private static IndexService indexService = new IndexServiceImpl();
    public String create(int page,int size){
        Index index=new Index();
        index.setPage(page);
        index.setSize(size);

        Index newIndex = indexService.create(index);
        return newIndex.toString();
    }
}
