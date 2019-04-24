package com.sign_up.pojo;

import java.util.Date;

public class SignUp {
    private Long signUpId;

    private Date signUpTime;

    private String signUpName;

    private String signUpState;

    private String signUpTel;

    private String signUpEmail;

    public Long getSignUpId() {
        return signUpId;
    }

    public void setSignUpId(Long signUpId) {
        this.signUpId = signUpId;
    }

    public Date getSignUpTime() {
        return signUpTime;
    }

    public void setSignUpTime(Date signUpTime) {
        this.signUpTime = signUpTime;
    }

    public String getSignUpName() {
        return signUpName;
    }

    public void setSignUpName(String signUpName) {
        this.signUpName = signUpName == null ? null : signUpName.trim();
    }

    public String getSignUpState() {
        return signUpState;
    }

    public void setSignUpState(String signUpState) {
        this.signUpState = signUpState == null ? null : signUpState.trim();
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
}