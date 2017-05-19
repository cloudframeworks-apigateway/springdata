package org.lucien.apigateway.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.lucien.apigateway.models.NewInfo;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
@Mapper
public interface NewInfoMapper {
    int insertNewInfo(NewInfo newInfo);

    int updateNewInfo(NewInfo newInfo);

    @Select("select nid, title, content from tl_newinfo where nid=#{nid}")
    NewInfo selectNewInfoById(int nid);

    List<NewInfo> selectNewInfoList(String key);

    @Select("select nid, title, content from tl_newinfo")
    List<NewInfo> selectAllNewInfo();
}
