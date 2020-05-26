package com.hrdata.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="tb_set_edu_deg")
public class EduDegSet implements Serializable {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String personId;


    /*分录编码*/
    @Getter
    @Setter
    private String entryNum;


    /*创建时间*/
    @Getter
    @Setter
    private Date createTime;

    /*更新时间*/
    @Getter
    @Setter
    private Date updateTime;

    /*删除标志*/
    @Getter
    @Setter
    private Integer delFlag;

    /*学校性质*/
    @Getter
    @Setter
    private String schoolNature;


    /*学历编码*/
    @Getter
    @Setter
    private String education;

    /*入学时间*/
    @Getter
    @Setter
    private Date enrollmentDate;

    /*毕（肄）业时间*/
    @Getter
    @Setter
    private Date graduateDate;

    /*毕(肄)业学校(院,系)*/
    @Getter
    @Setter
    private String graduateSchool;

    /*所学专业*/
    @Getter
    @Setter
    private String major;


    /*学习形式编码*/
    @Getter
    @Setter
    private String learnForm;


    /*学历证书编号*/
    @Getter
    @Setter
    private String academicCertificate;

    /*学位*/
    @Getter
    @Setter
    private String degree;

    /*学位证书号*/
    @Getter
    @Setter
    private String degCertiNo;

    /*学位授予时间*/
    @Getter
    @Setter
    private String degAwardTime;

    /*学位授予（国家，地区）单位*/
    @Getter
    @Setter
    private String degAwardUnit;

    /*气象类最高学历*/
    @Getter
    @Setter
    private String highestEduWeather;


    /*取得气象类最高学历的学校*/
    @Getter
    @Setter
    private String highestEduWeatherSch;

    /*专业备注*/
    @Getter
    @Setter
    private String majorNotes;


}
