import java.util.Scanner;
public class task1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for student 1: ");
        float m1 = sc.nextFloat();

        System.out.println("Enter marks for student 2: ");
        float m2 = sc.nextFloat();

        System.out.println("Enter marks for student 3: ");
        float m3 = sc.nextFloat();

        float avg = (m1+m2+m3)/3 ;
        System.out.println("Average marks of the three: "+avg);
        
    }
}