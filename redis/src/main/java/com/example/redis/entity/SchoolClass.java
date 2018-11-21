package com.example.redis.entity;

import java.io.Serializable;
public class SchoolClass implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;// 主键
    private String name;// 班级名称
    private Long businessId;// 机构id
    private int status;// 状态0正常 2删除
    private Long subjectId;// 年级
    private String subjectName;// 年级名称
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
