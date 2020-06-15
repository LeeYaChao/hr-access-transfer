package com.hrdata.demo.service;

import com.hrdata.demo.entity.NewWageChangesSet;
import com.hrdata.demo.repository.NewWageChangesSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:NewWageChangesSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:40</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class NewWageChangesSetService {

    @Autowired
    NewWageChangesSetRepository newWageChangesSetRepository;


    @Transactional
    public boolean save(List<NewWageChangesSet> newWageChangesSets){
        List<NewWageChangesSet> list = newWageChangesSetRepository.save(newWageChangesSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }


    /**
     * TB_SET_NEW_WAGE_CHANGES
     */
    public List<NewWageChangesSet> changeToMysql(List<NewWageChangesSet> newWageChangesSets, ResultSet rst, String personType) throws SQLException {
        NewWageChangesSet e = new NewWageChangesSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setWageSequenceFlag(rst.getString("A5501"));
        e.setCivilServantsWageDuty(rst.getString("A5503"));
        e.setCivilServantsWageDutyNatur(rst.getString("A5506"));
        e.setDutyWage(rst.getString("A5509"));
        e.setDutyWageLevel(rst.getString("A5512"));
        e.setDutyWageGrade(rst.getString("A5515"));
        e.setDutyLevelWage(rst.getString("A5518"));
        e.setOfficeClerkPosition(rst.getString("A5521"));
        e.setOfficeClerkPositionWage(rst.getString("A5524"));
        e.setOfficeClerkWageLevel(rst.getString("A5527"));
        e.setOfficeClerkWageLevelWage(rst.getString("A5530"));
        e.setTecPersonPosition(rst.getString("A5533"));
        e.setTecPersonPositionWage(rst.getString("A5536"));
        e.setTecPersonWageLevel(rst.getString("A5539"));
        e.setTecPersonWageLevelWage(rst.getString("A5542"));
        e.setWorkerPosition(rst.getString("A5545"));
        e.setWorkerPositionWage(rst.getString("A5548"));
        e.setWorkerWageLevel(rst.getString("A5551"));
        e.setWorkerWageLevelWage(rst.getString("A5554"));
        e.setBaseWage(rst.getString("A5557"));
        e.setWagePostDutyTime(rst.getDate("A5560"));
        e.setWagePostDutyYearLimit(rst.getInt("A5563"));
        e.setWageStartTime(rst.getDate("A5566"));
        e.setFullYearPostWage(rst.getString("A5567"));
        e.setFullYearLevelWage(rst.getString("A5568"));
        e.setFullYearNationalSubsidies(rst.getString("A5569"));
        e.setFullYearFormalSubsidies(rst.getString("A5570"));
        e.setFullYearReformSubsidies(rst.getString("A5571"));
        e.setFullYearAwardOther(rst.getString("A5572"));
        e.setFullYearOneAward(rst.getString("A5573"));
        e.setPayMonth(rst.getInt("A5574"));
        e.setAverageMonthlyWage(rst.getString("A5575"));
        e.setFullYearTotalWage(rst.getString("A5576"));
        e.setEnterpriseIncome(rst.getString("A5577"));
        newWageChangesSets.add(e);
        return newWageChangesSets;
    }

}
