package com.hrdata.demo.service;

import com.hrdata.demo.entity.ProfTechPostSet;
import com.hrdata.demo.repository.ProfTechPostSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:ProfTechPostSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:27</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class ProfTechPostSetService {

    @Autowired
    ProfTechPostSetRepository profTechPostSetRepository;

    @Transactional
    public boolean save(List<ProfTechPostSet> profTechPostSets){
        List<ProfTechPostSet> list = profTechPostSetRepository.save(profTechPostSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }


    /**
     * 专业技术职务子集
     * @param profTechPostSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<ProfTechPostSet> changeToMysql(List<ProfTechPostSet> profTechPostSets, ResultSet rst, String personType) throws SQLException {
        ProfTechPostSet e = new ProfTechPostSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setTecQua(rst.getString("A1005"));
        e.setTecQuaWay(rst.getString("A1010"));
        e.setTecQuaTime(rst.getDate("A1015"));
        e.setProSkillDuty(rst.getString("A1020"));
        e.setAppointStartTime(rst.getDate("A1025"));
        e.setAppointEndTime(rst.getDate("A1030"));
        e.setAppointFileNum(rst.getString("A1031"));
        e.setDismissalTime(rst.getDate("A1032"));
        e.setDismissalFileNum(rst.getString("A1033"));
        profTechPostSets.add(e);
        return profTechPostSets;
    }
}
