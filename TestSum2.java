public class TestSum2 {
    public static void main(String[] args) {
        int i,sum=0;
        for(i = 1; i <= 100; i++){
            if((i % 3)==0 || (i % 5)==0){
                if(((i % 3)==0) || ((i % 3)==0)){
                    System.out.println(i + "");
                    sum += 1;
                }
            }else{

            }
        }
        System.out.println("total result: " + sum);
    }
}
