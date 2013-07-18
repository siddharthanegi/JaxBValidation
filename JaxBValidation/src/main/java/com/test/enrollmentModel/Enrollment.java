package com.test.enrollmentModel;

import java.util.Set;

public class Enrollment {

	private String actionCode;
	private String sponsorName;
	private String sponsorEIN;
	private String insurerName;
	private String insurerCMSPlanID;
	private String QTYy;
	private String QTYn;
	private String QTYt;
	private Set<Enrollee> enrollee;
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getSponsorName() {
		return sponsorName;
	}
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	public String getSponsorEIN() {
		return sponsorEIN;
	}
	public void setSponsorEIN(String sponsorEIN) {
		this.sponsorEIN = sponsorEIN;
	}
	public String getInsurerName() {
		return insurerName;
	}
	public void setInsurerName(String insurerName) {
		this.insurerName = insurerName;
	}
	public String getInsurerCMSPlanID() {
		return insurerCMSPlanID;
	}
	public void setInsurerCMSPlanID(String insurerCMSPlanID) {
		this.insurerCMSPlanID = insurerCMSPlanID;
	}
	public String getQTYy() {
		return QTYy;
	}
	public void setQTYy(String qTYy) {
		QTYy = qTYy;
	}
	public String getQTYn() {
		return QTYn;
	}
	public void setQTYn(String qTYn) {
		QTYn = qTYn;
	}
	public String getQTYt() {
		return QTYt;
	}
	public void setQTYt(String qTYt) {
		QTYt = qTYt;
	}
	public Set<Enrollee> getEnrollee() {
		return enrollee;
	}
	public void setEnrollee(Set<Enrollee> enrollee) {
		this.enrollee = enrollee;
	}
}
