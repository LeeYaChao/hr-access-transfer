package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "tb_set_pol_sta")
public class PolStaSet  implements Serializable {

	public PolStaSet() {
	}
	@Id
	@Getter
	@Setter
	private String id;
	/**
	 * 政治面貌
	 */
	@Getter
	@Setter
	private String polStaName;
	/**
	 * 参加时间
	 */
	@Getter
	@Setter
	private Date joinTime;
	/**
	 * 当时所在单位
	 */
	@Getter
	@Setter
	private String noformalJoinUnit;
	/**
	 * 介绍人1姓名
	 */
	@Getter
	@Setter
	private String introducer1;
	/**
	 * 介绍人2姓名
	 */
	@Getter
	@Setter
	private String introducer2;
	/**
	 * 转正时间
	 */
	@Getter
	@Setter
	private Date formalJoinTime;
	/**
	 * 异常类型
	 */
	@Getter
	@Setter
	private String unusualType;
	/**
	 * 备注
	 */
	@Getter
	@Setter
	private String notes;
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
	@Getter
	@Setter
	private String personId;

}
