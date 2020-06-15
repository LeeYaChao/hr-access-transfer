package com.hrdata.demo.service;

import com.hrdata.demo.entity.WorkersResumeSet;
import com.hrdata.demo.repository.WorkersResumeSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:WorkersResumeSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:35</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class WorkersResumeSetService {

    @Autowired
    WorkersResumeSetRepository workersResumeSetRepository;

    @Transactional
    public boolean save(List<WorkersResumeSet> workesTechLevelSets){
        List<WorkersResumeSet> list = workersResumeSetRepository.save(workesTechLevelSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * 岗位管理子集
     * @param workersResumeSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<WorkersResumeSet> changeToMysql(List<WorkersResumeSet> workersResumeSets, ResultSet rst, String personType) throws SQLException{
        WorkersResumeSet e = new WorkersResumeSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setStartTime(rst.getDate("A1905"));
        e.setEndTime(rst.getDate("A1910"));
        e.setWorkAge(rst.getInt("A1913"));
        e.setWorkUnit(rst.getString("A1915"));
        e.setWorkContentOrPost(rst.getString("A1920"));
        e.setVouchers(rst.getString("A1925"));
        e.setInterruptWorkAgeFlag(rst.getString("A1926"));
        e.setInterruptWorkAgeStartDate(rst.getDate("A1927"));
        e.setInterruptWorkAgeEndDate(rst.getDate("S1901"));
        e.setNotes(rst.getString("A1928"));
        workersResumeSets.add(e);
        return workersResumeSets;
    }
}
