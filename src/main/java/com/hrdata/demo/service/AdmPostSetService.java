package com.hrdata.demo.service;

import com.hrdata.demo.entity.AdmPostSet;
import com.hrdata.demo.entity.PersonInfoSet;
import com.hrdata.demo.repository.AdmPostSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:AdmPostSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:29</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class AdmPostSetService {

    @Autowired
    AdmPostSetRepository admPostSetRepository;

    @Transactional
    public boolean save(List<AdmPostSet> admPostSets){
        List<AdmPostSet> list = admPostSetRepository.save(admPostSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 根据access库结果集执行插入mysql
     * @param rst
     * @param personType
     * @throws SQLException
     */
    public void execute(ResultSet rst,String personType) throws SQLException {
        int count = 0;
        List<AdmPostSet> admPostSets = new ArrayList<>();
        while (rst.next()){
            count++;
            admPostSets = this.changeToMysql(admPostSets,rst,personType);
            if(count==100){
                this.save(admPostSets);
                admPostSets.clear();
                count=0;
            }
        }
        if(count>0){
            this.save(admPostSets);
        }
    }

    /**
     * TB_SET_ADM_POST
     * @param admPostSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<AdmPostSet> changeToMysql(List<AdmPostSet> admPostSets, ResultSet rst, String personType) throws SQLException {
        AdmPostSet e = new AdmPostSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setAdmPostType(rst.getString("A0701"));
        e.setPostName(rst.getString("A0702"));
        e.setPostTime(rst.getDate("A0703"));
        e.setSameLevelTime(rst.getDate("A0717"));
        e.setPostWay(rst.getString("A0705"));
        e.setPostLevel(rst.getString("A0707"));
        e.setPostFileNum(rst.getString("A0706"));
        e.setPostUnit(rst.getString("A0708"));
        e.setRemovalTime(rst.getDate("A0710"));
        e.setDemoteTime(rst.getDate("A0713"));
        e.setRemovalCause(rst.getString("A0711"));
        e.setDemoteCause(rst.getString("A0714"));
        e.setRemovalFileNum(rst.getString("A0715"));
        e.setDemoteFileNum(rst.getString("S0701"));
        e.setPostChangeType(rst.getString("A0716"));
        admPostSets.add(e);
        return admPostSets;
    }
}
