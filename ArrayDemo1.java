import java.util.Scanner;
public class ArrayDemo1 {
     public static void main(String[] args) {
        final int EMOLOYEES = 3;
        int[] hours = new int [EMOLOYEES];
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the hours Worker by "+ EMOLOYEES + "employess.");
        for(int index = 0; index < EMOLOYEES; index++){
            System.out.print("Employess"+(index + 1)+" : ");
            hours[index] = in.nextInt();
        }
        System.out.println("The hourss your Enterred are : ");
        for(int index = 0; index < EMOLOYEES; index++){
            System.out.println(hours[index]);
        }
    }
}
