package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title:SetPositionManage.java</p>
 * <p>Description: 岗位管理子集 </p>
 * <p>Copyright: 公共服务与应急管理战略本部 Copyright(c)2017</p>
 * <p>Date:2018年01月17</p>

 */
@Entity
@Table(name = "TB_SET_POSITION_MANAGE")
public class PositionManageSet implements Serializable {

	@Id
	@Getter
	@Setter
	private String id;

	/**
	 * 岗位名称
	 */
	@Getter
	@Setter
	private String positionName;
	/**
	 * 岗位开始时间
	 */
	@Getter
	@Setter
	private Date startTime;

	/**
	 * 管理岗位级别
	 */
	@Getter
	@Setter
	private String positionManageLevel;
	/**
	 * 专业技术岗位级别
	 */
	@Getter
	@Setter
	private String specTecPos;
	/**
	 * 工勤岗位级别
	 */
	@Getter
	@Setter
	private String attenPosition;
	/**
	 * 工勤岗位级别
	 */
	@Getter
	@Setter
	private String positionChangeCause;
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
	/**
	 * 人员编号
	 */
	@Getter
	@Setter
	private String personId;

}
