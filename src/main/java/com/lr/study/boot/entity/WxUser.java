package com.lr.study.boot.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 微信用户信息
 */
@Entity
@Table(name = "wx_user",schema="DFZC_BXMC")
public class WxUser implements Serializable{
	private static final long serialVersionUID = 2099112404699281372L;
	@SequenceGenerator(name = "generator", sequenceName = "SEQ_WX_USER", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
	@Column(name = "id", unique = true, nullable = false, precision = 12, scale = 0)
	private Long ID;//主键ID
	@Column(name="account_num",length=11)//登录账户
	private Long accountNum;
	@Column(name="PASSWORD",length=50)
	private String password;
	@Column(name="CREATE_DATE")
	private Date createDate;
	@Column(name="STATUS",length=10)
	private String status;
	@Column(name="CAPTCHA",length=6)
	private Long captcha;
	@Column(name="PARTY_ID",length=12)
	private Long partyId;
	@Column(name="LAST_LOGIN_TIME")
	private Date lastLoginTime;
	@Column(name="WEIXIN_NICK_NAME",length=50)
	private String weixinNickName;
	@Column(name="WEIXIN_OPENID",length=50)
	private String weixinOpenid;
	@Column(name="WEIXIN_FACE_URL",length=500)
	private String weixinFaceUrl;
	@Column(name="LOGIN_TIME",length=500)
	private Date loginTime;
	@Column(name="LOGIN_IP",length=50)
	private String loginIp;
	@Column(name="LAST_LOGIN_IP",length=50)
	private String lastLoginIp;
	@Column(name="REGISTER_IP",length=50)
	private String registerIp;
	@Column(name="NATURE",length=50)
	private String nature;//1-客户2-代理机构3-代理人
	@Column(name="SALT",length=50)
	private String salt;
	@Column(name="THIRD_PERSON_ID",length=12)
	private Long thirdPersonId;
	@Column(name="THIRD_ORG_Id",length=12)
	private Long thirdOrgId;
	public Long getThirdPersonId() {
		return thirdPersonId;
	}
	public void setThirdPersonId(Long thirdPersonId) {
		this.thirdPersonId = thirdPersonId;
	}

	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getCaptcha() {
		return captcha;
	}
	public void setCaptcha(Long captcha) {
		this.captcha = captcha;
	}
	public Long getPartyId() {
		return partyId;
	}
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getWeixinNickName() {
		return weixinNickName;
	}
	public void setWeixinNickName(String weixinNickName) {
		this.weixinNickName = weixinNickName;
	}
	public String getWeixinOpenid() {
		return weixinOpenid;
	}
	public void setWeixinOpenid(String weixinOpenid) {
		this.weixinOpenid = weixinOpenid;
	}
	public String getWeixinFaceUrl() {
		return weixinFaceUrl;
	}
	public void setWeixinFaceUrl(String weixinFaceUrl) {
		this.weixinFaceUrl = weixinFaceUrl;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	public String getRegisterIp() {
		return registerIp;
	}
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Long getThirdOrgId() {
		return thirdOrgId;
	}
	public void setThirdOrgId(Long thirdOrgId) {
		this.thirdOrgId = thirdOrgId;
	}

	
}
