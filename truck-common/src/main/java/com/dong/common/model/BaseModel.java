package com.dong.common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cheguangai
 * @date 2018/11/25 0025
 */
public class BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
