package com.test.gradle.serviceimpl;

import com.test.gradle.dao.IndexDao;
import com.test.gradle.daoimpl.IndexDaoImpl;
import com.test.gradle.entity.Index;
import com.test.gradle.service.IndexService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.net.IDN;

/**
 * Created by daiya on 2017/8/28.
 */
public class IndexServiceImpl implements IndexService{
    private static IndexDao indexDao=new IndexDaoImpl();
    public Index create(Index index){
        return indexDao.create(index);
    }
}
