import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        /*
        1.nextByte() ชนิดข้อมูลแบบ Byte
        2.nextDouble() ชนิดข้อมูลแบบ Double
        3.nextFloat() ชนิดข้อมูลแบบ Float
        4.nextInt() ชนิดข้อมูลแบบ Int
        5.nextLine() ชนิดข้อมูลแบบ String
        6.nextLong() ชนิดข้อมูลแบบ Long
        7.nextShort() ชนิดข้อมูลแบบ Short
         */
        String name;
        int hours;
        double payRate;
        double grossPay;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? : ");
        name = keyboard.nextLine();
        System.out.print("How many houer dis you work this week? : ");
        hours = keyboard.nextInt();
        System.out.print("what is your hourly pay rate? : ");
        payRate = keyboard.nextDouble();
        grossPay = hours * payRate;
        System.out.print("Hello" + name);
        System.out.print("Your gross pay is " + grossPay);
    }
}
