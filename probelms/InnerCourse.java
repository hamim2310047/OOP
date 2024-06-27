class Course {
    public int ID;
    public String name;
    public String instructor;
    public int Maximum_student;
    public int cureent_student;
    public int [] Array;

    public Course(int id, String name, String instructor, int max){
        this.ID=id;
        this.name=name;
        this.instructor=instructor;
        this.Maximum_student=max;
        this.cureent_student=0;
        this.Array = new int[Maximum_student];
    }
    public void enrolledStudent(int st_id){
        if (cureent_student<Maximum_student) 
        {
          Array[cureent_student] = st_id;
          cureent_student++;
        }
    }
    public void displayCourseinfo(){
        System.out.println("COurse id: "+ ID);
        System.out.println("Course name: "+name);
        System.out.println("Instructor: "+ instructor);
        System.out.println("Maximum student: "+Maximum_student);
        System.out.println("Current Student: "+ cureent_student);
        System.out.println("Enrolled student ids: ");
         for (int i = 0; i < cureent_student; i++) {
            System.out.println(Array[i]);
        }
        
    }
}
public class InnerCourse {

    public static void main(String[] args) {
        Course[] C = new Course[5];
        C[0]= new Course(1,"DM", "Tanvir Uthsaw", 35);
        C[1] = new Course(2, "SPL", "Mamum Elahi", 40);
        C[2]= new Course(3, "OOP", "Sadia Islam", 40);
        C[3]= new Course(4, "DLD", "Salekul Islam", 35);
        C[4]= new Course(4, "Calculus", "Nasrina Parvin", 40);
        
        C[0].enrolledStudent(101);
        C[1].enrolledStudent(102);
        C[2].enrolledStudent(103);
        C[3].enrolledStudent(104);
        C[4].enrolledStudent(105);
        C[0].enrolledStudent(106);
        C[3].enrolledStudent(107);
        C[0].enrolledStudent(108);
        C[2].enrolledStudent(109);

        for (int i = 0; i < C.length; i++) {
            C[i].displayCourseinfo();
        }

    }
}