package com.hrdata.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title:SetTecAward.java</p>
 * <p>Description: 专业技术工作获奖子集 </p>
 * <p>Copyright: 公共服务与应急管理战略本部 Copyright(c)2017</p>
 * <p>Date:2018年01月17</p>
 *
 * @author 王勇强 (wangyongq@mail.taiji.com.cn)
 * @version 1.0
 */
@Entity
@Table(name = "TB_SET_TEC_AWARD")
public class TecAwardSet  implements Serializable {

	@Id
	@Getter
	@Setter
	private String id;

	@Getter
	@Setter
	private String personId;
	/**
	 * 获奖时间
	 */
	@Getter
	@Setter
	private Date awardTime;
	/**
	 * 获奖项目名称
	 */
	@Getter
	@Setter
	private String awardProject;
	/**
	 * 奖励名称
	 */
	@Getter
	@Setter
	private String awardName;
	/**
	 * 获奖项目中担任角色
	 */
	@Getter
	@Setter
	private String awardProjectRole;
	/**
	 * 证书编号
	 */
	@Getter
	@Setter
	private String certificateNumber;
	/**
	 * 授奖单位
	 */
	@Getter
	@Setter
	private String prizesUnit;
	/**
	 * 授奖单位级别
	 */
	@Getter
	@Setter
	private String prizesUnitLevel;

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
