import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        double raius;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radis : ");
        raius = in.nextDouble();
        if(raius < 0)
        System.out.println("Error: Radius be >= 0");
        else{
            double area = 3.141 * raius * raius;
            System.out.println("Teh area is " + area);
        }
    }
}
