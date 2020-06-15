package com.hrdata.demo.service;

import com.hrdata.demo.entity.PositionManageSet;
import com.hrdata.demo.repository.PositionManageSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:PositionManageSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:32</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class PositionManageSetService {

    @Autowired
    PositionManageSetRepository positionManageSetRepository;


    @Transactional
    public boolean save(List<PositionManageSet> positionManageSets){
        List<PositionManageSet> list = positionManageSetRepository.save(positionManageSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 岗位管理子集
     * @param positionManageSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<PositionManageSet> changeToMysql(List<PositionManageSet> positionManageSets, ResultSet rst, String personType) throws SQLException{
        PositionManageSet e = new PositionManageSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setPositionName(rst.getString("S1501"));
        e.setStartTime(rst.getDate("S1502"));
        e.setPositionManageLevel(rst.getString("S1503"));
        e.setSpecTecPos(rst.getString("S1504"));
        e.setAttenPosition(rst.getString("S1505"));
        e.setPositionChangeCause(rst.getString("S1506"));
        positionManageSets.add(e);
        return positionManageSets;
    }
}
