package com.hrdata.demo.service;

import com.hrdata.demo.entity.WorkesTechLevelSet;
import com.hrdata.demo.repository.WorkesTechLevelSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:WorkesTechLevelSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:30</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class WorkesTechLevelSetService {

    @Autowired
    WorkesTechLevelSetRepository workesTechLevelSetRepository;

    @Transactional
    public boolean save(List<WorkesTechLevelSet> workesTechLevelSets){
        List<WorkesTechLevelSet> list = workesTechLevelSetRepository.save(workesTechLevelSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * 工人技术等级子集
     * @param workesTechLevelSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<WorkesTechLevelSet> changeToMysql(List<WorkesTechLevelSet> workesTechLevelSets, ResultSet rst, String personType) throws SQLException{
        WorkesTechLevelSet e = new WorkesTechLevelSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setWorkTypeName(rst.getString("A1301"));
        e.setGetWorkQuaTime(rst.getDate("A1311"));
        e.setWorkTecQuaLevel(rst.getString("S1350"));
        workesTechLevelSets.add(e);
        return workesTechLevelSets;
    }
}
