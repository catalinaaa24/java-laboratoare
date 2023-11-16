package classes;

import java.util.ArrayList;

public class Course implements CourseOperations {
    String name;
    String description;
    Professor teacher;
    ArrayList<Student> students;

    public void RemoveStudent (Student student){
        ArrayList<Student> studentsAux = new ArrayList<Student>(0);
        for(int i=0; i<students.size(); i++){
            if(student.getFirstName() != students.get(i).getFirstName()){
                studentsAux.add(students.get(i));
            }
        }
        this.students = new ArrayList<Student>(studentsAux);
    }
    public void UpdateStudent (Student student){
        for(Student s: students){
            if(student.firstName == s.firstName){
                s.firstName = student.firstName;
                s.lastName = student.lastName;
                s.grade = student.grade;
                s.groupNumber = student.groupNumber;
            }
        }
    }
    public void UpdateCourse ( String name , String description){
        this.name = name;
        this.description = description;
    }


    public Course() {
        this.name = "";
        this.description = "";
        this.teacher = new Professor();
        this.students = new ArrayList<Student>(0);
    }

    public Course(String name, String description, Professor teacher , ArrayList<Student> students){
         this.name=name;
         this.description=description;
         this.teacher=teacher;
         this.students=students;
    }
    public void UpdateProfessor(Professor teacher) {
        this.teacher = teacher;
    }
    public void AddStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString(){
        String str = "Course:" + "name=" +name + ", description= " + description + " ,\nTeacher= " + teacher + ",\nStudent:\n ";
        for(Student s: students){
            str += s+" \n";
        }
        return str;
    }
}