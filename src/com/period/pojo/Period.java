package com.period.pojo;

public class Period {
    private Integer periodId;

    private Integer classesId;

    private String periodTitle;

    private String periodResourse;

    private Integer periodIndex;

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public String getPeriodTitle() {
        return periodTitle;
    }

    public void setPeriodTitle(String periodTitle) {
        this.periodTitle = periodTitle == null ? null : periodTitle.trim();
    }

    public String getPeriodResourse() {
        return periodResourse;
    }

    public void setPeriodResourse(String periodResourse) {
        this.periodResourse = periodResourse == null ? null : periodResourse.trim();
    }

    public Integer getPeriodIndex() {
        return periodIndex;
    }

    public void setPeriodIndex(Integer periodIndex) {
        this.periodIndex = periodIndex;
    }

	@Override
	public String toString() {
		return "Period [periodId=" + periodId + ", classesId=" + classesId + ", periodTitle=" + periodTitle
				+ ", periodResourse=" + periodResourse + ", periodIndex=" + periodIndex + "]";
	}
    
    
}