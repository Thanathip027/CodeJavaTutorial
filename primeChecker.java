import java.util.*;
public class primeChecker {
    public static void main(String[] args) {
        int number;
        Scanner input; 
        input = new Scanner(System.in);
        System.out.print("what number would you like to test? : ");
        number = input.nextInt();
        if(isPrime(number)){
            System.out.println(number + "is a prime number.");
        }else{
            System.out.println("is not in prime");
        }
    }
    public static boolean isPrime(int p){
        if (p <= 1) {
            return false;
        }else if(p == 2){
            return true;
        }else if(p % 2 == 0){
            return false;
        }
        for(int i = 1; i <= p; i += 2){
            if(p % i == 0){
                return false;
            }
        }
        return true;
    }
}
