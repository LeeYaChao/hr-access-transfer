package com.hrdata.demo;

import com.hrdata.demo.entity.MyLog;
import com.hrdata.demo.entity.PersonInfoSet;
import com.hrdata.demo.repository.LogRepository;
import com.hrdata.demo.service.BaseFactoryService;
import com.hrdata.demo.service.PersonAllService;
import com.hrdata.demo.util.AccessDbConnection;
import com.hrdata.demo.util.InitDataListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    PersonAllService personAllService;

    @Autowired
    AccessDbConnection accessDbConnection;

    @Autowired
    LogRepository logRepository;

    @Autowired
    BaseFactoryService baseFactoryService;


    @Test
    public void contextLoads() {
        try {
            Connection connection = AccessDbConnection.getConnection();
            Statement sta = connection.createStatement();

            DatabaseMetaData metaData = connection.getMetaData();
            //String personType = "ZZ";
            for(String personType: InitDataListener.personTypeList){
                ResultSet tableIsExist = metaData.getTables(null,null,personType+"A01",null);
                if(tableIsExist.next()){
                    String accessSqlQuery = "select * from "+personType+"A01";
                    ResultSet rst = sta.executeQuery(accessSqlQuery);
                    int count = 0;
                    List<PersonInfoSet> personInfoSets = new ArrayList<>();
                    while (rst.next()){
                        count++;
                        personInfoSets = personAllService.changeToMysql(personInfoSets,rst,personType);
                        if(count==100){
                            personAllService.save(personInfoSets);
                            personInfoSets.clear();
                            count=0;
                        }
                    }

                    if(count>0){
                        personAllService.save(personInfoSets);
                    }
                }
           }
            AccessDbConnection.release(connection,sta);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    @Test
//    public void contextLoads2() {
//        try {
//            Connection connection = AccessDbConnection.getConnection();
//            Statement sta = connection.createStatement();
//
//            DatabaseMetaData metaData = connection.getMetaData();
//            //String personType = "ZZ";
//            for(String personType: InitDataListener.personTypeList){
//                ResultSet tableIsExist = metaData.getTables(null,null,personType+"A04",null);
//                if(tableIsExist.next()){
//                    String accessSqlQuery = "select * from "+personType+"A04";
//                    ResultSet rst = sta.executeQuery(accessSqlQuery);
//                    int count = 0;
//                    List<EduDegSet> eduDegSets = new ArrayList<>();
//                    while (rst.next()){
//                        count++;
//                        eduDegSets = personAllService.changeToMysql(eduDegSets,rst,personType);
//                        if(count==100){
//                            personAllService.save(eduDegSets);
//                            eduDegSets.clear();
//                            count=0;
//                        }
//                    }
//
//                    if(count>0){
//                        personAllService.saveA04(eduDegSets);
//                    }
//                }
//            }
//            AccessDbConnection.release(connection,sta);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void contextLoads3() {
//        try {
//            Connection connection = AccessDbConnection.getConnection();
//            Statement sta = connection.createStatement();
//
//            DatabaseMetaData metaData = connection.getMetaData();
//            //String personType = "ZZ";
//            for(String personType: InitDataListener.personTypeList){
//                ResultSet tableIsExist = metaData.getTables(null,null,personType+"A07",null);
//                if(tableIsExist.next()){
//                    String accessSqlQuery = "select * from "+personType+"A07";
//                    ResultSet rst = sta.executeQuery(accessSqlQuery);
//                    int count = 0;
//                    List<AdmPostSet> admPostSets = new ArrayList<>();
//                    while (rst.next()){
//                        count++;
//                        admPostSets = personAllService.changeToMysql07(admPostSets,rst,personType);
//                        if(count==100){
//                            personAllService.saveA07(admPostSets);
//                            admPostSets.clear();
//                            count=0;
//                        }
//                    }
//
//                    if(count>0){
//                        personAllService.saveA07(admPostSets);
//                    }
//                }
//            }
//            AccessDbConnection.release(connection,sta);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void contextLoads4() {
//        try {
//            Connection connection = AccessDbConnection.getConnection();
//            Statement sta = connection.createStatement();
//
//            DatabaseMetaData metaData = connection.getMetaData();
//            //String personType = "ZZ";
//            for(String personType: InitDataListener.personTypeList){
//                ResultSet tableIsExist = metaData.getTables(null,null,personType+"A10",null);
//                if(tableIsExist.next()){
//                    String accessSqlQuery = "select * from "+personType+"A10";
//                    ResultSet rst = sta.executeQuery(accessSqlQuery);
//                    int count = 0;
//                    List<ProfTechPostSet> profTechPostSets = new ArrayList<>();
//                    while (rst.next()){
//                        count++;
//                        profTechPostSets = personAllService.changeToMysql10(profTechPostSets,rst,personType);
//                        if(count==100){
//                            personAllService.saveA10(profTechPostSets);
//                            profTechPostSets.clear();
//                            count=0;
//                        }
//                    }
//
//                    if(count>0){
//                        personAllService.saveA10(profTechPostSets);
//                    }
//                }
//            }
//            AccessDbConnection.release(connection,sta);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void contextLoads5() {
//        try {
//            Connection connection = AccessDbConnection.getConnection();
//            Statement sta = connection.createStatement();
//
//            DatabaseMetaData metaData = connection.getMetaData();
//            //String personType = "ZZ";
//            for(String personType: InitDataListener.personTypeList){
//                ResultSet tableIsExist = metaData.getTables(null,null,personType+"A22",null);
//                if(tableIsExist.next()){
//                    String accessSqlQuery = "select * from "+personType+"A22";
//                    ResultSet rst = sta.executeQuery(accessSqlQuery);
//                    int count = 0;
//                    List<PolStaSet> polStaSets = new ArrayList<>();
//                    while (rst.next()){
//                        count++;
//                        polStaSets = personAllService.changeToMysql22(polStaSets,rst,personType);
//                        if(count==100){
//                            personAllService.saveA22(polStaSets);
//                            polStaSets.clear();
//                            count=0;
//                        }
//                    }
//
//                    if(count>0){
//                        personAllService.saveA22(polStaSets);
//                    }
//                }
//            }
//            AccessDbConnection.release(connection,sta);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    @Test
    public void test(){
        /*List<MyLog> list = logRepository.findAll();
        System.out.println(list);*/
        MyLog l = new MyLog();
        l.setLevel("infoqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        l.setMsg("testqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        l.setTs(new Date());
        l.setThread("mainqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        logRepository.save(l);
    }

    @Test
    public void testReverse(){
        baseFactoryService.execute();
    }


}
