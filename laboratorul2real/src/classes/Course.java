package classes;
public class Course implements CourseOperations {
    String name;
    String description;
    Professor teacher;
    Student[] students;

    public void UpdateProfessor(Professor professor){

    }
    public void AddStudent (Student student){

    }
    public void RemoveStudent (Student student){
        Student [] studentsAux = new Student[students.length-1];
        for(int i=0; i<students.length; i++){
            if(student != students[i]){
                studentsAux[i] = students[i];
            }
        }
        System.arraycopy(studentsAux, 0, students, 0 ,students.length-1);
    }
    public void UpdateStudent (Student student){
        for(Student s: students){
            if(student == s){
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
        this.students = new Student[]{};
    }

    public Course(String name, String description, Professor teacher , Student[] students){
         this.name=name;
         this.description=description;
         this.teacher=teacher;
         this.students=students;
    }
    public void updateProfessor(Professor teacher) {
        this.teacher = teacher;
    }
    public void addStudent(Student student) {
        int newLenght = students.length + 1;
        Student[] aux = new Student[newLenght];
        int index = 0;
        for(Student s : students){
            aux[index++] = s;
        }

        aux[index] = student;
        this.students = new Student[newLenght];
        System.arraycopy(aux, 0,students, 0 ,newLenght);
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