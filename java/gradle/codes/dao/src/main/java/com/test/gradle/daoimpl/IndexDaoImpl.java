package com.test.gradle.daoimpl;

import com.test.gradle.dao.IndexDao;
import com.test.gradle.entity.Index;

/**
 * Created by daiya on 2017/8/28.
 */
public class IndexDaoImpl implements IndexDao{
    @Override
    public Index create(Index index){
        //save to db
        return index;
    }
}
