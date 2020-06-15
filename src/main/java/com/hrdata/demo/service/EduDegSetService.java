package com.hrdata.demo.service;

import com.hrdata.demo.entity.EduDegSet;
import com.hrdata.demo.repository.EduDegSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:EduDegSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:25</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class EduDegSetService {

    @Autowired
    EduDegSetRepository eduDegSetRepository;


    @Transactional
    public boolean save(List<EduDegSet> eduDegSets){
        List<EduDegSet> list = eduDegSetRepository.save(eduDegSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * TB_SET_EDU_DEG
     * @param eduDegSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<EduDegSet> changeToMysql(List<EduDegSet> eduDegSets, ResultSet rst, String personType) throws SQLException {
        EduDegSet e = new EduDegSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setSchoolNature(rst.getString("A0401"));
        e.setEducation(rst.getString("A0405"));
        e.setEnrollmentDate(rst.getDate("A0407"));
        e.setGraduateDate(rst.getDate("A0408"));
        e.setGraduateSchool(rst.getString("A0409"));
        e.setMajor(rst.getString("A0410"));
        e.setLearnForm(rst.getString("A0412"));
        e.setAcademicCertificate(rst.getString("A0413"));
        e.setDegree(rst.getString("A0414"));
        e.setDegCertiNo(rst.getString("A0415"));
        e.setDegAwardTime(rst.getString("A0416"));
        e.setDegAwardUnit(rst.getString("A0417"));
        e.setHighestEduWeather(rst.getString("S0401"));
        e.setHighestEduWeatherSch(rst.getString("S0402"));
        e.setMajorNotes(rst.getString("S0403"));
        eduDegSets.add(e);
        return eduDegSets;
    }
}
