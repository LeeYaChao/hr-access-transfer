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
import java.util.UUID;

@Slf4j
@Service
public class PersonAllService {


    @Autowired
    PersonSetRepository personSetRepository;

    @Autowired
    AdmPostSetRepository admPostSetRepository;

    @Autowired
    EduDegSetRepository eduDegSetRepository;

    @Autowired
    PolStaSetRepository polStaSetRepository;

    @Autowired
    ProfTechPostSetRepository profTechPostSetRepository;

    @Transactional
    public boolean saveA01(List<PersonInfoSet> personInfoSets){
        List<PersonInfoSet> list = personSetRepository.save(personInfoSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }

    }
    @Transactional
    public boolean saveA04(List<EduDegSet> eduDegSets){
        List<EduDegSet> list = eduDegSetRepository.save(eduDegSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }

    @Transactional
    public boolean saveA07(List<AdmPostSet> admPostSets){
        List<AdmPostSet> list = admPostSetRepository.save(admPostSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }
    @Transactional
    public boolean saveA10(List<ProfTechPostSet> profTechPostSets){
        List<ProfTechPostSet> list = profTechPostSetRepository.save(profTechPostSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }
    @Transactional
    public boolean saveA22(List<PolStaSet> polStaSets){
        List<PolStaSet> list = polStaSetRepository.save(polStaSets);
        if(list.size()>0){
            return true;
        }else{
            return false;
        }
    }

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

    public List<EduDegSet> changeToMysql04(List<EduDegSet> eduDegSets,ResultSet rst,String personType) throws SQLException {
        EduDegSet e = new EduDegSet();
        e.setId(UUID.randomUUID().toString().replace("-",""));
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
    public List<AdmPostSet> changeToMysql07(List<AdmPostSet> admPostSets,ResultSet rst,String personType) throws SQLException {
        AdmPostSet e = new AdmPostSet();
        e.setId(UUID.randomUUID().toString().replace("-",""));
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
    public List<ProfTechPostSet> changeToMysql10(List<ProfTechPostSet> profTechPostSets,ResultSet rst,String personType) throws SQLException {
        ProfTechPostSet e = new ProfTechPostSet();
        e.setId(UUID.randomUUID().toString().replace("-",""));
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

    public List<PolStaSet> changeToMysql22(List<PolStaSet> polStaSets,ResultSet rst,String personType) throws SQLException {
        PolStaSet e = new PolStaSet();
        e.setId(UUID.randomUUID().toString().replace("-",""));
        e.setCreateTime(new Date());
        e.setUpdateTime(new Date());
        e.setDelFlag(0);
        e.setPersonId(personType+"SS"+rst.getString("S0100"));
        e.setEntryNum(rst.getString("S8888"));
        e.setPolStaName(rst.getString("A2205"));
        e.setJoinTime(rst.getDate("A2210"));
        e.setNoformalJoinUnit(rst.getString("A2215"));
        e.setIntroducer1(rst.getString("A2215"));
        e.setIntroducer2(rst.getString("A2221"));
        e.setFormalJoinTime(rst.getDate("A2225"));
        e.setUnusualType(rst.getString("A2230"));
        e.setNotes(rst.getString("A2235"));
        polStaSets.add(e);
        return polStaSets;
    }

}
