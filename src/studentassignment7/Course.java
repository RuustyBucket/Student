/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentassignment7;

/**
 *
 * @author Andrew
 */
public class Course {
    private String courseName;
    private double credit;
    private double examScore;
    private double assignmentScore;

    public Course() {
        this.courseName = null;
        this.assignmentScore = 0;
        this.credit = 0;
        this.examScore = 0;
    }

    public Course(String courseName, double credit) {
        this.courseName = courseName;
        this.credit = credit;
    }

    public Course(String courseName, double credit, double examScore, double assignmentScore) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }
    
    public Course(Course course) {
        this.assignmentScore = course.assignmentScore;
        this.courseName = course.courseName;
        this.credit = course.credit;
        this.examScore = course.examScore;
    }
    
    /**
     * To calculate the final score of the course
     * @param examScore The exam score, has a weight of 60%
     * @param assignmentScore The assignment score, has a weight of 40%
     * @return the final weighted score for the course
     */
    public double calcFinalScore(double examScore, double assignmentScore) {
        return (examScore * 0.60) + (assignmentScore * 0.40);
    }
    
    /**
     * To check if the course is passed
     * @param calcFinalScore Score needs to be higher than 60 to be a pass
     * @return if the student passed the course
     */
    public boolean isPassed(double calcFinalScore) {
        if (calcFinalScore >= 60)
            return true;
        else
            return false;
    }
    
    public boolean equals(Course course) {
        return this.courseName.equals(course.courseName) &&
                this.credit == course.credit &&
                this.assignmentScore == course.assignmentScore &&
                this.examScore == course.examScore;
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-16s: %s\n", "Course Name", courseName);
        str += String.format("%-16s: %.1f\n", "Credit", credit);
        str += String.format("%-16s: %.1f\n", "Exam Score", examScore);
        str += String.format("%-16s: %.1f\n", "Assignment Score", assignmentScore);
        str += String.format("%-16s: %.1f\n", "Final Score", calcFinalScore
        (examScore, assignmentScore));
        
        return str;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public double getAssignmentScore() {
        return assignmentScore;
    }

    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    }
    
}