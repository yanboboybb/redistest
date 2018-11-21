package com.example.redis.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Subject implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long parentId=0L;//父id
    private String name;//专业名称
    private int layer;//1,2,3级
    private int sort;//排序
    private int status;//状态0:正常 2删除
    private Long businessId;//状态0:正常 2删除
    private String type;//类型 course课程 library文库 book图书
    public Map<Long,Subject> childSubjectMap;
    private List<String> names;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Map<Long, Subject> getChildSubjectMap() {
		return childSubjectMap;
	}
	public void setChildSubjectMap(Map<Long, Subject> childSubjectMap) {
		this.childSubjectMap = childSubjectMap;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public List<SchoolClass> getSchoolClassList() {
		return schoolClassList;
	}
	public void setSchoolClassList(List<SchoolClass> schoolClassList) {
		this.schoolClassList = schoolClassList;
	}
	public int getSubjectLevel() {
		return subjectLevel;
	}
	public void setSubjectLevel(int subjectLevel) {
		this.subjectLevel = subjectLevel;
	}
	private List<SchoolClass> schoolClassList;
    private int subjectLevel;
}
