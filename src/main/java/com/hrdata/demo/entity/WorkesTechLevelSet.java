package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title:SetWorkesTechLevel.java</p>
 * <p>Description: 工人技术等级子集 </p>
 * <p>Copyright: 公共服务与应急管理战略本部 Copyright(c)2017</p>
 * <p>Date:2018年01月17</p>
 */
@Entity
@Table(name = "TB_SET_WORKES_TECH_LEVEL")
public class WorkesTechLevelSet implements Serializable {

	public WorkesTechLevelSet() {
	}
	@Id
	@Getter
	@Setter
	private String id;

	@Getter
	@Setter
	private String personId;
	/**
	 * 工种名称
	 */
	@Getter
	@Setter
	private String workTypeName;
	/**
	 * 获得资格时间
	 */
	@Getter
	@Setter
	private Date getWorkQuaTime;
	/**
	 * 工人技术等级
	 */
	@Getter
	@Setter
	private String workTecQuaLevel;

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
