package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_set_prof_tech_post")
public class ProfTechPostSet {

	public ProfTechPostSet() {
	}
	@Id
	@Getter
	@Setter
	private String id;
	/**
	 * 专业技术资格名称
	 */
	@Getter
	@Setter
	private String tecQua;

	/**
	 * 取得资格的途径
	 */
	@Getter
	@Setter
	private String tecQuaWay;
	/**
	 * 取得资格的时间
	 */
	@Getter
	@Setter
	private Date tecQuaTime;
	/**
	 * 专业技术职务
	 */
	@Getter
	@Setter
	private String proSkillDuty;
	/**
	 * 聘任开始时间
	 */
	@Getter
	@Setter
	private Date appointStartTime;
	/**
	 * 聘任终止时间
	 */
	@Getter
	@Setter
	private Date appointEndTime;
	/**
	 * 职务聘任文号
	 */
	@Getter
	@Setter
	private String appointFileNum;
	/**
	 * 职务解聘时间
	 */
	@Getter
	@Setter
	private Date dismissalTime;
	/**
	 * 职务解聘文号
	 */
	@Getter
	@Setter
	private String dismissalFileNum;
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
	 * 分录编号
	 */
	@Getter
	@Setter
	private String entryNum;
	/**
	 * 人员编号
	 */
	@Setter
	@Getter
	private String personId;


}
