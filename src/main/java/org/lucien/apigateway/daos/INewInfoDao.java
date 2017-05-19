package org.lucien.apigateway.daos;

import org.lucien.apigateway.models.NewInfo;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
public interface INewInfoDao {

    int insertNewInfo(NewInfo newInfo);

    int updateNewInfo(NewInfo newInfo);

    NewInfo selectNewInfoById(int nid);

    List<NewInfo> selectNewInfoList(String title);

    List<NewInfo> selectAllNewInfo();
}
