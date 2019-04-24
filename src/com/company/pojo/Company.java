package com.company.pojo;

public class Company {
    private Long companyId;

    private String companyName;

    private String companyCity;

    private String companyContacts;

    private String companyTel;

    private String companyEmail;

    private String companyLabels;

    private String companyPassword;

    private Integer companyState;

    private String companyDesc;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity == null ? null : companyCity.trim();
    }

    public String getCompanyContacts() {
        return companyContacts;
    }

    public void setCompanyContacts(String companyContacts) {
        this.companyContacts = companyContacts == null ? null : companyContacts.trim();
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel == null ? null : companyTel.trim();
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    public String getCompanyLabels() {
        return companyLabels;
    }

    public void setCompanyLabels(String companyLabels) {
        this.companyLabels = companyLabels == null ? null : companyLabels.trim();
    }

    public String getCompanyPassword() {
        return companyPassword;
    }

    public void setCompanyPassword(String companyPassword) {
        this.companyPassword = companyPassword == null ? null : companyPassword.trim();
    }

    public Integer getCompanyState() {
        return companyState;
    }

    public void setCompanyState(Integer companyState) {
        this.companyState = companyState;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc == null ? null : companyDesc.trim();
    }

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyCity=" + companyCity
				+ ", companyContacts=" + companyContacts + ", companyTel=" + companyTel + ", companyEmail="
				+ companyEmail + ", companyLabels=" + companyLabels + ", companyPassword=" + companyPassword
				+ ", companyState=" + companyState + ", companyDesc=" + companyDesc + "]";
	}
    
    
}