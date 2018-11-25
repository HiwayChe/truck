package com.dong.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cheguangai
 * @date 2018/11/25 0025
 */
@Data
public class BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;
}
