package org.lucien.apigateway.daos.impl;

import org.lucien.apigateway.daos.INewInfoDao;
import org.lucien.apigateway.mapper.NewInfoMapper;
import org.lucien.apigateway.models.NewInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
@Repository
public class NewInfoDao implements INewInfoDao {

    @Autowired
    private NewInfoMapper newInfoMapper;

    @Override
    public int insertNewInfo(NewInfo newInfo) {
        return newInfoMapper.insertNewInfo(newInfo);
    }

    @Override
    public int updateNewInfo(NewInfo newInfo) {
        return newInfoMapper.updateNewInfo(newInfo);
    }

    @Override
    public NewInfo selectNewInfoById(int nid) {
        return newInfoMapper.selectNewInfoById(nid);
    }

    @Override
    public List<NewInfo> selectNewInfoList(String title) {
        return newInfoMapper.selectNewInfoList(title);
    }

    @Override
    public List<NewInfo> selectAllNewInfo() {
        return newInfoMapper.selectAllNewInfo();
    }
}
