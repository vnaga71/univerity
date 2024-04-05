/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.faculty;

public class Faculty {

    private String facultyId;
    private String name;
    private String department;

    public Faculty(String facultyId, String name, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override

    public String toString() {
        return "Faculty ID: " + facultyId + ", Name: " + name + ", Department: " + department;
    }
}
