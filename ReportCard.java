package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by mihirnewalkar on 11/30/16.
 */

public class ReportCard {

    //Student name
    private String mStudentName;

    //Subject name
    private String mSubject;

    //Subject grade
    private String mGrade;

    //Remarks
    private String mRemark;

    //Create reportCard object of ArrayList type
    private ArrayList<ReportCard> reportCard = new ArrayList<>();

    //Constant
    private static final String remark = "Good Conduct";

    /*
    * Create a new Report Card object
    * @param studentName
    * @param subject
    * @param grade
    * @param remark
     */
    public ReportCard(String studentName, String subject, String grade, String remark)
    {
        mStudentName = studentName;
        mSubject = subject;
        mGrade = grade;
        mRemark = remark;
    }

    //Getters
    public String getStudentName() {
        return mStudentName;
    }

    public String getSubject() {
        return mSubject;
    }

    public String getGrade() {
        return mGrade;
    }

    public String getRemark() {
        return mRemark;
    }

    //Setters
    public void setGrade(String studentName, String subject, String grade, String remark){
        reportCard.add(new ReportCard(studentName,subject,grade,remark));
    }

    //Object toString conversion
    public String getReportCard(){
        return reportCard.toString();
    }

}
