package com.test.enrollmentModel;

public class HealthCoverage {

	
	private MaintenanceTypeCode maintenanceTypeCode;
	private InsuranceTypeLkp insuranceTypeLkp;
	private String benefitEffectiveBeginDate;
	private String lastPremiumPaidDate;
	private String classOfContractCode;
		
	public MaintenanceTypeCode getMaintenanceTypeCode() {
		return maintenanceTypeCode;
	}
	public void setMaintenanceTypeCode(MaintenanceTypeCode maintenanceTypeCode) {
		this.maintenanceTypeCode = maintenanceTypeCode;
	}
	public InsuranceTypeLkp getInsuranceTypeLkp() {
		return insuranceTypeLkp;
	}
	public void setInsuranceTypeLkp(InsuranceTypeLkp insuranceTypeLkp) {
		this.insuranceTypeLkp = insuranceTypeLkp;
	}
	public String getBenefitEffectiveBeginDate() {
		return benefitEffectiveBeginDate;
	}
	public void setBenefitEffectiveBeginDate(String benefitEffectiveBeginDate) {
		this.benefitEffectiveBeginDate = benefitEffectiveBeginDate;
	}
	public String getLastPremiumPaidDate() {
		return lastPremiumPaidDate;
	}
	public void setLastPremiumPaidDate(String lastPremiumPaidDate) {
		this.lastPremiumPaidDate = lastPremiumPaidDate;
	}
	public String getClassOfContractCode() {
		return classOfContractCode;
	}
	public void setClassOfContractCode(String classOfContractCode) {
		this.classOfContractCode = classOfContractCode;
	}
}
