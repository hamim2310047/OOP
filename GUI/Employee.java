import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    String name;
    String id;
    double score;
    Employee(String name, String id, double score){
        this.name=name;
        this.id=id;
        this.score=score;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Employee[] e= new Employee[n];
        double [] s = new double[6];
        double sum=0;
        for (int i = 0; i < n; i++) {
            e[i].name= sc.nextLine();
            e[i].id=sc.nextLine();
            for (int j = 0; j < 6; j++) {
                s[j]= sc.nextDouble();
                sum+=s[j];
            }
            e[i].score=sum/6;
        }
        sc.close();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("//output.txt"));
            for (int i = 0; i < n; i++) {
                bw.write(e[i].name);
                bw.write(e[i].id);
                bw.write(String.valueOf(e[i].score));
            }
            bw.close();
            ArrayList<Employee> list= new ArrayList<Employee>();
            BufferedReader br= new BufferedReader(new FileReader("//output.txt"));
            String line="";
            while ((line=br.readLine())!=null) {
                String name=br.readLine();
                String id=br.readLine();
                double score = Double.parseDouble(br.readLine());
                list.add(new Employee(name, id, score));
            }
            br.close();
            BufferedWriter b= new BufferedWriter(new FileWriter("//increment.txt"));
            for (Employee employee : list) {
                if (employee.score>75) {
                    
                    b.write(employee.name);
                }
            }
            b.close();

        } catch (Exception E) {
           System.out.println(E.getMessage());
           E.printStackTrace();
        }
    }
}
