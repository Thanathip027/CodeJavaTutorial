import java.util.Scanner;
public class calnum {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in); //step2 สร้างออฟเจ็กต์ in สำหรับรับข้อมูล
        System.out.print("Input Number1 : ");
        x = in.nextInt(); //step3 รับจำนวนเต็มเก็บในตัวแปร x
        System.out.println("your number is " +x);
        System.out.print("Input Number2 : ");
        y = in.nextInt(); //step4 รับจำนวนเต็มเก็บในตัวแปร y
        System.out.println("your number is " +y);
        System.out.println(x+ " + " + y + " = " +(x+y));
    }
}
