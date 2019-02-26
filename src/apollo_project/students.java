/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apollo_project;

/**
 *
 * @author Apollo
 */
public class students {
    
   
    private String firstName;
    private String fathersName;
    private String mobile;
    private String dob;
    private String course;
    private String reference ;
    private String courseTime;
    private String duration;
    private String staffname;
    private String courseStatus;
    private String certificateStatus;
    private String certificateDate;

    public students(String firstName, String fathersName, String mobile, String dob, String course, String reference, String courseTime, String duration, String staffname, String courseStatus, String certificateStatus, String certificateDate) {
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.mobile = mobile;
        this.dob = dob;
        this.course = course;
        this.reference = reference;
        this.courseTime = courseTime;
        this.duration = duration;
        this.staffname = staffname;
        this.courseStatus = courseStatus;
        this.certificateStatus = certificateStatus;
        this.certificateDate = certificateDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    
       
}
