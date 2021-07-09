package com.youjia.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaoyuan
 */
@Data
@Entity
public class Blog implements Serializable {

	@Id
	private Long id;
	@Column(nullable = false, unique = true, length = 32)
	private String blogTitle;

	private String blogContent;

	private Date blogDate;

	private Integer isDeleted;
}
