package com.hcl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demandmaster")
public class SubmitDemand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int demandId;
	private int userId;
	private String clusterName;
	private String programName;
	private String demandType;
	private String location;
	private String city;
	private String vzBusinessUnit;
	private String vzDirector;
	private String vzAD;
	private String vzHiringManager;
	private String SOWType;
	private int SOWNumber;
	private int AttritionReplacementEmpcode;
	private String position;
	private String band;
	private String newRole;
	private String CDCCnPrem;
	private String CustomerInterview;
	private String PrimarySkills;
	private String SkillCategory;
	private String SkillBucket;
	private String FulfillmentType;
	private String FulfillmentTimeline;
	private int NumberOfPosition;
	private String Priority;
	private int JdId;
	private String DetailedJobDescription;
	private String SCCName;
	private float BuyRate;
	private float SellRate;
	private int SRNumber;
	public int getDemandId() {
		return demandId;
	}
	public void setDemandId(int demandId) {
		this.demandId = demandId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDemandType() {
		return demandType;
	}
	public void setDemandType(String demandType) {
		this.demandType = demandType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getVzBusinessUnit() {
		return vzBusinessUnit;
	}
	public void setVzBusinessUnit(String vzBusinessUnit) {
		this.vzBusinessUnit = vzBusinessUnit;
	}
	public String getVzDirector() {
		return vzDirector;
	}
	public void setVzDirector(String vzDirector) {
		this.vzDirector = vzDirector;
	}
	public String getVzAD() {
		return vzAD;
	}
	public void setVzAD(String vzAD) {
		this.vzAD = vzAD;
	}
	public String getVzHiringManager() {
		return vzHiringManager;
	}
	public void setVzHiringManager(String vzHiringManager) {
		this.vzHiringManager = vzHiringManager;
	}
	public String getSOWType() {
		return SOWType;
	}
	public void setSOWType(String sOWType) {
		SOWType = sOWType;
	}
	public int getSOWNumber() {
		return SOWNumber;
	}
	public void setSOWNumber(int sOWNumber) {
		SOWNumber = sOWNumber;
	}
	public int getAttritionReplacementEmpcode() {
		return AttritionReplacementEmpcode;
	}
	public void setAttritionReplacementEmpcode(int attritionReplacementEmpcode) {
		AttritionReplacementEmpcode = attritionReplacementEmpcode;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getNewRole() {
		return newRole;
	}
	public void setNewRole(String newRole) {
		this.newRole = newRole;
	}
	public String getCDCCnPrem() {
		return CDCCnPrem;
	}
	public void setCDCCnPrem(String cDCCnPrem) {
		CDCCnPrem = cDCCnPrem;
	}
	public String getCustomerInterview() {
		return CustomerInterview;
	}
	public void setCustomerInterview(String customerInterview) {
		CustomerInterview = customerInterview;
	}
	public String getPrimarySkills() {
		return PrimarySkills;
	}
	public void setPrimarySkills(String primarySkills) {
		PrimarySkills = primarySkills;
	}
	public String getSkillCategory() {
		return SkillCategory;
	}
	public void setSkillCategory(String skillCategory) {
		SkillCategory = skillCategory;
	}
	public String getSkillBucket() {
		return SkillBucket;
	}
	public void setSkillBucket(String skillBucket) {
		SkillBucket = skillBucket;
	}
	public String getFulfillmentType() {
		return FulfillmentType;
	}
	public void setFulfillmentType(String fulfillmentType) {
		FulfillmentType = fulfillmentType;
	}
	public String getFulfillmentTimeline() {
		return FulfillmentTimeline;
	}
	public void setFulfillmentTimeline(String fulfillmentTimeline) {
		FulfillmentTimeline = fulfillmentTimeline;
	}
	public int getNumberOfPosition() {
		return NumberOfPosition;
	}
	public void setNumberOfPosition(int numberOfPosition) {
		NumberOfPosition = numberOfPosition;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public int getJdId() {
		return JdId;
	}
	public void setJdId(int jdId) {
		JdId = jdId;
	}
	public String getDetailedJobDescription() {
		return DetailedJobDescription;
	}
	public void setDetailedJobDescription(String detailedJobDescription) {
		DetailedJobDescription = detailedJobDescription;
	}
	public String getSCCName() {
		return SCCName;
	}
	public void setSCCName(String sCCName) {
		SCCName = sCCName;
	}
	public float getBuyRate() {
		return BuyRate;
	}
	public void setBuyRate(float buyRate) {
		BuyRate = buyRate;
	}
	public float getSellRate() {
		return SellRate;
	}
	public void setSellRate(float sellRate) {
		SellRate = sellRate;
	}
	public int getSRNumber() {
		return SRNumber;
	}
	public void setSRNumber(int sRNumber) {
		SRNumber = sRNumber;
	}
}
