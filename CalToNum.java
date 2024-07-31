import java.util.Scanner;
public class CalToNum {
    public static void main(String[] args) {
        int num1,num2,choice,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Addition +");
        System.out.println("2.Multiplication *");
        System.out.println("3.Division /");
        System.out.println("4.Subtraction -");
        System.out.print("Please select a calculation program: ");
        choice = scanner.nextInt();
        System.out.println("Please enter numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 4:
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            default:
                System.out.println("that's not 1 , 2 , 3 , 4");
        }
    }
}
