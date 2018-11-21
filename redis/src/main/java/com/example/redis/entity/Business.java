package com.example.redis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Business implements Serializable{

    private static final long serialVersionUID = 1L;
    private Long id;//id
    private String name;//服务机构名称
    private String info;//一句话简介
    private String area;//省市
    private String address;//地址
    private int status=-1;//0使用中1冻结2已到期
    private String realName;//真实姓名
    private String idCard;//身份证
    private String mobile;//手机号
    private String email;//邮箱
    private Long sysUserId;//管理员id
    private Date createTime;//申请时间
    private Date endTime;//到期时间

    private String province;//
    private String city;//
    private String createTimeStr;//申请时间Str
    private String endTimeStr;//到期时间Str

    private List<Subject> subjectList;


    private int order;//


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


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getRealName() {
		return realName;
	}


	public void setRealName(String realName) {
		this.realName = realName;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getSysUserId() {
		return sysUserId;
	}


	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCreateTimeStr() {
		return createTimeStr;
	}


	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}


	public String getEndTimeStr() {
		return endTimeStr;
	}


	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}


	public List<Subject> getSubjectList() {
		return subjectList;
	}


	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}


	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}

}
