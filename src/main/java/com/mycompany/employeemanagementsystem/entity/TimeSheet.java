package com.mycompany.employeemanagementsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "TIMESHEET")
public class TimeSheet {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int timeSheetID;
    String timeTotalHours;
    String timeDate;
    String timeTask;
    String timeDescription;

    public TimeSheet() {
    }

    public TimeSheet(String timeTotalHours, String timeDate, String timeTask, String timeDescription) {
        this.timeTotalHours = timeTotalHours;
        this.timeDate = timeDate;
        this.timeTask = timeTask;
        this.timeDescription = timeDescription;
    }

    public int getTimeSheetID() {
        return timeSheetID;
    }

    public void setTimeSheetID(int timeSheetID) {
        this.timeSheetID = timeSheetID;
    }

    public String getTimeTotalHours() {
        return timeTotalHours;
    }

    public void setTimeTotalHours(String timeTotalHours) {
        this.timeTotalHours = timeTotalHours;
    }

    public String getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(String timeDate) {
        this.timeDate = timeDate;
    }

    public String getTimeTask() {
        return timeTask;
    }

    public void setTimeTask(String timeTask) {
        this.timeTask = timeTask;
    }

    public String getTimeDescription() {
        return timeDescription;
    }

    public void setTimeDescription(String timeDescription) {
        this.timeDescription = timeDescription;
    }
}
