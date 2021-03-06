package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title:HardStationSet.java</p>
 * <p>Description: 艰边艰台子集 </p>
 * <p>Copyright: 公共服务与应急管理战略本部 Copyright(c)2017</p>
 * <p>Date:2018年01月16</p>
 */
@Entity
@Table(name="TB_SET_HARD_STATION")
public class HardStationSet implements Serializable {
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

    /*统计时间*/
    @Getter
    @Setter
    private Date statisticstime;

    /*艰苦台站类别*/
    @Getter
    @Setter
    private String stationCategory;

    /*艰苦台站津贴*/
    @Getter
    @Setter
    private String stationAllowance;


    /*艰苦边远地区类别*/
    @Getter
    @Setter
    private String regionCategory;

    /*艰苦边远地区津贴*/
    @Getter
    @Setter
    private String regionAllowance;


    /*浮动工资*/
    @Getter
    @Setter
    private String floatingWage;

    /*艰边发放月次*/
    @Getter
    @Setter
    private Integer stationMonthGrant;

    /*浮动发放月次*/
    @Getter
    @Setter
    private Integer floatingMonthGrant;

    /*艰台发放月次*/
    @Getter
    @Setter
    private Integer stationMonthGrant2;

}
