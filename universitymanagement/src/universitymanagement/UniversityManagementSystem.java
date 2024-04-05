/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagement;

/**
 *
 * @author venka
 */
public class UniversityManagementSystem {
    public static void main(String[] args) {
        university.students.Student student1 = new university.students.Student("S001", "siva", 20);
        university.courses.Course course1 = new university.courses.Course("C001", "Java Programming", 3);
        university.faculty.Faculty faculty1 = new university.faculty.Faculty("F001", "surya", "Computer Science");
        System.out.println("Student Details:");
        System.out.println(student1);
        System.out.println("\nCourse Details:");
        System.out.println(course1);
        System.out.println("\nFaculty Details:");
        System.out.println(faculty1);
    }
}
