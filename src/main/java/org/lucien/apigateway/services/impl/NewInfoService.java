package org.lucien.apigateway.services.impl;

import org.lucien.apigateway.daos.INewInfoDao;
import org.lucien.apigateway.models.NewInfo;
import org.lucien.apigateway.services.INewInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
@Service
public class NewInfoService implements INewInfoService {

    @Autowired
    private INewInfoDao newInfoDao;

    @Override
    public int insertNewInfo(NewInfo newInfo) {
        return newInfoDao.insertNewInfo(newInfo);
    }

    @Override
    public int updateNewInfo(NewInfo newInfo) {
        return newInfoDao.updateNewInfo(newInfo);
    }

    @Override
    public NewInfo selectNewInfoById(int nid) {
        return newInfoDao.selectNewInfoById(nid);
    }

    @Override
    public List<NewInfo> selectNewInfoList(String title) {
        return newInfoDao.selectNewInfoList(title);
    }

    @Override
    public List<NewInfo> selectAllNewInfo() {
        return newInfoDao.selectAllNewInfo();
    }
}
