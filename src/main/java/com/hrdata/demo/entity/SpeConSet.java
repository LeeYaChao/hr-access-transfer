package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title:SetSpeCon.java</p>
 * <p>Description: 专家情况子集 </p>
 * <p>Copyright: 公共服务与应急管理战略本部 Copyright(c)2017</p>
 * <p>Date:2018年01月17</p>
 */
@Entity
@Table(name = "TB_SET_SPE_CON")
public class SpeConSet implements Serializable {

	public SpeConSet() {
	}
	@Id
	@Getter
	@Setter
	private String id;
	@Getter
	@Setter
	private String personId;

	/**
	 * 专家类别
	 */
	@Getter
	@Setter
	private String specialistType;
	/**
	 * 批准单位名称
	 */
	@Getter
	@Setter
	private String approvedUnit;
	/**
	 * 批准单位级别
	 */
	@Getter
	@Setter
	private String approvedUnitLevel;
	/**
	 * 批准时间
	 */
	@Getter
	@Setter
	private Date approvedTime;
	/**
	 * 享受待遇
	 */
	@Getter
	@Setter
	private Date enjoyTreatment;
	/**
	 * 批准文号
	 */
	@Getter
	@Setter
	private Date approvalNumber;

	/**
	 * 分录编号
	 */
	@Getter
	@Setter
	private String entryNum;
	/**
	 * 创建时间
	 */
	@Getter
	@Setter
	private Date createTime;
	/**
	 * 更新时间
	 */
	@Getter
	@Setter
	private Date updateTime;
	/**
	 * 删除标志
	 */
	@Getter
	@Setter
	private Integer delFlag;

}
