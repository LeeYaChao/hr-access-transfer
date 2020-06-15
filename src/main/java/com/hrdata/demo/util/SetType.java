package com.hrdata.demo.util;

import lombok.Getter;

public enum SetType {

    PERSONINFO("A01","人员基本情况"),
    EDUDEGSET("A04","学历及学位子集"),
    ADMPOSTSET("A07","行政(党派,社团)职务子集"),
    PROFTECHPOSTSET("A10","专业技术职务子集"),
    WORKESTECHLEVELSET("A13","工人技术等级子集"),
    POSITIONMANAGESET("A15","岗位管理子集"),
    WORKERSRESUMESET("A19","工作简历子集"),
    POLSTASET("A22","政治面貌子集"),
    NEWWAGECHANGESSET("A55","新工资变动子集"),
    SPECIALTYSET("A60","语言,计算机等特长子集"),
    TRAINWAYSET("A62","教育培训子集"),
    REWPUNSET("A63","奖励及惩罚子集"),
    RETIREDINFSET("A64","离退休基本情况"),
    ASSESSSET("A65","考核(考察)子集"),
    CADRERESSET("A67","后备干部子集"),
    SPECONSET("A70","专家情况子集"),
    FAMSOCRELSET("A79","家庭成员及主要社会关系"),
    INSURANCESET("A81","保险子集"),
    GOABROADSET("A82","出国(出境)子集"),
    TECAWARDSET("A83","专业技术工作获奖"),
    HARDSTATIONSET("A84","艰边艰台子集"),
    TOTALWAGEBILLSET("A85","工资总额子集");
//        ("B01","单位基本情况"),
//        ("B07","机构编制子集"),
//        ("B11","各种保险单位缴费比例");


    SetType(String code, String value) {
        this.code = code;
        this.value = value;
    }
    @Getter
    private String code;

    @Getter
    private String value;
    /**
     * ("A01","人员基本情况
     * ("A04","学历及学位子集
     * ("A07","行政(党派,社团)职务子集
     * ("A10","专业技术职务子集
     * ("A13","工人技术等级子集
     * ("A15","岗位管理子集
     * ("A19","工作简历子集
     * ("A22","政治面貌子集
     * ("A55","新工资变动子集
     * ("A60","语言,计算机等特长子集
     * ("A62","教育培训子集
     * ("A63","奖励及惩罚子集
     * ("A64","离退休基本情况
     * ("A65","考核(考察)子集
     * ("A67","后备干部子集
     * ("A70","专家情况子集
     * ("A79","家庭成员及主要社会关系
     * ("A81","保险子集
     * ("A82","出国(出境)子集
     * ("A83","专业技术工作获奖
     * ("A84","艰边艰台子集
     * ("A85","工资总额子集
     * ("B01","单位基本情况
     * ("B07","机构编制子集
     * ("B11","各种保险单位缴费比例
     */
}
