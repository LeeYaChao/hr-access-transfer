package com.hrdata.demo.service;

import com.hrdata.demo.entity.EduDegSet;
import com.hrdata.demo.entity.PersonInfoSet;
import com.hrdata.demo.util.AccessDbConnection;
import com.hrdata.demo.util.InitDataListener;
import com.hrdata.demo.util.SetType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Title:BaseFactoryService.java</p >
 * <p>Description: </p >
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date:2020/6/15 11:08</p >
 *
 * @author liyachao (liyac@mail.taiji.com.cn)
 * @version 1.0
 */
@Slf4j
@Service
public class BaseFactoryService {

    @Autowired
    PersonAllService personAllService;
    @Autowired
    EduDegSetService eduDegSetService;
    @Autowired
    AdmPostSetService admPostSetService;
    @Autowired
    ProfTechPostSetService profTechPostSetService;
    @Autowired
    WorkesTechLevelSetService workesTechLevelSetService;
    @Autowired
    PositionManageSetService positionManageSetService;
    @Autowired
    WorkersResumeSetService workersResumeSetService;
    @Autowired
    PolStaSetService polStaSetService;
    @Autowired
    NewWageChangesSetService newWageChangesSetService;
    @Autowired
    SpecialtySetService specialtySetService;


    public void execute(){
        try {
            Connection connection = AccessDbConnection.getConnection();
            Statement sta = connection.createStatement();
            DatabaseMetaData metaData = connection.getMetaData();

            List<SetType> setTypes = Arrays.asList(SetType.values());
            for(SetType setType : setTypes){
                String setCode = setType.getCode();
                for(String personType: InitDataListener.personTypeList){
                    ResultSet tableIsExist = metaData.getTables(null,null,personType+setCode,null);
                    if(tableIsExist.next()){
                        String accessSqlQuery = "select * from "+personType+setCode;
                        ResultSet rst = sta.executeQuery(accessSqlQuery);
                        switch (setCode){
                            case "A01":
                               personAllService.execute(rst,personType);
                               break;
                            case "A04":
                               eduDegSetService.execute(rst,personType);
                                break;
                            case "A07":
                               admPostSetService.execute(rst,personType);
                                break;
                            case "A10":
                               profTechPostSetService.execute(rst,personType);
                                break;
                            case "A13":
                               workesTechLevelSetService.execute(rst,personType);
                                break;
                            case "A15":
                               positionManageSetService.execute(rst,personType);
                                break;
                            case "A19":
                               workersResumeSetService.execute(rst,personType);
                                break;
                            case "A22":
                                polStaSetService.execute(rst,personType);
                                break;
                            case "A55":
                                newWageChangesSetService.execute(rst,personType);
                                break;
                            case "A60":
                                specialtySetService.execute(rst,personType);
                                break;
                        }

                    }
                }
            }

            AccessDbConnection.release(connection,sta);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
