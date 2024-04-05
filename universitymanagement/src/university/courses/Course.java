/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.courses;

public class Course {
    private String courseId;
    private String name;
    private int credits;

    public Course(String courseId, String name, int credits) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Name: " + name + ", Credits: " + credits;
    }
}

