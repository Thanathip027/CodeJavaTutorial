import java.util.*;
public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int[] number = new int[ARRAY_SIZE];
        getValues(number);
        System.out.println("Har are the number you enter : ");
        showArray(number);
    }
    public static void getValues(int[] array){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter aseries of " + array.length + "numbers.");
        for(int index = 0; index < array.length; index++){
            System.out.print("Enter number " + (index + 1) + " : ");
            array[index] = in.nextInt();
        }
    }
    public static void showArray(int[] array){
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
    }
}
