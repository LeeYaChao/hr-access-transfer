package com.hrdata.demo.service;

import com.hrdata.demo.entity.SpecialtySet;
import com.hrdata.demo.repository.SpecialtySetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:SpecialtySetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:42</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class SpecialtySetService {

    @Autowired
    SpecialtySetRepository specialtySetRepository;

    @Transactional
    public boolean save(List<SpecialtySet> specialtySets){
        List<SpecialtySet> list = specialtySetRepository.save(specialtySets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * TB_SET_SPECIALTY
     * SpecialtySet
     */
    public List<SpecialtySet> changeToMysql(List<SpecialtySet> specialtySets, ResultSet rst, String personType) throws SQLException {
        SpecialtySet e = new SpecialtySet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setSpecialties(rst.getString("A6001"));
        e.setSkillLevel(rst.getString("A6002"));
        e.setCertificateName(rst.getString("A6003"));
        e.setCertificateUnit(rst.getString("A6004"));
        e.setCertificateTime(rst.getDate("A6005"));
        e.setNotes(rst.getString("A6006"));
        specialtySets.add(e);
        return specialtySets;
    }
}
