package com.jarjune.model;

import java.util.Date;

public class LogEntity {
    private Integer logId;

    private String logUserName;

    private String logDepartment;

    private Date logCreateTime;

    private String logActionName;

    private Double logRunTime;

    public Double getLogRunTime() {
        return logRunTime;
    }

    public void setLogRunTime(Double logRunTime) {
        this.logRunTime = logRunTime;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogUserName() {
        return logUserName;
    }

    public void setLogUserName(String logUserName) {
        this.logUserName = logUserName;
    }

    public String getLogDepartment() {
        return logDepartment;
    }

    public void setLogDepartment(String logDepartment) {
        this.logDepartment = logDepartment;
    }

    public Date getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(Date logCreateTime) {
        this.logCreateTime = logCreateTime;
    }

    public String getLogActionName() {
        return logActionName;
    }

    public void setLogActionName(String logActionName) {
        this.logActionName = logActionName;
    }
}