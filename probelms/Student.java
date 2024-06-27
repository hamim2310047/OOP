public class Student {
    public  static void main(String[] args) {

        StudentInfo[]st = new StudentInfo[3];
        st[0]= new StudentInfo("Hamim", new float[]{18,19,20});
        st[1]= new StudentInfo("Tanvir", new float[]{20,20,20});
        st[2]= new StudentInfo("Fayez", new float[]{18,20,20});
        for (int i = 0; i < st.length; i++) {
            st[i].display();
        }
        float[] Avg= new float[3];
        for (int i = 0; i < st.length; i++) {
            Avg[i]= st[i].average();
            System.out.println(st[i].name + " "+ "got"+ " " + Avg[i]+" "+"marks");
        }
        float max = Avg[0];
        int index = 0;
        for (int i = 0; i < Avg.length; i++) {
            if (max<Avg[i]) {
               max=Avg[i];
               index=i;
            }   
        }
        System.out.println(st[index].name +" "+ "got the highest ct mark");
    }
}
class StudentInfo{
    public String name;
    public float[]CT = new float[3];
    public float sum = 0.0f;
    
    public StudentInfo(String n1,float[] CT){
        this.name=n1;
        for (int i = 0; i < CT.length; i++) {
            this.CT[i] = CT[i];
        }
    }
    public void display(){
        System.out.println("Student details:");
        System.out.println("NAME: "+ name);
        System.out.println("CT marks:");
        for (int i = 0; i < CT.length; i++) {
            System.out.println(CT[i]);
        }
    }
    public float average()
    {
        for (int i = 0; i < CT.length; i++) {
            sum+=CT[i];
        }
        return sum/3;
    }
}