package com.student.pojo;

public class Student {
    private Long studentId;

    private String studentName;

    private String studentTel;

    private String studentPassword;

    private String studentIntrest;

    private String studentEmail;

    private Boolean studentState;

    private String studentImg;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentTel() {
        return studentTel;
    }

    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel == null ? null : studentTel.trim();
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getStudentIntrest() {
        return studentIntrest;
    }

    public void setStudentIntrest(String studentIntrest) {
        this.studentIntrest = studentIntrest == null ? null : studentIntrest.trim();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    public Boolean getStudentState() {
        return studentState;
    }

    public void setStudentState(Boolean studentState) {
        this.studentState = studentState;
    }

    public String getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(String studentImg) {
        this.studentImg = studentImg == null ? null : studentImg.trim();
    }

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentTel=" + studentTel
				+ ", studentPassword=" + studentPassword + ", studentIntrest=" + studentIntrest + ", studentEmail="
				+ studentEmail + ", studentState=" + studentState + ", studentImg=" + studentImg + "]";
	}
    
    
}