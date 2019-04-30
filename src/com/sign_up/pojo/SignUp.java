package com.sign_up.pojo;

import java.util.Date;

public class SignUp {
    private String signUpId;

    private String signUpName;

    private String signUpTel;

    private String signUpEmail;

    private String signUpState;

    private Date signUpTime;

    private Long companyId;

    private Long classId;

    public String getSignUpId() {
        return signUpId;
    }

    public void setSignUpId(String signUpId) {
        this.signUpId = signUpId == null ? null : signUpId.trim();
    }

    public String getSignUpName() {
        return signUpName;
    }

    public void setSignUpName(String signUpName) {
        this.signUpName = signUpName == null ? null : signUpName.trim();
    }

    public String getSignUpTel() {
        return signUpTel;
    }

    public void setSignUpTel(String signUpTel) {
        this.signUpTel = signUpTel == null ? null : signUpTel.trim();
    }

    public String getSignUpEmail() {
        return signUpEmail;
    }

    public void setSignUpEmail(String signUpEmail) {
        this.signUpEmail = signUpEmail == null ? null : signUpEmail.trim();
    }

    public String getSignUpState() {
        return signUpState;
    }

    public void setSignUpState(String signUpState) {
        this.signUpState = signUpState == null ? null : signUpState.trim();
    }

    public Date getSignUpTime() {
        return signUpTime;
    }

    public void setSignUpTime(Date signUpTime) {
        this.signUpTime = signUpTime;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
}