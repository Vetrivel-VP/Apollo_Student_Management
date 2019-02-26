/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apollo_project;

/**
 *
 * @author vetri
 */
public class attendanceRportClass {
    
    private String firstName;
    private String courseName;
    private String staffName;
    private String reference;
    private String presentStatus;
    private String absentStatus;
    private String dateOfAttendance;

    public attendanceRportClass(String firstName, String courseName, String staffName, String reference, String presentStatus, String absentStatus, String dateOfAttendance) {
        this.firstName = firstName;
        this.courseName = courseName;
        this.staffName = staffName;
        this.reference = reference;
        this.presentStatus = presentStatus;
        this.absentStatus = absentStatus;
        this.dateOfAttendance = dateOfAttendance;
    }

   

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPresentStatus() {
        return presentStatus;
    }

    public void setPresentStatus(String presentStatus) {
        this.presentStatus = presentStatus;
    }

    public String getAbsentStatus() {
        return absentStatus;
    }

    public void setAbsentStatus(String absentStatus) {
        this.absentStatus = absentStatus;
    }

    public String getDateOfAttendance() {
        return dateOfAttendance;
    }

    public void setDateOfAttendance(String dateOfAttendance) {
        this.dateOfAttendance = dateOfAttendance;
    }
    
    
    
}
