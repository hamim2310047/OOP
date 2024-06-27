class Student{
    int id;
    String name;
    float cgpa;
    Student(String name, float cgpa){
        this.name=name;
        this.cgpa=cgpa;
    }
}

class school{
    Student[] students;
    school(){
        students=new Student[3];
        students.
    }
    void addStudent(int id, String name, float cgpa){
        students[id]= new Student(name, cgpa);
    }
    void updateStudent(int id, float new_cgpa){
        students[id].cgpa=new_cgpa;
    }
}