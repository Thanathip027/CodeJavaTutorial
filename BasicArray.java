public class BasicArray {
    public static void main(String[] args) {
        final int LIMIT = 15, MUTTPLE = 10;
        int[] list = new int[LIMIT];
        int sum = 0;
        for(int index  = 0; index < LIMIT; index++){
            list[index] = index * MUTTPLE;
        }
        list[5] = 999;
        for(int value : list){
            System.out.print(value + " ");
        }
        for(int value : list){
            sum += value;
        }
        System.out.println("sum = : " + sum);
    }
}
