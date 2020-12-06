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
public class Student {
    private String name;
    private String gender;
    private String email;
    Course course1;
    Course course2;
    Course course3;

    public Student() {
        this.name = null;
        this.gender = null;
        this.email = null;
        this.course1 = null;
        this.course2 = null;
        this.course3 = null;
    }

    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public Student(String name, String gender, String email, String course1, String course2, String course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
    
    public Student(Student student) {
        this.name = student.name;
        this.gender = student.gender;
        this.email = student.email;
        this.course1 = student.course1;
        this.course2 = student.course2;
        this.course3 = student.course3;
    }
    
    /**
     * To calculate the amount of passed courses
     * @return the amount of passed courses
     */
    public int calcPassedCourseNum() {
        int passedCourses = 0;
        
        if (isPassed(course1))
            ++passedCourses;
        if (isPassed(course2))
            ++passedCourses;
        if(isPassed(course3))
            ++passedCourses;
        
        return passedCourses;
    }
    
    /**
     * To calculate the total amount of credits gained from the passed courses
     * @return the total credits gained
     */
    public double calcTotalCredit() {
        int totalCredit = 0;
        
        if (course1)
            
        return totalCredit;
    }
    
    /**
     * To check if the email is valid
     * @return if the email is valid
     */
    public boolean isEmailValid() {
        if (email.contains("@") && email.contains(".")) {
            if (email.indexOf(".") > email.indexOf("@"))
                if (email.indexOf("@") == 0 && email.indexOf(".") == email.length()
                        && (email.indexOf("@") + 1) != email.indexOf("."))
                    if(email.length() < 320)    
                        return true;
        }
        
        return false;
    }
    
    public boolean equals(Student student) {
        return this.name.equals(student.name) &&
                this.gender.equals(student.gender) &&
                this.email.equals(student.email) &&
                this.course1.equals(student.course1) &&
                this.course2.equals(student.course2) &&
                this.course3.equals(student.course3);
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-16s: %s\n", "Name", name);
        str += String.format("%-16s: %s\n", "Gender", gender);
        str += String.format("%-16s: %s\n\n", "Email", email);
        str += String.format("%-16s%-28s%-8s%s\n", "Course", "Name", "Credit", "Score");
        str += String.format("--------------------------------------------------");
        str += String.format("%-16s: %-28s%.1-8f%.1f\n", "Course 1", course1, credit, 
                calcFinalScore());
        str += String.format("%-16s: %-28s%.1-8f%.1f\n", "Course 2", course2, credit, 
                calcFinalScore());
        str += String.format("%-16s: %-28s%.1-8f%.1f\n\n", "Course 3", course3, credit,
                calcFinalScore());
        str += String.format("%-16s: %d\n", "Passed Courses", calcPassedCourseNum());
        str += String.format("%-16s: %.1f\n", "Total Credits", calcTotalCredits());
        
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

}