package com.hrdata.demo.service;

import com.hrdata.demo.entity.PolStaSet;
import com.hrdata.demo.repository.PolStaSetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>Title:PolStaSetService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 9:37</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Service
@Slf4j
public class PolStaSetService {


    @Autowired
    PolStaSetRepository polStaSetRepository;


    @Transactional
    public boolean save(List<PolStaSet> polStaSets){
        List<PolStaSet> list = polStaSetRepository.save(polStaSets);
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
        List<PolStaSet> polStaSets = new ArrayList<>();
        while (rst.next()){
            count++;
            polStaSets = this.changeToMysql(polStaSets,rst,personType);
            if(count==100){
                this.save(polStaSets);
                polStaSets.clear();
                count=0;
            }
        }
        if(count>0){
            this.save(polStaSets);
        }
    }

    /**
     * TB_SET_POL_STA
     * @param polStaSets
     * @param rst
     * @param personType
     * @return
     * @throws SQLException
     */
    public List<PolStaSet> changeToMysql(List<PolStaSet> polStaSets, ResultSet rst, String personType) throws SQLException {
        PolStaSet e = new PolStaSet();
        e.setId(personType+"SS"+rst.getString("S0100")+"-"+rst.getString("S8888"));
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
