package com.test.enrollmentModel;

public class Enrollee {

	private String subscriberFlag;
	private RelationshipLkp relationshipLkp;
	private EnrollmentEvents enrollmentEvents;
	private String exchgSubscriberIdentifier;
	private String exchgIndivIdentifier;
	private MemberEntityIdentifierCode memeberEntityIdentifierCode;
	private String memberLastName;
	private String memberFirstName;
	private String memberMiddleName;
	private MemberTobaccoUsageLkp memberTobaccoUsageLkp;
	private HealthCoverage healthCoverage;
	//private MemberReportingCategory memberReportingCategory;
	
	public String getSubscriberFlag() {
		return subscriberFlag;
	}
	public void setSubscriberFlag(String subscriberFlag) {
		this.subscriberFlag = subscriberFlag;
	}
	public RelationshipLkp getRelationshipLkp() {
		return relationshipLkp;
	}
	public void setRelationshipLkp(RelationshipLkp relationshipLkp) {
		this.relationshipLkp = relationshipLkp;
	}
	public EnrollmentEvents getEnrollmentEvents() {
		return enrollmentEvents;
	}
	public void setEnrollmentEvents(EnrollmentEvents enrollmentEvents) {
		this.enrollmentEvents = enrollmentEvents;
	}
	public String getExchgSubscriberIdentifier() {
		return exchgSubscriberIdentifier;
	}
	public void setExchgSubscriberIdentifier(String exchgSubscriberIdentifier) {
		this.exchgSubscriberIdentifier = exchgSubscriberIdentifier;
	}
	public String getExchgIndivIdentifier() {
		return exchgIndivIdentifier;
	}
	public void setExchgIndivIdentifier(String exchgIndivIdentifier) {
		this.exchgIndivIdentifier = exchgIndivIdentifier;
	}
	public MemberEntityIdentifierCode getMemeberEntityIdentifierCode() {
		return memeberEntityIdentifierCode;
	}
	public void setMemeberEntityIdentifierCode(
			MemberEntityIdentifierCode memeberEntityIdentifierCode) {
		this.memeberEntityIdentifierCode = memeberEntityIdentifierCode;
	}
	public String getMemberLastName() {
		return memberLastName;
	}
	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}
	public String getMemberFirstName() {
		return memberFirstName;
	}
	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}
	public String getMemberMiddleName() {
		return memberMiddleName;
	}
	public void setMemberMiddleName(String memberMiddleName) {
		this.memberMiddleName = memberMiddleName;
	}
	public MemberTobaccoUsageLkp getMemberTobaccoUsageLkp() {
		return memberTobaccoUsageLkp;
	}
	public void setMemberTobaccoUsageLkp(MemberTobaccoUsageLkp memberTobaccoUsageLkp) {
		this.memberTobaccoUsageLkp = memberTobaccoUsageLkp;
	}
	public HealthCoverage getHealthCoverage() {
		return healthCoverage;
	}
	public void setHealthCoverage(HealthCoverage healthCoverage) {
		this.healthCoverage = healthCoverage;
	}
}
