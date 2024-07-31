import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        int number;
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter 1, 2, or 3 : ");
        number = Keyboard.nextInt();
        switch (number) {
            case 1: //number = 1
                System.out.println("Your Enter 1.");
                break;
            case 2: //number = 2
                System.out.println("Your Enter 2.");
                break;
            case 3: //number = 3
                System.out.println("Your Enter 3.");
                break;
            default:
                System.out.println("that's not 1, 2, or 3");
                break;
        }
    }
}     
