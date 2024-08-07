public class PassElements {
    public static void main(String[] args) {
        int[] number = {5,10,15,20,25,30,35,40};
        for(int index = 0; index < number.length; index++){
            showValue(number[index]);
        }
    }
    public static void showValue(int n){
        System.out.println(n + " ");
    }
}