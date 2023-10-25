package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CourseManager {
    Course[] courses;
    public CourseManager(){
        Connection conn = null;
        courses = new Course[0];
    }

    public void addCourse(Course course){
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        int index = 0;
        for(Course c: courses){
            aux[index++]=c;
        }
        aux[index] = course;
        this.courses = new Course[newLength];
        System.arraycopy(aux, 0, courses, 0 ,newLength);
    }

    public void displayCoursesToConsole(){
        for(Course c: courses){
            System.out.println(c);
        }
    }

    //2.4.2
    public void addStudentToCourse(String cName, Student s){
        for(Course c : courses){
            if(cName == c.name)
                c.addStudent(s);
        }
    }

    //2.4.3
    public void listStudentsInCourse(String cName){
        for(Course c : courses){
            if(cName == c.name)
                for(Student s: c.students){
                    System.out.println(s);
                }
        }
    }

    //2.4.4
    public float averageGrade(String cName){

        for(Course c : courses){
            if(cName == c.name){
                int length = c.students.length;
                int grade = 0;
                for(Student s: c.students){
                    grade += s.grade;
                }
                return grade/length;
            }

        }
        return 0;
    }
    //2.4.5
    public float averageGradeByProfessor(String professorName){
        int length = 0;
        int grade = 0;
        for(Course c : courses){
            if(professorName == c.teacher.getFullName()){
                for(Student s: c.students){
                    length++;
                    grade += s.grade;
                }
            }
        }
        return grade/length;
    }
}
