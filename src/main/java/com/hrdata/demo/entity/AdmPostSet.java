package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="tb_set_adm_post")
public class AdmPostSet implements Serializable{

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


    /*行政职务类别*/
    @Getter
    @Setter
    private String admPostType;


    /*职务名称（树型结构）*/
    @Getter
    @Setter
    private String postName;


    /*任职时间*/
    @Getter
    @Setter
    private Date postTime;


    /*任本级时间*/
    @Getter
    @Setter
    private Date sameLevelTime;


    /*任职方式*/
    @Getter
    @Setter
    private String postWay;

    /*职务级别*/
    @Getter
    @Setter
    private String postLevel;


    /*任职文号*/
    @Getter
    @Setter
    private String postFileNum;

    /*任职单位*/
    @Getter
    @Setter
    private String postUnit;

    /*免职日期*/
    @Getter
    @Setter
    private Date removalTime;

    /*降职日期*/
    @Getter
    @Setter
    private Date demoteTime;

    /*免职原因*/
    @Getter
    @Setter
    private String removalCause;

    /*免职原因*/
    @Getter
    @Setter
    private String demoteCause;

    /*免（降）职文号*/
    @Getter
    @Setter
    private String removalFileNum;

    /*降职文号*/
    @Getter
    @Setter
    private String demoteFileNum;

    /*职务变动类型*/
    @Getter
    @Setter
    private String postChangeType;

}
