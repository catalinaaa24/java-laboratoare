package classes;

import java.util.ArrayList;

public class CourseManager implements ManagerCourseOperations {
     ArrayList<Course> courses;
    public CourseManager(){
        courses = new ArrayList<Course>(0) ;
    }

    public void AddCourse(Course course){
        courses.add(course);
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
                c.AddStudent(s);
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
                int length = c.students.size();
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

    public void UpdateCourse(Course course){
        for(int i=0; i<courses.size() ; i++){
            if(courses.get(i).name == course.name)
                courses.get(i).UpdateCourse(course.name ,course.description);
        }
    }
    public void DeleteCourse(Course course){
        ArrayList<Course> aux=new ArrayList<Course>(0);

        for(Course c: courses){
            if(course.name != c.name)
                aux.add(c);
        }
        this.courses = new ArrayList<Course>(0);
        courses.addAll(aux);
    }
}
