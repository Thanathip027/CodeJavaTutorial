import java.util.*;
public class PayArray {
    public static void main(String[] args) {
        final int EMOLOYEES = 5;
        double PayRatge;
        double grossPay;
        int[] hors = new int [EMOLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours Worked by " + EMOLOYEES + "employess who all earn");
        for(int index = 0; index < EMOLOYEES; index++){
            System.out.print("Employees #" + (index + 1) + ":");
            hors[index] = in.nextInt();
        }
        System.out.print("Enter the hourly pay rate for each employees: ");
        PayRatge = in.nextDouble();
        for(int index = 0; index < EMOLOYEES; index++){
            grossPay = hors[index] + PayRatge;
            System.out.println("Employees #" + (index + 1) + ": $ " + grossPay);
        }
    }
}
