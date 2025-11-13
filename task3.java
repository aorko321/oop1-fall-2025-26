import java.util.Scanner;
public class task3 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature in Celcius: ");
    double c = sc.nextDouble();
    double f = (c*1.8)+32;
    System.out.println("Temperature in Fahrenheit is: "+f);
    }
}