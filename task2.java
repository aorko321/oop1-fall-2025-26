import java.util.Scanner;
public class task2 {
     public static void main (String[] args) {
        float price = 250;
        float dis = price*0.14;
        float fin = price-dis;
        System.out.print("Enter number of products worth 250/-: ");
      Scanner sc = new Scanner(System.in);
      float q = sc.nextFloat();
         System.out.print("Total price with discounts applied: "+(fin*q));
     }
}