package com.hrdata.demo.service;

import com.hrdata.demo.entity.*;
import com.hrdata.demo.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


@Slf4j
@Service
public class PersonAllService {


    @Autowired
    PersonSetRepository personSetRepository;


    @Transactional
    public boolean save(List<PersonInfoSet> personInfoSets){
        List<PersonInfoSet> list = personSetRepository.save(personInfoSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }

    }


    /**
     * TB_SET_PERSON_INFO
     * @param personInfoSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<PersonInfoSet> changeToMysql(List<PersonInfoSet> personInfoSets,ResultSet rst,String personType) throws SQLException {
        PersonInfoSet p = new PersonInfoSet();
        p.setId(personType+"SS"+rst.getString("S0100"));
        p.setCreateTime(new Date());
        p.setUpdateTime(new Date());
        p.setDelFlag(0);
        p.setPersonType(personType);
        p.setName(rst.getString("A0101"));
        p.setUsedName(rst.getString("A0104"));
        p.setSex(rst.getString("A0107"));
        p.setUnitName(rst.getString("B0110"));
        p.setDepartment(rst.getString("S0101"));
        p.setBirthday(rst.getDate("A0111"));
        p.setNativePlace(rst.getString("A0114"));
        p.setBirthplace(rst.getString("A0117"));
        p.setNation(rst.getString("A0121"));
        p.setHealthy(rst.getString("A0124"));
        p.setMaritalStatus(rst.getString("A0127"));
        p.setPersonalIdentity(rst.getString("A0131"));
        p.setStartWorkTime(rst.getDate("A0141"));
        p.setJoinSystemTime(rst.getDate("A0144"));
        p.setWorkingYears(rst.getInt("A0151"));
        p.setInterruptWorkingYears(rst.getInt("A0152"));
        p.setRegisteredResidence(rst.getString("A0171"));
        p.setIdNumber(rst.getString("A0177"));
        p.setNonChineseNationality(rst.getString("A0181"));
        p.setAcademicians(rst.getString("A0182"));
        p.setOustandingContributionExpert(rst.getString("A0183"));
        p.setSpecialAllowanceStaff(rst.getString("A0184"));
        p.setMillionsTalents(rst.getString("A0185"));
        p.setPrizeCharge(rst.getString("A0186"));
        p.setFourOneTalents(rst.getString("A0187"));
        p.setDoctoralSupervisor(rst.getString("A0188"));
        p.setVocationalQualification(rst.getString("A0189"));
        p.setEmploymentForm(rst.getString("S0134"));
        p.setJoinSystemReason(rst.getString("S0135"));
        p.setJoinUnitTime(rst.getDate("S0136"));
        p.setJoinUnitReason(rst.getString("S0137"));
        p.setEndowmentNumber(rst.getString("S0138"));
        p.setMedicalNumber(rst.getString("S0139"));
        p.setHousingFundNumber(rst.getString("S0140"));
        p.setEnjoyMedicalCare(rst.getString("S0141"));
        p.setGuardStatus(rst.getString("S0143"));
        p.setFaith(rst.getString("S0146"));
        p.setNotes(rst.getString("S0147"));
        p.setEmployTime(rst.getDate("S0148"));
        p.setStateStartTime(rst.getDate("S0149"));
        p.setPost(rst.getString("S0150"));
        p.setCropCode(rst.getString("S0151"));
        p.setChangeCondition(rst.getString("S0152"));
        p.setAgricultureCensusRegister(rst.getString("S0153"));
        p.setSeq(rst.getInt("S0000"));
        personInfoSets.add(p);
        return personInfoSets;
    }


}
